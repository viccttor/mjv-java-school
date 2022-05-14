package br.com.mjv.javaSchool.iapoiBanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mjv.javaSchool.iapoiBanking.model.Cliente;
import br.com.mjv.javaSchool.iapoiBanking.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository repository;
	
	// CRUD
	
	// Gravar
	@PostMapping
	public void cadastrarCliente(@RequestBody Cliente cliente) {
		repository.save(cliente);
	}
	
	// Buscar
	@GetMapping
	public List<Cliente> listarCliente(){
		return repository.findAll();
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
