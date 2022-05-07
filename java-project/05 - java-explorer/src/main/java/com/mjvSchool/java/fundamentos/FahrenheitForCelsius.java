package com.mjvSchool.java.fundamentos;
/**
 * @author viccttor
 */

/*
 * Mini programa para realizar o cálculo de conversão de Fahrenheit para Celsius
Fins educacionais
*/

import java.util.Scanner;

public class FahrenheitForCelsius {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			
			double temp = 0;
			
			System.out.println("Digite a temperatura em Fahrenheit que deseja converter para Celsius: ");
			temp = scan.nextDouble();
			
			final double FORM = (temp-32)/1.8;
			double celsius = FORM;
			
			System.out.println("\nTemperatura é:  \n");
			System.out.println("Fahrenheit: " + temp + " ºF \t Celsius: " + celsius + " ºC");	
		}
		
		
	}
}
