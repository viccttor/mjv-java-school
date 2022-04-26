package com.mjv.javaSchool.java.aulas.aula25042022.switchCase;

import java.util.Scanner;

public class SwitchCaseExemplo01 {

	public static void main(String[] args) {
	Scanner sEntrada = new Scanner(System.in);
		
		int nota = 0;
		String conceito = "";
		System.out.print("Digite a nota de 0 a 10: ");
		nota = sEntrada.nextInt();
		
		
		switch (nota) {
		case 10: case 9:
			conceito = "A+";
			break;
		case 8: 
		case 7:
			conceito = "B+";
			break;
		case 6:	case 5:
			conceito = "C";
			break;
		case 4:	case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;

		default:
			System.out.println("Digite uma nota válida!");
			break;
		}
		
		
		System.out.printf("O Conceito é: %s", conceito);
		sEntrada.close();
	}

}
