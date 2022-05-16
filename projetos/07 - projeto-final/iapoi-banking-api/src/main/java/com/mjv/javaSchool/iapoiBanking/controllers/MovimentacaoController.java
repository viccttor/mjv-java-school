package com.mjv.javaSchool.iapoiBanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@PostMapping
	public void gerarMovimentacao(@RequestBody NovaMovimentacao movimentacao) {
		service.GerarNovaMovimentacao(movimentacao);;
	}
	
	@PostMapping("{id}")
	public void gerarMovimentacao(@RequestBody NovaMovimentacaoEntreContas movimentacao) {
		serviceEntreContas.GerarNovaMovimentacaoEntreContas(movimentacao);;
	}
	
	//GET
	
	@GetMapping
	public List<Movimentacao> listarMovimentacao(){
		return repository.findAll();
	}
	
//	@GetMapping("/{idConta}")
//	public List<Movimentacao> findAll(Integer idConta){
//		return repository.buscarMovimentacaoIdConta(idConta);
//	}
}
