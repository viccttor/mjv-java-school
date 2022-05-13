package com.mjv.projetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mjv.projetoFinal.model.cadastro.Cliente;
import com.mjv.projetoFinal.model.pedido.Pedido;

public class PedidoController {
	@Autowired	//repositorio
	private PedidoRepository repository;
	
	@PostMapping
	public void gravar(@RequestBody Pedido pedido) {
		repository.save(pedido);
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return repository.findAll();
	}

}

