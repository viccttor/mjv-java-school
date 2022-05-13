package com.mjvSchool.java.fundamentos;

/**
 * @author viccttor
 */

/*
 *  Alguns tipos de String
 * 
*/

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("caso 01".charAt(2));
		// o .charAt, pega o caracter que estiver na 2 casa(lembrando que a contagem come�a no 0)
		
		String s = "Buenos Dias";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Buenos"));
		System.out.println(s.startsWith("buenos"));
		System.out.println(s.startsWith("buenos"));
		// O .startsWith, identifica se a String come�a com o palavra colocada
		
		System.out.println(s.toLowerCase().startsWith("Buenos"));
		// Neste caso o .toLowerCase() deixa as letras minusculas, por isso deu negativo.
	
		System.out.println(s.endsWith("dias"));
		System.out.println(s.endsWith("Dias"));
		// O .startsWith, identifica se a String termina com o palavra colocada
		
		System.out.println(s.length());
		// . length conta a quantidade de caracteres
		
		System.out.println(s.equals("Buenos Dias"));
		System.out.println(s.equals("Buenos dias"));
		System.out.println(s.equalsIgnoreCase("buenos dias"));
		// .equals, compara a string e o IgnoreCase ignora as letras maiusculas e menusculas
		
		var nome = "Victor";
		var sobrenome = "Henrique";
		var idade = 23;
		var salario = 2.541;
		System.out.println("Nome: " + nome + "\tSobrenome: " + sobrenome + "\tIdade: " + idade + "\tSal�rio: " + salario);
		// a senten�a de c�digo ficou muito extensa
		
		System.out.printf("\n\nNome %s %s, tem %d anos e ganha R$%f por m�s.", nome,sobrenome,idade,salario);
		System.out.printf("\n\nOutra Forma: Nome %s %s, tem %d anos e ganha R$%.3f. por m�s.", nome,sobrenome,idade,salario);
		/* O que houve? simplismente as vari�veis foram subistitu�das pelos seguintes  "atalhos".
		 * %s - substitui por uma String
		 * %d - substitui por um numero inteiro
		 * %f - Substitui por um numero real. pode-se colocar a quantidade de casas decimais utilizando o: %.quantidadedecasasf.
		 * %b - Substitui par verdadeiro ou falso
		 * OBS: As vari�veis devem estar em sequ�ncia para que sejam substituidas na sequ�ncia informada.
		 */
		
		String frase = String.format("\n\nOutra Forma: Nome %s %s, tem %d anos e ganha R$%.3f. por m�s.", nome,sobrenome,idade,salario);
		System.out.println(frase);
		// Voc� pode colocar a em  uma String
		
		System.out.println("\nQualquer coisa");
		System.out.println("\nQualquer coisa".contains("coi"));
		System.out.println("\nQualquer coisa".indexOf("coi"));
		// . contains, identifica se h� naquela string a palavra ou frase informada
		// .index0f procura em que posi��o de caracter se inicia a frase ou palavra informada
		
		System.out.println("\nQualquer coisa".substring(6));
		// .substring, inicia a string a partir da posi��o informada
		System.out.println("\nQualquer coisa".substring(6,8));
		// .substring, inicia e termina a string a partir das posi��es informadas
		
		
		
	}
}


