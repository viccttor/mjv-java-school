package com.mjvSchool.java.fundamentos;
/**
 * @author viccttor
 * 
 */

/* Mini programa para realizar o c�lculo da �rea da circunfer�ncia
Fins educacionais*/

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			double raio = 0;
			final double PI = 3.14;
			
			
			
			System.out.println("Programa para calcular � �rea da circinfer�ncia de um C�rculo \n ");
			System.out.println("Ditite o valor do raio: ");
			raio = scan.nextDouble();
			double area = PI * raio * raio;
			System.out.println("\n A �rea da circunfer�ncia �: " + area);
		}
		

	}

}
