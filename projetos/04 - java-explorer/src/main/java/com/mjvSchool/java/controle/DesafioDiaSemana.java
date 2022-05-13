package com.mjvSchool.java.controle;

import java.util.Scanner;

/**
 * @author viccttor
 * 
 */

/*
 * Desafio - Dia da semana
 * 
 * Ser� entraga o dia da semana e programa retornar� o dia da semana:
 * 
 * Domingo - 1
 * Segunda - 2
 * Ter�a   - 3
 * Quarta  - 4
 * Quinta  - 5
 * Sexta   - 6
 * S�bado  - 7
 * 
 */

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// Recebendo os dias da semana como String
		
		System.out.print("Digite o dia da semana: ");
		String nomeDaSemana = entrada.next();
		
		// Condi��es
		
		if ("domingo".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 1 );
		} else if ("segunda".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 2 );
		} else if ("ter�a".equalsIgnoreCase(nomeDaSemana)
				|| "terca".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o " + 3 + " dia da semana!");
		} else if ("quarta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 4);
		} else if ("quinta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: " + 5 );
		} else if ("sexta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: "  + 6 );
		} else if ("s�bado".equalsIgnoreCase(nomeDaSemana)
				|| "sabado".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " � o dia da semana de n�mero: " + 7 );
		}
		
		
		
		entrada.close();
	}

}
