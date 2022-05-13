package com.mjvSchool.java.fundamentos;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * @author viccttor
 */

/* Desafio
 * 
 * Elaborar um programa em Java para receber a entrada de 3 sal�rios que ser�o inseridos como String.
 * Converter para double, somar e jogar na tela a soma dos tr�s sal�rios.
 * OBS: A entrada pode ser feita utilizando tanto . como , para dividir as casas
 * decimais.
 * 
 * .Locale
 * Locale.setDefault(new Locale("pt", "br");
 *
*/

import java.util.Scanner;

public class MediaSalarial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// Boas Vindas
		
		System.out.println("\n\nInsira seu nome, sobrenome e os �ltimos tr�s sal�rios, "
				+ "		  \npara calcular a m�dia sal�rial.\n\n");
		
		// Capta�ao dos dados do usu�rio
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Informe o antepen�ltimo sal�rio: ");
		String valor1 = entrada.nextLine().replace(",",".");
		System.out.print("Informe o pen�ltimo sal�rio: ");
		String valor2 = entrada.nextLine().replaceAll(",",".");
		System.out.print("E por fim, informe o �ltimo sal�rio: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		// Conversao e calculos
		
		Locale.setDefault(new Locale("PT","BR"));
		DecimalFormat formt = new DecimalFormat("0.00");
		Double salario1 = Double.parseDouble(valor1);
		Double salario2 = Double.parseDouble(valor2);
		Double salario3 = Double.parseDouble(valor3);
		Double totalRecebido = salario1 + salario2 + salario3;
		Double mediaSalario = (totalRecebido/3);
		
		//String media = Double.toString(mediaSalario);
		
		
		// Sa�da das informa��es
		
		System.out.printf(" %s %s, voc� recebeu um total de: R$ %.2f"
				+ " e a sua m�dia salarial foi de: R$ %.2f por m�s.",nome,sobrenome,totalRecebido,mediaSalario);
		
		entrada.close();
	}

}
