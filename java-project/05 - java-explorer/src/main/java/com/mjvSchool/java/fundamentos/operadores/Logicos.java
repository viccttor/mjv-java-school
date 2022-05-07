package com.mjvSchool.java.fundamentos.operadores;

/**
 * @author viccttor
 */

/*
 * Operadores lógicos
 * 
 * E = &&, precisa que as condições sejam iguais
 * OU - ||, precisa que uma das condições
 * XOR - ^(ou exclusivo), precisa que a condição seja invertida e não, igual
 * Negação - !, inverte a condição
 * 
*/

public class Logicos {
	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 3>7;
		
		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!cond1);
		System.out.println(!!cond1);
		
		//Tabela do E
		
		System.out.println("\nTabela do E");
		System.out.println(true  && true);
		//System.out.println(false && true);
		System.out.println(true  && false);
		//System.out.println(false && false);
		
		//Tabela do OU
		
		System.out.println("\nTabela do OU");
		//System.out.println(true  || true);
		System.out.println(false || true);
		//System.out.println(true  || false);
		System.out.println(false || false);
		
		//Tabela do OU Exclusivo
		
		System.out.println("\nTabela do Ou Exclusivo/XOR");
		System.out.println(true  ^ true);
		System.out.println(false ^ true);
		System.out.println(true  ^ false);
		System.out.println(false ^ false);
		
		//Tabela do E
		
		System.out.println("\nTabela da Negação(operador Uninário)");
		System.out.println(!true );
		System.out.println(!false);
	}
}
