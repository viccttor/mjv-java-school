package com.mjvSchool.java.controle;

import java.util.Scanner;

/**
 * @author viccttor
 * 
 */

/*
 * Opera��es Do While
 * 
 * Note que as estruturas:
 * 	
 * 	if (...) seten�a; ou {}
 *  while (...) seten�a; ou {}
 *  for (...;...;...) seten�a; ou {}
 *  
 *  J� o do while � diferente, pois executa primeiro e depois verifica a condi��o e tamb�m termina com o ";". Difente das outras que 
 *  s� a senten�a termina com ";"
 *  
 *   do seten�ao; ou {} while(...);
 *   
 */

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sEntrada = new Scanner(System.in);
			
		String texto = "por favor";
		
		do {
			System.out.print("Quer sair? \n");
			System.out.print("Voc� precisa falar as palavras m�gicas... ");
			texto = sEntrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado! Pode sair... ");
		// Note que mesmo a string tendo o valor da condi��o, o mesmo ainda � exucutado ao mesnos uma vez
		sEntrada.close();

	}

}
