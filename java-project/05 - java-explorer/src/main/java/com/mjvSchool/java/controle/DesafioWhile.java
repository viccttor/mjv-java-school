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

public class DesafioWhile {

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
		
		String valor = "0";
		int qtdEntradas = 0;
		double totalNotas = 0;
		
		while(!valor.equalsIgnoreCase("-1")) {
			System.out.print("Number:");
			valor = sEntrada.next().replace(",",".");
			Double media = Double.parseDouble(valor);
						
			if(media >= 0 && media <= 10) {
				totalNotas += media;
				qtdEntradas ++;
			} else if (media != -1) {
				System.out.print("N�mero Inv�lido. ");
			}
			
			
		}
		
		double mediaTotal = totalNotas / qtdEntradas;
		System.out.print("\nTotal de Notas inseridas: " + qtdEntradas);
		System.out.print("\tDando uma m�dia de: " + mediaTotal);
		
		sEntrada.close();
		
	}

}
