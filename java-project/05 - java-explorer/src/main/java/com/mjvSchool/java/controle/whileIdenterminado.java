package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Opera��es while
 * 
 * O While � melhor utlizado quando n�o se sabe a quantidade de repeti��es. 
 * Como neste caso abaixo
 */

import java.util.Scanner;

public class whileIdenterminado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		/* Cen�rio
		 * 
		 * O usu�rio ir� dar entrada, e o la�o ficar� em loop at� que o usu�rio insira
		 * o valor "sair";
		 * 
		 */
		
		// Como o la�o s� ir� excecutar se o valor for verdadeiro
		// Coloca-se o operador de nega��o para quando o usu�rio entrar com a condi��o correta
		// O c�digo pare de executar, pois o resultado ser� falso
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Digite: ");
			valor = entrada.nextLine();
		}
			
			
			
		entrada.close();
	}

}
