package com.mjvSchool.java.controle;


/**
 * @author viccttor
 * 
 */

/*
 * Desafio for
 * 
 * o código :
 * 
 * 	String valor = "#";
 * 	for(int i = 1; i <= 5; i++) {
 * 		System.out.println(valor);
 * 		valor += "#";
 * 	}
 * 
 *  Não pode usar valor numerico para controlar o laço, e tem que dar o mesmo controle e o mesmo resultado;
 *  
 *  
 */
public class DesafioFor {

	public static void main(String[] args) {
		
	 	String valor = "#";
	 	  	for(String i = "#"; !i.equals("######"); i += "#" ) {
	 	  		System.out.println(valor);
	 	  		valor += "#";
	 	  	}

	}

}
