package com.mjvSchool.java.classes.produto;


public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3466.78);
		
		var p2 = new Produto();
		p2.nome = "Caneta Vermelha";
		p2.preco = 2;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		
		
	}
}
