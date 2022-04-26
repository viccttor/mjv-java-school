package com.mjv.javaSchool.java.aulas.aula25042022.ifElse;

import java.util.Scanner;

public class IfEsleExemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da semana: ");
		String nomeDaSemana = entrada.next();
		
		// Condições
		
		if ("domingo".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 1 );
		} else if ("segunda".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 2 );
		} else if ("terça".equalsIgnoreCase(nomeDaSemana)
				|| "terca".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o " + 3 + " dia da semana!");
		} else if ("quarta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 4);
		} else if ("quinta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: " + 5 );
		} else if ("sexta".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: "  + 6 );
		} else if ("sábado".equalsIgnoreCase(nomeDaSemana)
				|| "sabado".equalsIgnoreCase(nomeDaSemana)) {
			System.out.printf(nomeDaSemana + " é o dia da semana de número: " + 7 );
		}
		
		entrada.close();
	}

}
