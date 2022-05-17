package com.mjv.javaSchool.iapoiBanking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.javaSchool.iapoiBanking.models.Endereco;
import com.mjv.javaSchool.iapoiBanking.repositorys.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
	// PUT
	@Autowired
	private EnderecoRepository repository;
	
	//PUT
	@PutMapping
	public void alterarCliente(@RequestBody Endereco endereco) {
		repository.save(endereco);
	}
	
}
