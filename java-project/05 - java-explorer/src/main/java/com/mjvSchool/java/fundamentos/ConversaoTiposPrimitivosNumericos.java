package com.mjvSchool.java.fundamentos;

/**
 * @author viccttor
 */

/*
 * Algumas formas de conversão dos tipos primitivos
 * 
*/

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		// Forma implicita
		
		double a = 1;
		System.out.println(a);
		//Note no console que o meso será covertido para 1.0
		
		//Forma Explicita
		float b = (float) 1.2231;
		System.out.println(b);
		//Podendo também ser realizado com o acrescento da letra F no final do número. Porém pode-se perder valor
		//EX: 
		double c = 1.3251513235532;
		System.out.println(c);
		float d = (float) 1.3251513235532;
		System.out.println(d);
		//Note que foi perdido informações
	}

}
