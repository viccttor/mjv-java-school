package com.mjv.projetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetoFinal.model.cadastro.Produto;
import com.mjv.projetoFinal.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired	//repositorio
	
	private ProdutoRepository repository;
	
	@PostMapping
	public void gravar(@RequestBody Produto produto) {
		repository.save(produto);
	}
	
	@GetMapping
	public List<Produto> listar(){
		return repository.findAll();
	}

}
