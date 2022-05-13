package com.mjv.pedidoFast.repository;

import java.util.HashMap;
import java.util.Map;

import com.mjv.pedidoFast.model.cadastro.Produto;

public class ProdutoFakeRepository {
	private Map<Integer, Produto> produtos = new HashMap();
	public ProdutoFakeRepository() {
		Produto cocaCola = new Produto();
		cocaCola.setDescricao("COCA COLA LATA 350ml");
		cocaCola.setId(1);
		cocaCola.setPrecoVenda(3.75);
		cocaCola.setSaldo(13.0);
		produtos.put(1, cocaCola);
		
		Produto pizza = new Produto();
		pizza.setDescricao("PIZZA DOBRADA 4 QUEIJOS");
		pizza.setId(2);
		pizza.setPrecoVenda(7.40);
		pizza.setSaldo(8.0);
		produtos.put(2, pizza);
	}
	
	public Produto buscarPorId(Integer id) {
		return produtos.get(id);
	}
}
