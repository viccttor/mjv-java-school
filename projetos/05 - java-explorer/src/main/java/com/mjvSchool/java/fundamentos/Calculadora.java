package com.mjvSchool.java.fundamentos;

import java.util.Scanner;

/**
 * @author viccttor
 */

/* Desafio
 * 
 * Elaborar um calculadora sem utilizar a condi��o
 *
 * 
*/

public class Calculadora {

	public static void main(String[] args) {

		// Boas Vindas
		
		System.out.println("============================================================"); 
		System.out.println("=	          Desafio de Complus�o de M�dulo           ="); 
		System.out.println("============================================================\n"); 
		
		// Entrada de Dados
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora\n");
		System.out.print("Primeiro N�mero: ");
		String lerNum1 = entrada.next().replace(",", ".");
		System.out.print("Segundo N�mero: ");
		String lerNum2 = entrada.next().replace(",", ".");
		System.out.print("Tipo de opera��o ( - , + , * , / ou % ): ");
		String operacao = entrada.next();
		
		
		// Opera��es
		
		Double num1 = Double.parseDouble(lerNum1);
		Double num2 = Double.parseDouble(lerNum2);
		Double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		 	   resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		       resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		       resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		       resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		// Sa�da
		 
		System.out.printf("\nResultado: %.2f %s %.2f = %.2f", num1,operacao,num2,resultado);
		
		entrada.close();
	}

}
