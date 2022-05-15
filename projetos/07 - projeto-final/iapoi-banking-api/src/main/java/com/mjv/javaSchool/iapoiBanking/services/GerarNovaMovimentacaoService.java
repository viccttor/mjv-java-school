package com.mjv.javaSchool.iapoiBanking.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.models.Cliente;
import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;
import com.mjv.javaSchool.iapoiBanking.models.TipoMovimentacao;
import com.mjv.javaSchool.iapoiBanking.repositorys.ClienteRepository;
import com.mjv.javaSchool.iapoiBanking.repositorys.MovimentacaoRepository;

@Service
public class GerarNovaMovimentacaoService {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public void GerarNovaMovimentacao(NovaMovimentacao novaMovimentacao) {
		
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setFormaMovimentacao(novaMovimentacao.getFormaMovimentacao());
		movimentacao.setTipoMovimentacao(novaMovimentacao.getTipoMovimentacao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		
		Double valor = novaMovimentacao.getTipoMovimentacao() == TipoMovimentacao.RECEITA ?  novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1; 
		movimentacao.setValor(valor);
		Cliente cliente = clienteRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		if(cliente != null) {
			cliente.getConta().setSaldo(cliente.getConta().getSaldo()+valor);; 
		}
		
		clienteRepository.save(cliente);
		repository.save(movimentacao);
	}

}
