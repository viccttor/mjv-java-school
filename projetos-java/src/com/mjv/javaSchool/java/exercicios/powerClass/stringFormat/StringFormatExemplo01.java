package com.mjv.javaSchool.java.exercicios.powerClass.stringFormat;

public class StringFormatExemplo01 {

	public static void main(String[] args) {
		
		//Declaração de Variáveis 
		var nome = "Victor";
		var sobrenome = "Henrique";
		var idade = 23;
		var salario = 2.541;
		
		// Trazendo com concatenação as variáveis pelo console
		System.out.println("Nome: " + nome + "\tSobrenome: " + sobrenome + "\tIdade: " + idade + "\tSalário: " + salario);
		
		// A sentença de código ficou muito extensa
		System.out.printf("\n\nNome %s %s, tem %d anos e ganha R$%f por mês.", nome,sobrenome,idade,salario);
		
		// Nesta condição, utilizamos um recurso para controlar o número de casas decimais do tipo float ou double
		System.out.printf("\n\nOutra Forma: Nome: %s %s, tem %d anos e ganha R$%.3f por mês.", nome,sobrenome,idade,salario);


	}

}
