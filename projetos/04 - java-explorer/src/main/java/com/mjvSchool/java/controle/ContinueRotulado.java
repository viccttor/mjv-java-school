package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Continue, tem a função direfeten com a do break, pois interrompe apenas aquela condição ou repetição.
 * 
 * Podendo também rotular para definiar onde irá executar o continue
 * 
 **/

public class ContinueRotulado {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int o = 0; o < 3; o++) {
				if ( i==1) {
					continue;
				}
				System.out.printf("[%d %d]", i, o);
			}
			System.out.println();
		}
		System.out.println("\nFIM! BREAK NORMAL");
		
		System.out.println("\nBreak Rotulado\n");
		
		// Break Rotulado
		
		externo: for(int a = 0; a < 3; a++) {
			interno: for(int b = 0; b < 3; b++) {
				if ( a==1) {
					continue externo;
				}
				System.out.printf("[%d %d]", a, b);
			}
			System.out.println();
		}
		System.out.println("\nFIM EXEMPLO 2, Break ROTULADO!");


	}

}
