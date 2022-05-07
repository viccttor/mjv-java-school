package com.mjvSchool.java.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DesafioArrays01 {

	public static void main(String[] args) {

		Scanner sEntrada = new Scanner(System.in);
		System.out.print("Digite a quantidade de notas que deseja inserir: ");
		int qtdNotas = sEntrada.nextInt();
		double[] notas = new double[qtdNotas];
		
		for (int i=0; i < qtdNotas; i++) {
			System.out.print("\nDigite a "+ (i+1)+ ": ");
			notas[i] = sEntrada.nextDouble();
		}
		
		System.out.println("\nAs notas digitas foram: " + Arrays.toString(notas)+"\n");
		
		double media = 0;
		for (double nota: notas) {
			media += nota;
		}
		System.out.println("A média das notas digitadas são: " + (media/qtdNotas));
		sEntrada.close();

	}

}
