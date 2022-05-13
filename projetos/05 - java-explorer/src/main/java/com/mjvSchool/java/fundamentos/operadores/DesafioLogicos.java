package com.mjvSchool.java.fundamentos.operadores;

/**
 * @author viccttor
 */

/*
 * Desafio - Mapear as operações lógicas
 * 
 * Caso 1 - Trabalho Terça && Trabalho Quinta - true  - Compra TV 50' e toma sorvete
 * Caso 3 - Trabalho Terça || Trabalho Quinta - true  - Compra TV 32' e toma sorvete
 * Caso 3 - Trabalho Terça && Trabalho Quinta - false - Ficou mais saudável
 * 
 * 
*/

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Caso1 - Trabalho Terça && Trabalho Quinta - true  - Compra TV 50' e toma sorvete
		
		boolean trab1 = true;
		boolean trab2 = true; 
		
		boolean Tv50 = trab1 && trab2;
		boolean Tv32 = trab1 ^  trab2;
		
		boolean sovt1 = trab1 || trab2;
		
		System.out.printf("Comprou TV de 50'? %b",Tv50);
		System.out.printf("\t 	Comprou TV de 32'? %b",Tv32);
		System.out.printf("\t	Comprou sorvete? %b",sovt1);
		System.out.printf("\t	Ficou mais saudável? %b",!sovt1);
		
		// Caso 3 - Trabalho Terça || Trabalho Quinta - true  - Compra TV 32' e toma sorvete
		
		boolean trab12 = true;
		boolean trab22 = false; 
		
		boolean Tv250 = trab12 ^  trab22;
		boolean Tv232 = trab12 &&  trab22;
		boolean sovt12 = trab12 || trab22;
		
		System.out.printf("\nComprou TV de 50'? %b",Tv250);
		System.out.printf("\t 	Comprou TV de 32'? %b",Tv232);
		System.out.printf("\t	Comprou sorvete? %b",sovt12);
		System.out.printf("\t	Ficou mais saudável? %b",!sovt12);
		
		// Caso 3 - Trabalho Terça && Trabalho Quinta - false - Ficou mais saudável
		
		boolean trab13 = false;
		boolean trab23 = false; 
		
		boolean Tv350 = trab13 ^ trab23;
		boolean Tv332 = trab13 ^  trab23;
		boolean sovt13 = trab13 || trab23;
		
		System.out.printf("\nComprou TV de 50'? %b",Tv350);
		System.out.printf("\tComprou TV de 32'? %b",Tv332);
		System.out.printf("\t	Comprou sorvete? %b",sovt13);
		System.out.printf("\t	Ficou mais saudável? %b",!sovt13);
		
	}

}
