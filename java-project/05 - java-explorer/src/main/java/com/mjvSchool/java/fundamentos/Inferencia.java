package com.mjvSchool.java.fundamentos;
/**
 * 
 * @author viccttor
 *
 */

// Fins educacionais 

public class Inferencia {

	public static void main(String[] args) {

// Nestre caso eu seto o tipo da vari�vel
		double a = 5.5;
		System.out.println(a);
		
/* j� neste caso eu seto o "var" que j� identifica qual a tipagem da vari�vel a partir do que foi atribu�do a ela. Por�m n�o aceita o mudan�a do
tipo da mesma, tendo que fazer a convers�o. Exemplo que dara erro: var c = "Texto"; c = 1; N�o ir� funcionar. Ex que funciona: c�digo abaixo 
OBS: A partir do java 10.
*/
		
		var b = 5.1;
		System.out.println(b);
		
		var c = "Text";
		System.out.println(c);
		
		c = "Other text";
		System.out.println(c);
				

	}

}
