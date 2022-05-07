package com.mjvSchool.java.arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sEntrada = new Scanner(System.in);

		System.out.print("Quantos Alunos tem? ");
		int qtdAlunos = sEntrada.nextInt();
		
		System.out.print("Quantas Notas possuí? ");
		int qtdNotas = sEntrada.nextInt();
		
		double[][] notaDaTurma = new double[qtdAlunos][qtdNotas];
		
		double totalNotas = 0;
		
//		for (int i = 0; i < qtdNotas; i++) {
//			System.out.print("Digita a nota "+(i+1)+" do primeiro aluno: ");
//			double nota = sEntrada.nextDouble();
//			notaDaTurma[0][i] = nota;
//			totalNotas += nota;
//		}
//		System.out.println();
//		
//		for (int i = 0; i < qtdNotas; i++) {
//			System.out.print("Digita a nota "+(i+1)+" do Segundo aluno: ");
//			double nota = sEntrada.nextDouble();
//			notaDaTurma[1][i] = nota;
//			totalNotas += nota;
//		}
//		
//		Dessa Forma, teria que saber quantos alunos iria inserir para poder funcionar. Por isso o idela é utilizar doi for um para cada array
		
		System.out.println();
		
		for (int i=0; i < qtdAlunos; i++) {
				for(int h=0; h < qtdNotas; h++) {
					System.out.print("Digita a nota "+(h+1)+" do aluno " + (i+1)+": ");
					double nota = sEntrada.nextDouble();
					notaDaTurma[i][h] = nota;
					totalNotas += nota;
				}
				System.out.println();
		}
		
	
		double mediaGeral = totalNotas / (qtdAlunos * qtdNotas);
		System.out.println("A média geral da Turma com " +qtdAlunos+ " alunos, foi de: " + mediaGeral);
		sEntrada.close();

	}

}
