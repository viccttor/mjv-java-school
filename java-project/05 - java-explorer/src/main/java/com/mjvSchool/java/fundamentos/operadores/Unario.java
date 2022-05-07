package com.mjvSchool.java.fundamentos.operadores;

/**
 * @author viccttor
 */

/*
 * Exemplos com Atribuição com Unários
 * 
*/

public class Unario {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++;    // a = a + 1
		a--;    // a = a - 1
		
		++b;    // b = b + 1
		--b;    // b = b - 1
		
		
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // Porque deu verdadeiro? Por conta da posição do incremento. Se vem antes é executado primeiro, se vem depois, executa depois
		System.out.println(a);
		System.out.println(b);
		

	}

}
