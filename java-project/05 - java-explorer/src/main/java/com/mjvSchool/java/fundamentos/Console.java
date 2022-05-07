package com.mjvSchool.java.fundamentos;

/**
 * @author viccttor
 */

/*
 * Algumas fun��es do Scanner
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
		/* O SCanner ir� escanear a entrada de dados pelo teclado do usu�rio, por�m precisa mais funcionalidades que ser� mostrada abaixo
		 * Neste caso s� "ativamos" o recurso, tendo que fechalo usando o nome.close()
		 * 
		 * Lendo o comando.
		 * Scanner - "Fun��o" que ir� scanear as entradar
		 * entrada - Nome da "fun��o"
		 * = new - atribui��o a fun��o
		 * Scanner(System.in) - O Scanner ir� pegar a entrada do usu�rio
		 * 
		 * Ou seja, dizemos o recurso, damos um nome, a atribu�mos a forma que no caso foi a entrada.
		 * 
		 * Para pegar a entrada:
		 * 
		 * Definimos o tipo da vari�vel, colacamos o nome da mesma e atrbu�mos a entrada atraves do tipo ou seja
		 * Inteiro:String nome = entrada.nextInt();
		 * String: String nome = entrada.nextLine();
		 * double:String nome = entrada.nextDouble();
		 * dentro outros, no eclipse basta colocar o nome.e apertar ctrl + espa�o
		 */
		
		System.out.print("\n\nDigito o Primeiro Nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digito o seu �ltimo Nome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digito o seu ano de Nascimento: ");
		int nascimento = entrada.nextInt();
		entrada.next();
		/* Por que coloqui o entrada.nextLine(); ap�s o .NextInt? 
		 * Porque ap�s digitarmos o valor interiro e precionar enter, ser� inserido um caracter "\n" quebra de linha
		 * por�m, o sistema entender� como "25\n". Evitando assim que a pr�xima entrada seja "pulada".
		 * 
		 */
	
		
        //Calculo idade		
		int idade = 2022 - nascimento;
		
		System.out.printf("\n\n %s %s, voc� possue: %d anos!", nome,sobrenome,idade);
		
		entrada.close();
		// fechando o recurso de Scanner
	}

}

