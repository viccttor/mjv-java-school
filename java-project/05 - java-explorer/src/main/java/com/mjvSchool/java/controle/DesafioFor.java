package com.mjvSchool.java.controle;


/**
 * @author viccttor
 * 
 */

/*
 * Desafio for
 * 
 * o c�digo :
 * 
 * 	String valor = "#";
 * 	for(int i = 1; i <= 5; i++) {
 * 		System.out.println(valor);
 * 		valor += "#";
 * 	}
 * 
 *  N�o pode usar valor numerico para controlar o la�o, e tem que dar o mesmo controle e o mesmo resultado;
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
