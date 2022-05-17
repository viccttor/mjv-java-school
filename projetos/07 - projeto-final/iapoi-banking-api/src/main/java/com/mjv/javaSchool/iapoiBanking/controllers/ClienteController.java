package com.mjv.javaSchool.iapoiBanking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.javaSchool.iapoiBanking.dtos.NovoCliente;
import com.mjv.javaSchool.iapoiBanking.models.Cliente;
import com.mjv.javaSchool.iapoiBanking.repositorys.ClienteRepository;
import com.mjv.javaSchool.iapoiBanking.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private ClienteService service;
	
	// CRUD
	
	// POST
	@PostMapping
	public void cadastrarCliente(@RequestBody NovoCliente cliente) {
		service.cadastrarNovoCliente(cliente);
	}
	
	// GET
	
	@GetMapping
	public List<Cliente> listarClientes(){
		return service.lisarClientes();
	}
	
	@GetMapping("/{saldo_cliente}")
	public Double saldoCliente(Integer id){
		return service.buscarSaldoCliente(id);
	}
	
	@GetMapping("conta/{cpf}")
	public List<Cliente> buscarCliente(String cpf){
		return service.buscarCliente(cpf);
	}


	// DELETE
	@DeleteMapping
	public void deletarCliente(Integer id) {
		repository.deleteById(id);
	}
	
	
}
