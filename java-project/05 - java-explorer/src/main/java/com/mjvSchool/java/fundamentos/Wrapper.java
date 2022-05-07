package com.mjvSchool.java.fundamentos;

/**
 * @author viccttor
 */

/*
 * Mostrando o Wrapper. Que seria o Objeto dos tipos primitivos.
 * 
*/

public class Wrapper {

	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 1000;
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(b.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		System.out.println(s + 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '$';
		System.out.println(c.toString());
		
		String num = "20";
		
		Integer num1 = Integer.parseInt(num);
		System.out.println(num1);
		
		Double num2 = Double.parseDouble(num);
		System.out.println(num2);
	}

}
