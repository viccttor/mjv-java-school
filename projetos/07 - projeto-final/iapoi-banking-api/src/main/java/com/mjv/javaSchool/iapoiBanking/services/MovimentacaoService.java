package com.mjv.javaSchool.iapoiBanking.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacaoEntreContas;
import com.mjv.javaSchool.iapoiBanking.models.Cliente;
import com.mjv.javaSchool.iapoiBanking.models.Conta;
import com.mjv.javaSchool.iapoiBanking.models.FormaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;
import com.mjv.javaSchool.iapoiBanking.models.TipoMovimentacao;
import com.mjv.javaSchool.iapoiBanking.repositorys.ClienteRepository;
import com.mjv.javaSchool.iapoiBanking.repositorys.MovimentacaoRepository;

@Service
public class MovimentacaoService {

	@Autowired
	private MovimentacaoRepository movimentacaoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	public void GerarNovaMovimentacao(NovaMovimentacao novaMovimentacao) {

		Movimentacao movimentacao = new Movimentacao();

		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setFormaMovimentacao(novaMovimentacao.getFormaMovimentacao());
		movimentacao.setTipoMovimentacao(novaMovimentacao.getTipoMovimentacao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());

		Double valor = novaMovimentacao.getTipoMovimentacao() == TipoMovimentacao.RECEITA ? novaMovimentacao.getValor()
				: novaMovimentacao.getValor() * -1;
		movimentacao.setValor(valor);
		Cliente cliente = clienteRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		if (cliente != null) {
			cliente.getConta().setSaldo(cliente.getConta().getSaldo() + valor);
			;
		}

		clienteRepository.save(cliente);
		movimentacaoRepository.save(movimentacao);
	}

	public void GerarNovaMovimentacaoEntreContas(NovaMovimentacaoEntreContas novaMovimentacaoEntreContas) {

		Cliente clientePagador = clienteRepository.findById(novaMovimentacaoEntreContas.getIdContaPagadora())
				.orElse(null);
		Cliente clienteRecebedor = clienteRepository.findById(novaMovimentacaoEntreContas.getIdContaRecebedora())
				.orElse(null);

		if (clientePagador != null && clienteRecebedor != null) {

			LocalDateTime dataHora = LocalDateTime.now();
			String descricaoPagador = novaMovimentacaoEntreContas.getDescricaoPagador();
			String descricaoRecebedor = novaMovimentacaoEntreContas.getDescricaoRecebedor();
			Double valor = novaMovimentacaoEntreContas.getValor();

			Movimentacao movimentacaoPagador = new Movimentacao();
			movimentacaoPagador.setDataHora(dataHora);
			movimentacaoPagador.setDescricao(descricaoPagador);
			movimentacaoPagador.setFormaMovimentacao(FormaMovimentacao.TRANSFERENCIA);
			movimentacaoPagador.setTipoMovimentacao(TipoMovimentacao.DESPESA);
			movimentacaoPagador.setValor(valor * -1);
			clientePagador.getConta().setSaldo(clientePagador.getConta().getSaldo() - valor);
			movimentacaoPagador.setIdConta(novaMovimentacaoEntreContas.getIdContaPagadora());
			clienteRepository.save(clientePagador);
			movimentacaoRepository.save(movimentacaoPagador);

			Movimentacao movimentacaoRecebedor = new Movimentacao();
			movimentacaoRecebedor.setDataHora(dataHora);
			movimentacaoRecebedor.setDescricao(descricaoRecebedor);
			movimentacaoRecebedor.setFormaMovimentacao(FormaMovimentacao.TRANSFERENCIA);
			movimentacaoRecebedor.setTipoMovimentacao(TipoMovimentacao.RECEITA);
			movimentacaoRecebedor.setValor(valor);
			clienteRecebedor.getConta().setSaldo(clienteRecebedor.getConta().getSaldo() + valor);
			movimentacaoRecebedor.setIdConta(novaMovimentacaoEntreContas.getIdContaRecebedora());
			clienteRepository.save(clienteRecebedor);
			movimentacaoRepository.save(movimentacaoRecebedor);
		}

	}
	
	public void saque(Integer id, Double saque) {
		
		Cliente cliente = clienteRepository.findById(id).orElse(null);
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
			
			clienteRepository.save(cliente);
			movimentacaoRepository.save(movimentacaoSaque);

		}
	}

}
