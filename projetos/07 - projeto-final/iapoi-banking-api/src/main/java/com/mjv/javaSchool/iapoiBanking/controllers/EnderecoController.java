package com.mjv.javaSchool.iapoiBanking.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.javaSchool.iapoiBanking.models.Endereco;
import com.mjv.javaSchool.iapoiBanking.repositorys.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoRepository repository;
	
	// GET
	@GetMapping
	public List<Endereco> buscarEnderecos() {
		return repository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Endereco>  buscarEnderecosId(Integer id) {
		return repository.findById(id);
	}

	// PUT
	@PutMapping("{alterar_endereco}")
	public void alterarCliente(@RequestBody Endereco endereco) {
		repository.save(endereco);
	}

}
