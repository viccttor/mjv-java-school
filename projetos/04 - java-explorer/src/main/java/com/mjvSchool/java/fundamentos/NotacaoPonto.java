package com.mjvSchool.java.fundamentos;

/**
 * @author viccttor
 */

/*
 * Algumas funções da String.
 * 
*/

public class NotacaoPonto {

	public static void main(String[] args) {
		
// Tipos primitivos não tem operador "."
		
		String s = "texto #";
		
		s = s.replace("#", "\nFrase");
		// variavel.replace, substitui algo dentro da variável. Ou seja vai pegar o # e alterar para Frase.
		s = s.toUpperCase();
		// variavel.toUpperCase converte tudo para maiúsculo. Poreém não subistitui a varial. Por isso tem que ficar dessa forma a cima.
		s = s.concat(" !!!");
		// Concatenar outra String
		System.out.println(s);
		
		//Outra forma de fazer
		
		System.out.println("victor".toUpperCase());
		
		
		String y = "texto #".replace("#", "\nFrase").toUpperCase().concat(" !!!");
		System.out.println(y);

	}

}
