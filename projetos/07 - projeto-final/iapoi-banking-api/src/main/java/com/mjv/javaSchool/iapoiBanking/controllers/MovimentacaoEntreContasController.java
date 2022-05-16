//package com.mjv.javaSchool.iapoiBanking.controllers;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacaoEntreContas;
//import com.mjv.javaSchool.iapoiBanking.models.Movimentacao;
//import com.mjv.javaSchool.iapoiBanking.repositorys.MovimentacaoRepository;
//import com.mjv.javaSchool.iapoiBanking.services.GerarNovaMovimentacaoEntreContasService;
//
//@RestController
//@RequestMapping("/movimentacao")
//public class MovimentacaoEntreContasController {
//	
//	@Autowired
//	private GerarNovaMovimentacaoEntreContasService service;
//	
//	@Autowired
//	private MovimentacaoRepository repository;
//	
//	// CRUD
//
//	//POST
//	@PostMapping("{id}")
//	public void gerarMovimentacao(@RequestBody NovaMovimentacaoEntreContas movimentacao) {
//		service.GerarNovaMovimentacaoEntreContas(movimentacao);;
//	}
//	
//	@GetMapping("/{idConta}")
//	public List<Movimentacao> findAll(Integer idConta){
//		return repository.buscarMovimentacaoIdConta(idConta);
//	}
//}
