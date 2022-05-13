package com.mjvSchool.java.controle;

import java.util.Scanner;

/**
 * @author viccttor
 * 
 */

/*
 * Operações Do While
 * 
 * Note que as estruturas:
 * 	
 * 	if (...) setença; ou {}
 *  while (...) setença; ou {}
 *  for (...;...;...) setença; ou {}
 *  
 *  Já o do while é diferente, pois executa primeiro e depois verifica a condição e também termina com o ";". Difente das outras que 
 *  só a sentença termina com ";"
 *  
 *   do setençao; ou {} while(...);
 *   
 */

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sEntrada = new Scanner(System.in);
			
		String texto = "por favor";
		
		do {
			System.out.print("Quer sair? \n");
			System.out.print("Você precisa falar as palavras mágicas... ");
			texto = sEntrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado! Pode sair... ");
		// Note que mesmo a string tendo o valor da condição, o mesmo ainda é exucutado ao mesnos uma vez
		sEntrada.close();

	}

}
