package com.mjv.javaSchool.java.exercicios.powerClass.decimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class DecimalFormatExemplo02 {

	public static void main(String[] args) {
		// Criando variável para o while
		boolean run = true;

		// Entrada do número a ser formatado
		System.out.print("Digite um número: ");
		Scanner entrada = new Scanner(System.in);
		String lerNum = entrada.nextLine().replace(",", ".");
		Double num = Double.parseDouble(lerNum);

		// Opções de formatação
		System.out.println("Escolha um formato: ");
		System.out.print("\n[1] - Padrão número BR     ");
		System.out.print("[2] - Padrão moeda BR  \n");
		System.out.print("[3] - Padrão número US  ");
		System.out.print("   [4] - Padrão número US  ");
		System.out.print("\n[5] - Sair \n");

		// Foi optado por deixar todas as parametrizações dentro da condição
		while (run) {
			// Entrada da opção de formatação
			System.out.print("\nOpção: ");
			int op = entrada.nextInt();
			switch (op) {
			case 1:
				String padraoBr = "###,###.##";
				DecimalFormatSymbols ptBr = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
				ptBr.setDecimalSeparator(',');
				ptBr.setGroupingSeparator('.');
				DecimalFormat case01 = new DecimalFormat(padraoBr, ptBr);
				System.out.println("Resultado: " + case01.format(num));
				break;
			case 2:
				String padraoMoedaBr = "R$ ###,###.##";
				DecimalFormatSymbols moedaBr = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
				moedaBr.setDecimalSeparator(',');
				moedaBr.setGroupingSeparator('.');
				DecimalFormat case02 = new DecimalFormat(padraoMoedaBr, moedaBr);
				System.out.println("Resultado: " + case02.format(num));
				break;
			case 3:
				String padraoUsa = "###,###.##";
				DecimalFormat usa = new DecimalFormat(padraoUsa);
				System.out.println("Resultado: " + usa.format(num));
				break;
			case 4:
				String padraoMoedaUsa = "$ ###,###.##";
				DecimalFormat moedaUsa = new DecimalFormat(padraoMoedaUsa);
				System.out.println("Resultado: " + moedaUsa.format(num));
				break;
			case 5:
				run = false;
				break; // Saída do programa

			default:
				System.out.println("Digite uma opção válida!"); // Mensagem
				break;
			}
		}
		entrada.close();

	}

}
