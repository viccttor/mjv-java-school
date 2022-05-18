package com.mjv.javaSchool.iapoiBanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacaoEntreContas;
import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;
import com.mjv.javaSchool.iapoiBanking.repositorys.MovimentacaoRepository;
import com.mjv.javaSchool.iapoiBanking.services.MovimentacaoService;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	//@RequestMapping(method = RequestMethod.POST, value = "/movimentacao")
	@PostMapping
	public void gerarMovimentacao(@RequestBody NovaMovimentacao movimentacao) {
		service.GerarNovaMovimentacao(movimentacao);;
	}
	
	@PostMapping("{conta_id}")
	//@RequestMapping(method = RequestMethod.POST, value = "/movimentacao/Movimentacao_Entre_Contas")
	public void gerarMovimentacao(@RequestBody NovaMovimentacaoEntreContas movimentacao) {
		service.GerarNovaMovimentacaoEntreContas(movimentacao);;
	}
	
	@GetMapping
	//@RequestMapping(method = RequestMethod.GET, value = "/movimentacao")
	public List<Movimentacao> listarMovimentacao(){
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	//@RequestMapping(method = RequestMethod.GET, value = "/movimentacao/{Movimentacao_Por_Conta}")
	public List<Movimentacao> listarMovimentacaoPorConta(Integer id){
		return repository.findByIdConta(id);
	}
	
	//@PostMapping("cliente/{saque}")
	@RequestMapping(method = RequestMethod.POST, path = "cliente/{saque}")
	public void saque(Integer id, Double saque) {
		service.saque(id,saque);	
	} 
	
}
