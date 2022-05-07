package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Opera��es For
 * 
 * O for executa em tradu��o literal um trecho de c�odigo enquanto a condi��o imposta na pr�pria condi��o se mantem. 
 * EX: Enquanto  contador2 que � igual a 0 for menor que 10, fa�a,  contador2 mais opera��o, execute BOM dia
 * ou seja define a quantidade da variavel de controle, estabele a condi��o e a varia��o da vari�vel.
 * 
 * FOR  � focado em um processo pre-definido de repeti��es
 */

public class For1 {

	public static void main(String[] args) {
		
		// Exemplo com While
		
		int contador = 0;
		while(contador <10) {
			System.out.println("Bom dia! " + contador);
			contador++;
		}
		
		System.out.println("\n");
		
		// Mesmo exemplo, por�m com o for. Note que reduz o c�digo, por isso para essa situa��o o for � o mais ideal
		
		for (Integer contador2 = 0; contador2 < 10; contador2++) {
			System.out.println("Bom dia! " + contador2);
		}
		
		// Outra forma de utilizar o for, parecendo um while
		
		int a = 0;
		for(; a < 10 ;) {
			System.out.println("a = " + a);
			a++;
		}

	}

}
