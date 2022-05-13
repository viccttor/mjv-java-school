package com.mjvSchool.java.fundamentos.operadores;

/**
 * @author viccttor
 */

/*
 * Exemplos com operadores
 * 
*/

public class Aritmeticos {

	public static void main(String[] args) {

		System.out.println(2+6);
		
		var a = 12.1;
		double b = 22.2;
		
		System.out.println("\nSoma:"+a+b);
		System.out.println("Subtração:" + (a-b));
		System.out.println("Divisão:"+a/b);
		System.out.println("Multiplicação:"+a*b);
		
		Integer c = 50;
		Integer d = 21;
		
		System.out.println("\nSoma:"+c+d);
		System.out.println("Subtração:" + (c-d));
		System.out.println("Divisão:"+c/(double)d);
		System.out.println("Multiplicação:"+c*d);
		System.out.println("Resto:"+ c % d);
		
		//Elevando a potência
		
		double e = 2;
		int potencia = 3;
		System.out.println("\nPotência: " + Math.pow(e, potencia));
		
		int resultado = (int) Math.pow(e, potencia);
		System.out.println("Outra Forma de potência: " + resultado);

	}

}
