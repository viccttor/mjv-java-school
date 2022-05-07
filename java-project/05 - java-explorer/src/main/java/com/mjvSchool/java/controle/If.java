package com.mjvSchool.java.controle;

import java.util.Scanner;

/**
 * @author viccttor
 * 
 */

/*
 * Opera��es com IF e else
 * 
 * Programa para inserir a m�dia e o sistema computar se foi arovado ou n�o ou
 * se a m�dia � inv�lida
 * 
 * OBS: N�o utilziar o ";" na estrutura simples
 */

public class If {

	public static void main(String[] args) {


        Scanner sEntrada = new Scanner(System.in);
        System.out.print("Digite a m�dia: ");
		Double media = sEntrada.nextDouble();

		if (media > 10 || media < 0) {
			System.out.println("M�dia Inv�lida");
		} else if (media >= 7 && media <= 10) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado!");
		}		
		sEntrada.close();
		
		
	
	}

}
