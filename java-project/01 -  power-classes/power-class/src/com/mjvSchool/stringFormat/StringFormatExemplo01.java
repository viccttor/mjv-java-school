package com.mjvSchool.stringFormat;

public class StringFormatExemplo01 {

	public static void main(String[] args) {
		
		//Declaração de Variáveis 
		var nome = "Victor";
		var sobrenome = "Henrique";
		var idade = 23;
		var salario = 2.541;
		
		// Trazendo com concatenação as variáveis pelo console
		System.out.println("Nome: " + nome + "\tSobrenome: " + sobrenome + "\tIdade: " + idade + "\tSalário: " + salario);
		
		// Utilizando o recurso printf para pode colocar na setença a variável.
		String teste1 = String.format("\n\nOutra Forma01: Nome: %s %s, tem %d anos e ganha R$%3f por mês.", nome,sobrenome,idade,salario);
		System.out.println(teste1);
		
		// Nesta condição, utilizamos um recurso para controlar o número de casas decimais do tipo float ou double
		System.out.printf("\n\nOutra Forma02: Nome %s %s, tem %d anos e ganha R$%.3f por mês.\n", nome,sobrenome,idade,salario);
		
		// Utilizando o %-20d, ele especifica a largura apos
		System.out.println();
		System.out.println(String.format("|%-20d| teste2", 93));
		
		// Utilizando o %20d, ele especifica a largura antes
		System.out.println();
		System.out.println(String.format("|%20d| teste2", 93));
		
		// Utilizando o %020d, bloco com zeros
		System.out.println();
		System.out.println(String.format("|%020d| teste2", 93));
		
		// Limitando o uso de caracteres
		System.out.println();
		System.out.println(String.format("|%.4s|", "|Victor Henrique|"));
		System.out.println();
		System.out.println(String.format("|%.8s|", (nome + sobrenome)));
		
	}

}
