package com.mjvSchool.java.controle;

import java.util.Scanner;

/**
 * @author viccttor
 * 
 */

/*
 * Desafio While
 * 
 * Calcular a m�dia da turma e informar o total de notas que foram inseridas, a quantidade de notas v�lidas e a condi��o de sair � "-1"
 * 
 */

public class DesafioWhileModoSimples {

	public static void main(String[] args) {
		
		/*
		 *  Divindo o trabalho
		 *  
		 *  0 - Colocar a fun��o de entrada de dados
		 *  1 - Montar a estrutura de repeti��o para s� sair quando a entrada foi -1
		 *  2 - Montar a entrada do usu�rio
		 *  3 - Montar a condi��o que ir� validar se a nota � v�lida ou n�o
		 *  
		 */

		Scanner sEntrada = new Scanner(System.in);
		
		Double nota = 0D;
		Double totalNota = 0D;
		int qtdNotas = 0;
		
		while(nota != -1) {
			System.out.print("Digite a Nota ou digite ( -1 ) para sair: ");
			nota = sEntrada.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				totalNota += nota;
				qtdNotas++;
			} else if ( nota != -1) {
				System.out.print("Digite uma nota v�lida\n ");
			}
		}
	
		Double media = totalNota / qtdNotas;
		
		System.out.printf("Foram digitas um total de " + qtdNotas + " notas, dando uma m�dia de " + media);
		
		sEntrada.close();
		
	}

}
