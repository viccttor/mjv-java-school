package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Operações For
 * 
 * O for executa em tradução literal um trecho de cóodigo enquanto a condição imposta na própria condição se mantem. 
 * EX: Enquanto  contador2 que é igual a 0 for menor que 10, faça,  contador2 mais operação, execute BOM dia
 * ou seja define a quantidade da variavel de controle, estabele a condição e a variação da variável.
 * 
 * FOR  é focado em um processo pre-definido de repetições
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
		
		// Mesmo exemplo, porém com o for. Note que reduz o código, por isso para essa situação o for é o mais ideal
		
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
