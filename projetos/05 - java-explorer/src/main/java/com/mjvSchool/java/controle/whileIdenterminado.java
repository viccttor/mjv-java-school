package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Operações while
 * 
 * O While é melhor utlizado quando não se sabe a quantidade de repetições. 
 * Como neste caso abaixo
 */

import java.util.Scanner;

public class whileIdenterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		/* Cenário
		 * 
		 * O usuário irá dar entrada, e o laço ficará em loop até que o usuário insira
		 * o valor "sair";
		 * 
		 */
		
		// Como o laço só irá excecutar se o valor for verdadeiro
		// Coloca-se o operador de negação para quando o usuário entrar com a condição correta
		// O código pare de executar, pois o resultado será falso
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Digite: ");
			valor = entrada.nextLine();
		}
			
			
			
		entrada.close();
	}

}
