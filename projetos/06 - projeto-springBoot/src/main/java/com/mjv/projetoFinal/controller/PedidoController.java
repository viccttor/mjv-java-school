package com.mjv.projetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetoFinal.model.pedido.Pedido;
import com.mjv.projetoFinal.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	@Autowired	//repositorio
	private PedidoRepository repository;
	
	@PostMapping
	public void gravar(@RequestBody Pedido pedido) {
		repository.save(pedido);
	}
	
	@GetMapping
	public List<Pedido> listar(){
		return repository.findAll();
	}

}

