package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Continue, tem a função direfeten com a do break, pois interrompe apenas aquela condição ou repetição podendo rotular o mesmo para definir
 * onde irá realizar o break;
 * 
 **/

public class BreakRotulado {

	public static void main(String[] args) {

		for(int i = 0; i < 3; i++) {
			for(int o = 0; o < 3; o++) {
				if ( i==1) {
					break;
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
					break externo;
				}
				System.out.printf("[%d %d]", a, b);
			}
			System.out.println();
		}
		System.out.println("\nFIM EXEMPLO 2, Break ROTULADO!");

	}

}
