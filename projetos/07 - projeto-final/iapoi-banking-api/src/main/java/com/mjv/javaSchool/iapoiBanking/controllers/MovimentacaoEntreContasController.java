//package com.mjv.javaSchool.iapoiBanking.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.mjv.javaSchool.iapoiBanking.dtos.NovaMovimentacaoEntreContas;
//import com.mjv.javaSchool.iapoiBanking.services.GerarNovaMovimentacaoEntreContasService;
//
//@RestController
//@RequestMapping("/movimentacao")
//public class MovimentacaoEntreContasController {
//	
//	@Autowired
//	private GerarNovaMovimentacaoEntreContasService service;
//	
//	// CRUD
//	
//	//POST
//	@PostMapping
//	public void gerarMovimentacao(@RequestBody NovaMovimentacaoEntreContas movimentacao) {
//		service.GerarNovaMovimentacao(movimentacao);;
//	}
//	
//}
