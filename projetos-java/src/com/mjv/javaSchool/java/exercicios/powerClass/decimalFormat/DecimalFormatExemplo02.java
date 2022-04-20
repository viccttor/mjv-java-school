package com.mjv.javaSchool.java.exercicios.powerClass.decimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class DecimalFormatExemplo02 {

	public static void main(String[] args) {
		// Criando vari�vel para o while
		boolean run = true;

		// Entrada do n�mero a ser formatado
		System.out.print("Digite um n�mero: ");
		Scanner entrada = new Scanner(System.in);
		String lerNum = entrada.nextLine().replace(",", ".");
		Double num = Double.parseDouble(lerNum);

		// Op��es de formata��o
		System.out.println("Escolha um formato: ");
		System.out.print("\n[1] - Padr�o n�mero BR     ");
		System.out.print("[2] - Padr�o moeda BR  \n");
		System.out.print("[3] - Padr�o n�mero US  ");
		System.out.print("   [4] - Padr�o n�mero US  ");
		System.out.print("\n[5] - Sair \n");

		// Foi optado por deixar todas as parametriza��es dentro da condi��o
		while (run) {
			// Entrada da op��o de formata��o
			System.out.print("\nOp��o: ");
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
				break; // Sa�da do programa

			default:
				System.out.println("Digite uma op��o v�lida!"); // Mensagem
				break;
			}
		}
		entrada.close();

	}

}
