package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Operações Switch, sem utilziar o break
 * 
 * O switch é uma estrutura que é melhor utilizada na execução de casos específicos
 * 
 */

public class SwithcSemBreak {

	public static void main(String[] args) {

		String faixa = "marron";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marron":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Hein Sandan...");
		case "vermelha":
			System.out.println("Sei o Hein Nidan...");
		case "amarela":
			System.out.println("Sei o Hei Shodan...");
		}
	}

}
