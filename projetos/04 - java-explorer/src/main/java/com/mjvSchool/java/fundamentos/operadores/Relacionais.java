package com.mjvSchool.java.fundamentos.operadores;

import java.util.Scanner;

/**
 * 
 * @author viccttor
 *
 */

/*
 * Operadores Relacionais
 * 
 */
public class Relacionais {

	public static void main(String[] args) {
		// Exemplos simples
		
		int a = 22;
		int b = 221;
		
		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a != b);
		
		//E= Exemplo com operadores lógicos
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("\n\nDigite o nome do aluno: ");
		String nome = teclado.nextLine();
		System.out.printf("É um bom aluno? Digite s - sim ou n - não:  ");
		String comportamento = teclado.next().replace("s", "true").replace("f", "false");
		System.out.printf("Digite a média do aluno: ");
		String media = teclado.next().replaceAll(",", ".");
		
		double mediaReal = Double.parseDouble(media);
		Boolean resultadoComportamento = Boolean.parseBoolean(comportamento);
		Boolean resultado = mediaReal >= 7;
		Boolean desconto = resultadoComportamento && resultado;
		
		System.out.printf("O aluno %s, teve a media %.2f . Passou de ano? %b",nome,mediaReal,resultado);
		System.out.printf("\nTerá desconto na renovação da matrícula? %b ",desconto);
		
		teclado.close();
	}

}
