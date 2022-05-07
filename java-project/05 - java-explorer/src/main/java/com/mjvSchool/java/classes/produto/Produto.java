package com.mjvSchool.java.classes.produto;

public class Produto {

	String nome;
	double preco;
	static final double DESCONTO = 0.25;
	
	Produto () {
		
	}
	
	Produto (String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto () {
		return preco * (1-DESCONTO);
	}
}
	
