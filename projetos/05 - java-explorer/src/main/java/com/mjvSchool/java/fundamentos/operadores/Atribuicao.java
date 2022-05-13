package com.mjvSchool.java.fundamentos.operadores;

/**
 * @author viccttor
 */

/*
 * Exemplos com Atribuição
 * 
*/


public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 2;
		int b = a;
		int c = a + b;
		
		c += a; // c = c + a
		c -= a; // c = c - a
		c /= a; // c = c / a
		c *= a; // c = c / 
		
		
		System.out.println(c);
		
		c %= 2; // c = c % 2; 0 ou 1
		System.out.println(c);
		
	}

}
