package com.mjvSchool.java.fundamentos;

/**
 * @author viccttor
 */

/*
 * Algumas funções do Scanner
 * 
*/

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Teste");
		System.out.print(" 01\n");
		System.out.println("Teste");
		System.out.println("02");
		
		System.out.printf("Resultado do jogo do bicho de hoje: %d%d %d%d",2,5,8,9);	
		
		Scanner entrada = new Scanner(System.in);
		/* O SCanner irá escanear a entrada de dados pelo teclado do usuário, porém precisa mais funcionalidades que será mostrada abaixo
		 * Neste caso só "ativamos" o recurso, tendo que fechalo usando o nome.close()
		 * 
		 * Lendo o comando.
		 * Scanner - "Função" que irá scanear as entradar
		 * entrada - Nome da "função"
		 * = new - atribuição a função
		 * Scanner(System.in) - O Scanner irá pegar a entrada do usuário
		 * 
		 * Ou seja, dizemos o recurso, damos um nome, a atribuímos a forma que no caso foi a entrada.
		 * 
		 * Para pegar a entrada:
		 * 
		 * Definimos o tipo da variável, colacamos o nome da mesma e atrbuímos a entrada atraves do tipo ou seja
		 * Inteiro:String nome = entrada.nextInt();
		 * String: String nome = entrada.nextLine();
		 * double:String nome = entrada.nextDouble();
		 * dentro outros, no eclipse basta colocar o nome.e apertar ctrl + espaço
		 */
		
		System.out.print("\n\nDigito o Primeiro Nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digito o seu último Nome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digito o seu ano de Nascimento: ");
		int nascimento = entrada.nextInt();
		entrada.next();
		/* Por que coloqui o entrada.nextLine(); após o .NextInt? 
		 * Porque após digitarmos o valor interiro e precionar enter, será inserido um caracter "\n" quebra de linha
		 * porém, o sistema entenderá como "25\n". Evitando assim que a próxima entrada seja "pulada".
		 * 
		 */
	
		
        //Calculo idade		
		int idade = 2022 - nascimento;
		
		System.out.printf("\n\n %s %s, você possue: %d anos!", nome,sobrenome,idade);
		
		entrada.close();
		// fechando o recurso de Scanner
	}

}

