package com.mjv.javaSchool.java.aulas.aula25042022.ifElse;

import java.util.Scanner;

public class IfEsleExemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
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
