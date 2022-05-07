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

public class DesafioWhileModoSimples {

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
				System.out.print("Digite uma nota válida\n ");
			}
		}
	
		Double media = totalNota / qtdNotas;
		
		System.out.printf("Foram digitas um total de " + qtdNotas + " notas, dando uma média de " + media);
		
		sEntrada.close();
		
	}

}
