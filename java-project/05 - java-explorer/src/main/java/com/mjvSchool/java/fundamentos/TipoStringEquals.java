package com.mjvSchool.java.fundamentos;

import java.util.Scanner;

/**
 * @author viccttor
 */

/*
 * Comparação de String
 * 
*/

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String a = new String("2");
		System.out.println("2" == a );
		System.out.println("2".equals(a));// Compara o conteúdo da variável
		
		Scanner entrada = new Scanner(System.in);
		String b = entrada.next(); // OBS: O next remove os espaços em brancos, já nextLine não por isso usar o .trim()
		System.out.println("2" == b );
		System.out.println("2".equals(b));
		
		entrada.close();
	

	}

}
