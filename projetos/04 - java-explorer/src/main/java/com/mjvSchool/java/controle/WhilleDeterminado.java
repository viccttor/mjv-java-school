package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Opera��es while
 * 
 * O While executa em tradu��o literal um trecho de c�odigo enquanto a condi��o for verdadeira. 
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
