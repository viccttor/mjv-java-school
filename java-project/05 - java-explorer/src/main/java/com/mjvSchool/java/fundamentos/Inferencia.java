package com.mjvSchool.java.fundamentos;
/**
 * 
 * @author viccttor
 *
 */

// Fins educacionais 

public class Inferencia {

	public static void main(String[] args) {

// Nestre caso eu seto o tipo da variável
		double a = 5.5;
		System.out.println(a);
		
/* já neste caso eu seto o "var" que já identifica qual a tipagem da variável a partir do que foi atribuído a ela. Porém não aceita o mudança do
tipo da mesma, tendo que fazer a conversão. Exemplo que dara erro: var c = "Texto"; c = 1; Não irá funcionar. Ex que funciona: código abaixo 
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
