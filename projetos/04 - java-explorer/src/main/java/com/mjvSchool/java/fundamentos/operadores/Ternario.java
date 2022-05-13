package com.mjvSchool.java.fundamentos.operadores;

import java.util.Scanner;

/**
 * @author viccttor
 */

/*
 * Exemplos com Atribui��o com Ternarios
 * 
 * Oper��o de atribui��o condicional
 * 
*/

public class Ternario {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		// Recebimento dos dados
		System.out.print("Informe o nome do Aluno: ");
		String nome = teclado.nextLine();
		System.out.print("Informe a m�dia do aluno: ");
		String media = teclado.next().replace(",", ".");
				
		// Opera��es e Convers�es
		
		Double converterMedia = Double.parseDouble(media);
		String resultadoFinal = converterMedia >= 7 ? " aprovado " 
							  : converterMedia >= 5 ? "em recupera��o" : " reprovado(a)";
							  /*o operador funcinado utilizando o primeiro caso como verdadeiro e o segundo como falso
							   * podendo adicionar mais de uma caso utilizando uma nova opera��o. Conforme o exemplo
							   * a cima
							   */
				
		System.out.printf("O Aluno %s, teve m�dia de: %s . Portanto o mesmo esta %s.",nome,media,resultadoFinal);
		
		teclado.close();

	}

}
