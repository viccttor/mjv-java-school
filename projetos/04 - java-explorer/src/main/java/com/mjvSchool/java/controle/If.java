package com.mjvSchool.java.controle;

import java.util.Scanner;

/**
 * @author viccttor
 * 
 */

/*
 * Operações com IF e else
 * 
 * Programa para inserir a média e o sistema computar se foi arovado ou não ou
 * se a média é inválida
 * 
 * OBS: Não utilziar o ";" na estrutura simples
 */

public class If {

	public static void main(String[] args) {


        Scanner sEntrada = new Scanner(System.in);
        System.out.print("Digite a média: ");
		Double media = sEntrada.nextDouble();

		if (media > 10 || media < 0) {
			System.out.println("Média Inválida");
		} else if (media >= 7 && media <= 10) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado!");
		}		
		sEntrada.close();
		
		
	
	}

}
