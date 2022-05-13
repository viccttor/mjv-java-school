package com.mjvSchool.stringBuilder;

public class StringBuilderExemplo01 {

	public static void main(String[] args) {

		StringBuilder nomes = new StringBuilder();
		nomes.append("Victor ").append("Henrique ").append("Silva ").append(" De Morais");
		
		// Precisa converter para String para poder mostrar todos juntos
		System.out.println(nomes.toString());
		
		// Mostra a quantidade de caracteres
		System.out.println(nomes.length());

		// Mostra a quantidade de carcater que pode ser armazenado sem adicionar memória
		System.out.println(nomes.capacity());
		
		// Delimita a quantidade de caracteres
		nomes.setLength(10);
		System.out.println(nomes.toString());
		
		// Seta um caracter pela posicao
		nomes.setCharAt(1, 'V');;
		System.out.println(nomes.toString());
		
	}

}
