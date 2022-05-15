package com.mjv.javaSchool.iapoiBanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacaoEntreContas;
import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;
import com.mjv.javaSchool.iapoiBanking.repositorys.MovimentacaoRepository;
import com.mjv.javaSchool.iapoiBanking.services.GerarNovaMovimentacaoEntreContasService;
import com.mjv.javaSchool.iapoiBanking.services.GerarNovaMovimentacaoService;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private GerarNovaMovimentacaoService service;
	
	@Autowired
	private GerarNovaMovimentacaoEntreContasService serviceEntreContas;
	
	//POST
	@RequestMapping(name = "Movimentacao" ,value = "/movimentacao{transferencia-pagamento}", method = RequestMethod.POST)
	public void gerarMovimentacao(@RequestBody NovaMovimentacao movimentacao) {
		service.GerarNovaMovimentacao(movimentacao);;
	}
	
	//POST
	@RequestMapping(name = "Movimentacao Entre Contas" ,value = "/movimentacao/{Entre-Contas}", method = RequestMethod.POST)
	public void gerarMovimentacao(@RequestBody NovaMovimentacaoEntreContas movimentacao) {
		serviceEntreContas.GerarNovaMovimentacao(movimentacao);;
	}
	
	
	//GET
	@RequestMapping(name = "Listar Movimentacões" ,value = "/movimentacao{toda-movimentacao}", method = RequestMethod.GET)
	public List<Movimentacao> listarMovimentacao(Integer id){
		return repository.findAll();
	}
	
	
}
