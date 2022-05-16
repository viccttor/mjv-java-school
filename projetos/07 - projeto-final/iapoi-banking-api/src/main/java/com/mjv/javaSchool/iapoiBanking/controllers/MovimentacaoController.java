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
import com.mjv.javaSchool.iapoiBanking.services.GerarNovaMovimentacaoService;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private GerarNovaMovimentacaoService service;
	
	//POST
	
	@PostMapping
	public void gerarMovimentacao(@RequestBody NovaMovimentacao movimentacao) {
		service.GerarNovaMovimentacao(movimentacao);;
	}
	
	@PostMapping("{conta_id}")
	public void gerarMovimentacao(@RequestBody NovaMovimentacaoEntreContas movimentacao) {
		service.GerarNovaMovimentacaoEntreContas(movimentacao);;
	}
	
	//GET
	
	@GetMapping
	public List<Movimentacao> listarMovimentacao(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public List<Movimentacao> listarMovimentacaoPorConta(Integer id){
		return repository.findByIdConta(id);
	}
}
