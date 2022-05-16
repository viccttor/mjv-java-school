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
import com.mjv.javaSchool.iapoiBanking.services.GerarNovoClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private GerarNovoClienteService service;
	
	// CRUD
	
	// Gravar
	@PostMapping
	public void cadastrarCliente(@RequestBody NovoCliente cliente) {
		service.cadastraNovoCliente(cliente);
	}
	
	// GET
	
	@GetMapping
	public List<Cliente> listarCliente(){
		return repository.findAll();
	}
	
//	@GetMapping("/{id}")
//	public Optional<Cliente> buscarCliente(Integer id){
//		return repository.findById(id);
//	}
	
	@GetMapping("/{id}")
	public Double saldoCliente(Integer id){
		Cliente conta = service.buscarSaldo(id);
		return conta.getConta().getSaldo();
	}
	
	// Alterar
//	@PutMapping
//	public void alterarCliente(Integer id) {
//		repository.
//	}
	
	// Deletar
	@DeleteMapping
	public void deletarCliente(Integer id) {
		repository.deleteById(id);
	}
	
	
}
