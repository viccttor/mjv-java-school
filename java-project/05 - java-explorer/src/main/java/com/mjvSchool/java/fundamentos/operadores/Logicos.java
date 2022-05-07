package com.mjvSchool.java.fundamentos.operadores;

/**
 * @author viccttor
 */

/*
 * Operadores l�gicos
 * 
 * E = &&, precisa que as condi��es sejam iguais
 * OU - ||, precisa que uma das condi��es
 * XOR - ^(ou exclusivo), precisa que a condi��o seja invertida e n�o, igual
 * Nega��o - !, inverte a condi��o
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
		
		System.out.println("\nTabela da Nega��o(operador Unin�rio)");
		System.out.println(!true );
		System.out.println(!false);
	}
}
