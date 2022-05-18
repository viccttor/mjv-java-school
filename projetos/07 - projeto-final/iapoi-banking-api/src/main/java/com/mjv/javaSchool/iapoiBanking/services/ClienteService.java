package com.mjv.javaSchool.iapoiBanking.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.javaSchool.iapoiBanking.dtos.NovoCliente;
import com.mjv.javaSchool.iapoiBanking.models.Cliente;
import com.mjv.javaSchool.iapoiBanking.models.Conta;
import com.mjv.javaSchool.iapoiBanking.models.Endereco;
import com.mjv.javaSchool.iapoiBanking.repositorys.ClienteRepository;
import com.mjv.javaSchool.iapoiBanking.util.FormatadorUtil;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	public void cadastrarNovoCliente(NovoCliente novoCliente) {
		Cliente cliente = new Cliente();
		cliente.setNome(novoCliente.getNome());
		cliente.setCpf(FormatadorUtil.formatarCpfdB(novoCliente.getCpf()));
		
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
	
}
