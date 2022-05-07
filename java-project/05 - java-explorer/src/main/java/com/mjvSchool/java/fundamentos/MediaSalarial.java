package com.mjvSchool.java.fundamentos;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * @author viccttor
 */

/* Desafio
 * 
 * Elaborar um programa em Java para receber a entrada de 3 salários que serão inseridos como String.
 * Converter para double, somar e jogar na tela a soma dos três salários.
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
		
		System.out.println("\n\nInsira seu nome, sobrenome e os últimos três salários, "
				+ "		  \npara calcular a média salárial.\n\n");
		
		// Captaçao dos dados do usuário
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Informe o antepenúltimo salário: ");
		String valor1 = entrada.nextLine().replace(",",".");
		System.out.print("Informe o penúltimo salário: ");
		String valor2 = entrada.nextLine().replaceAll(",",".");
		System.out.print("E por fim, informe o último salário: ");
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
		
		
		// Saída das informações
		
		System.out.printf(" %s %s, você recebeu um total de: R$ %.2f"
				+ " e a sua média salarial foi de: R$ %.2f por mês.",nome,sobrenome,totalRecebido,mediaSalario);
		
		entrada.close();
	}

}
