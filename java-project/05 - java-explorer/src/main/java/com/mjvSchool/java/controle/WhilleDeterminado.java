package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Operações while
 * 
 * O While executa em tradução literal um trecho de cóodigo enquanto a condição for verdadeira. 
 * EX: Repita enquanto contador for menor que 10, repita BOM dia
 */

public class WhilleDeterminado {

	public static void main(String[] args) {

		int contador = 0;
		
		while(contador <10) {
			System.out.println("Bom dia! " + contador);
			contador++;
		}

	}

}
