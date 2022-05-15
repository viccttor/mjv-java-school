package com.mjv.javaSchool.iapoiBanking.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacaoEntreContas;
import com.mjv.javaSchool.iapoiBanking.models.Cliente;
import com.mjv.javaSchool.iapoiBanking.models.FormaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;
import com.mjv.javaSchool.iapoiBanking.models.TipoMovimentacao;
import com.mjv.javaSchool.iapoiBanking.repositorys.ClienteRepository;
import com.mjv.javaSchool.iapoiBanking.repositorys.MovimentacaoRepository;

@Service
public class GerarNovaMovimentacaoEntreContasService {

	@Autowired
	private MovimentacaoRepository repository;

	@Autowired
	private ClienteRepository clienteRepository;

	public void GerarNovaMovimentacao(NovaMovimentacaoEntreContas novaMovimentacaoEntreContas) {
		
		Cliente clientePagador = clienteRepository.findById(novaMovimentacaoEntreContas.getIdContaPagadora())
				.orElse(null);
		Cliente clienteRecebedor = clienteRepository.findById(novaMovimentacaoEntreContas.getIdContaRecebedora())
				.orElse(null);

		if (clientePagador != null && clienteRecebedor != null) {
			
			LocalDateTime dataHora = LocalDateTime.now();
			String descricao = novaMovimentacaoEntreContas.getDescricao();
			Double valor = novaMovimentacaoEntreContas.getValor();
			
			Movimentacao movimentacaoPagador = new Movimentacao();
			movimentacaoPagador.setDataHora(dataHora);
			movimentacaoPagador.setDescricao(descricao);
			movimentacaoPagador.setFormaMovimentacao(FormaMovimentacao.TRANSFERENCIA);
			movimentacaoPagador.setTipoMovimentacao(TipoMovimentacao.DESPESA);
			movimentacaoPagador.setValor(valor * -1);
			clientePagador.getConta().setSaldo(clientePagador.getConta().getSaldo() - valor);
			movimentacaoPagador.setIdConta(novaMovimentacaoEntreContas.getIdContaPagadora());
			clienteRepository.save(clientePagador);
			repository.save(movimentacaoPagador);

			
			Movimentacao movimentacaoRecebedor = new Movimentacao();
			movimentacaoRecebedor.setDataHora(dataHora);
			movimentacaoRecebedor.setDescricao(descricao);
			movimentacaoRecebedor.setFormaMovimentacao(FormaMovimentacao.TRANSFERENCIA);
			movimentacaoRecebedor.setTipoMovimentacao(TipoMovimentacao.RECEITA);
			movimentacaoRecebedor.setValor(valor);
			clienteRecebedor.getConta().setSaldo(clienteRecebedor.getConta().getSaldo() + valor);
			movimentacaoRecebedor.setIdConta(novaMovimentacaoEntreContas.getIdContaRecebedora());
			clienteRepository.save(clienteRecebedor);
			repository.save(movimentacaoRecebedor);
		}

	}

}
