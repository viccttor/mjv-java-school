package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Operações For
 * 
 */

public class For3 {

	public static void main(String[] args) {
		
		// incremento crescente até 15. Como fazer ?
		
		for(int i=0; i < 16; i++) {
			System.out.print("\t" + i);
		}

		// laço dentro de outro laço
		
		System.out.println();
		for(int i=0;i<10;i++) {
			for(int o=0;o<10;o++) {
				System.out.printf("[%d %d]", i,o);
			}
			System.out.println();
		}

	}

}
