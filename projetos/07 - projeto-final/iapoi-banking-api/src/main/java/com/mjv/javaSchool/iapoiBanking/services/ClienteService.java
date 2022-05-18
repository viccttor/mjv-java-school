package com.mjv.javaSchool.iapoiBanking.services;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.javaSchool.iapoiBanking.dtos.NovoCliente;
import com.mjv.javaSchool.iapoiBanking.models.Cliente;
import com.mjv.javaSchool.iapoiBanking.models.Conta;
import com.mjv.javaSchool.iapoiBanking.models.Endereco;
import com.mjv.javaSchool.iapoiBanking.models.FormaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;
import com.mjv.javaSchool.iapoiBanking.models.TipoMovimentacao;
import com.mjv.javaSchool.iapoiBanking.repositorys.ClienteRepository;
import com.mjv.javaSchool.iapoiBanking.repositorys.MovimentacaoRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	public void cadastrarNovoCliente(NovoCliente novoCliente) {
		Cliente cliente = new Cliente();
		cliente.setNome(novoCliente.getNome());
		cliente.setCpf(novoCliente.getCpf());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		cliente.setConta(conta);
		
		Endereco endereco = new Endereco();
		endereco.setCep(novoCliente.getEndereco().getCep());
		endereco.setCidade(novoCliente.getEndereco().getCidade());
		endereco.setEstado(novoCliente.getEndereco().getEstado());
		endereco.setBairro(novoCliente.getEndereco().getBairro());
		endereco.setLogradouro(novoCliente.getEndereco().getLogradouro());
		endereco.setNumero(novoCliente.getEndereco().getNumero());
		cliente.setEndereco(endereco);
		
		repository.save(cliente);
	}
	
	
	public List<Cliente> lisarClientes(){
		return repository.findAll();
	}
	
	public Double buscarSaldoCliente(Integer id) {
		Conta conta = repository.getById(id).getConta();
		return conta.getSaldo();
	}
	
	public List<Cliente> buscarCliente(String cpf){
		return repository.findByCpf(cpf);
	}
	
	public void saque(Integer id, Double saque) {
		
		Cliente cliente = repository.findById(id).orElse(null);
		Conta conta = cliente.getConta();
		Double valorSaque = saque;
		Double saldo = conta.getSaldo();
		Double resultado = saldo - valorSaque;

		if (cliente != null && saque >= 0 && resultado >= 0) {
			Movimentacao movimentacaoSaque = new Movimentacao();
			movimentacaoSaque.setDataHora(LocalDateTime.now());
			movimentacaoSaque.setDescricao("SAQUE EM CAIXA ELETRÔNICO");
			movimentacaoSaque.setFormaMovimentacao(FormaMovimentacao.SAQUE);
			movimentacaoSaque.setIdConta(cliente.getId());
			movimentacaoSaque.setTipoMovimentacao(TipoMovimentacao.DESPESA);
			movimentacaoSaque.setValor(valorSaque * -1);
			
			cliente.getConta().setSaldo(resultado);
			
			repository.save(cliente);
			movimentacaoRepository.save(movimentacaoSaque);

		}
	}
}
