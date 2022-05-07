package com.mjvSchool.java.fundamentos.operadores;

/**
 * @author viccttor
 */

/*
 * Desafio
 * 
 * Resolver a expressão:
 * ([6*(3+2)] elevado por 2 / 3*2 - (1-5)*(2-7) elevado por 2 / 2) elevado por 3 / 10 a terceira
 * 
*/

public class DesafioAritmeticos {

	public static void main(String[] args) {

		//Quebrando a formula em partes
		
		double a1 = 6*(3+2) ;
		double resultadoA = Math.pow(a1, 2) / (3*2);
		
		double b1 = (1-5)*(2-7)/2;
		double resultadoB = Math.pow(b1, 2);
		
		double resultadoC = resultadoA - resultadoB;
		double resultado = Math.pow(resultadoC, 3) /Math.pow(10, 3);
		
		System.out.println("o resultado é : " +  resultado);
		
		
		
		
	}

}
