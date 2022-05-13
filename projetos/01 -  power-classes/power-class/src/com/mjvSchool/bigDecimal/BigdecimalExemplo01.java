package com.mjvSchool.bigDecimal;

import java.math.BigDecimal;

public class BigdecimalExemplo01 {

	public static void main(String[] args) {

		// Com String
		BigDecimal big01 = new BigDecimal("0.5");
		BigDecimal big02 = new BigDecimal("0.7");
		BigDecimal resul01 = big01.add(big02);
		System.out.println(resul01.toString());

		// Com double
		BigDecimal big03 = new BigDecimal(0.5);
		BigDecimal big04 = new BigDecimal(0.7);
		BigDecimal resul02 = big03.add(big04);
		System.out.println(resul02.toString()); // Por isso se recomenda usar como String

		// Exemplos
		System.out.println("\n\nSubtrai");
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.1")));

		System.out.println("");
		System.out.println("Soma");
		System.out.println(new BigDecimal("2.00").add(new BigDecimal("1.2")));

		System.out.println("");
		System.out.println("Compara");
		System.out.println(new BigDecimal("2.00").compareTo(new BigDecimal("1.3")));

		System.out.println("");
		System.out.println("Divide");
		System.out.println(new BigDecimal("2.00").divide(new BigDecimal("2.00")));

		System.out.println("");
		System.out.println("Máximo");
		System.out.println(new BigDecimal("2.00").max(new BigDecimal("1.5")));

		System.out.println("");
		System.out.println("Mínimo");
		System.out.println(new BigDecimal("2.00").min(new BigDecimal("1.6")));

		System.out.println("");
		System.out.println("Potência");
		System.out.println(new BigDecimal("2.00").pow(2));

		System.out.println("");
		System.out.println("Multiplica");
		System.out.println(new BigDecimal("2.00").multiply(new BigDecimal("1.8")));

	}

}
