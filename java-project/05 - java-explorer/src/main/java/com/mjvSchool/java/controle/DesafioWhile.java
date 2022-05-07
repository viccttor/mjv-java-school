package com.mjvSchool.java.controle;

import java.util.Scanner;

/**
 * @author viccttor
 * 
 */

/*
 * Desafio While
 * 
 * Calcular a média da turma e informar o total de notas que foram inseridas, a quantidade de notas válidas e a condição de sair é "-1"
 * 
 */

public class DesafioWhile {

	public static void main(String[] args) {
		
		/*
		 *  Divindo o trabalho
		 *  
		 *  0 - Colocar a função de entrada de dados
		 *  1 - Montar a estrutura de repetição para só sair quando a entrada foi -1
		 *  2 - Montar a entrada do usuário
		 *  3 - Montar a condição que irá validar se a nota é válida ou não
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
				System.out.print("Número Inválido. ");
			}
			
			
		}
		
		double mediaTotal = totalNotas / qtdEntradas;
		System.out.print("\nTotal de Notas inseridas: " + qtdEntradas);
		System.out.print("\tDando uma média de: " + mediaTotal);
		
		sEntrada.close();
		
	}

}
