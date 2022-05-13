package com.mjv.projetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetoFinal.model.cadastro.Cliente;
import com.mjv.projetoFinal.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired	//repositorio
	private ClienteRepository repository;
	
	@PostMapping
	public void gravar(@RequestBody Cliente cliente) {
		repository.save(cliente);
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return repository.findAll();
	}

}
