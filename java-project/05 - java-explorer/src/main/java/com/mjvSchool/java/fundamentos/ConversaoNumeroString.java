package com.mjvSchool.java.fundamentos;

/**
 * @author viccttor
 */

/*
 * Algumas formas de conversao de números em String
 * 
*/

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		// Forma 01

		Integer a = 1000; 
		System.out.println(a.toString());
		System.out.println(a.toString().length());

		// Forma 02

		int b = 1212;
		System.out.println(Integer.toString(b));
		System.out.println(Integer.toString(b).length());
		
		// Forma 03
		
		int c = 123123;
		System.out.println((""+ c));
		System.out.println((""+ c).length());
		
		
		
		

	}

}
