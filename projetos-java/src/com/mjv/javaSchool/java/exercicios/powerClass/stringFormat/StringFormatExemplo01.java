package com.mjv.javaSchool.java.exercicios.powerClass.stringFormat;

public class StringFormatExemplo01 {

	public static void main(String[] args) {
		
		//Declara��o de Vari�veis 
		var nome = "Victor";
		var sobrenome = "Henrique";
		var idade = 23;
		var salario = 2.541;
		
		// Trazendo com concatena��o as vari�veis pelo console
		System.out.println("Nome: " + nome + "\tSobrenome: " + sobrenome + "\tIdade: " + idade + "\tSal�rio: " + salario);
		
		// A senten�a de c�digo ficou muito extensa
		System.out.printf("\n\nNome %s %s, tem %d anos e ganha R$%f por m�s.", nome,sobrenome,idade,salario);
		
		// Nesta condi��o, utilizamos um recurso para controlar o n�mero de casas decimais do tipo float ou double
		System.out.printf("\n\nOutra Forma: Nome: %s %s, tem %d anos e ganha R$%.3f por m�s.", nome,sobrenome,idade,salario);


	}

}
