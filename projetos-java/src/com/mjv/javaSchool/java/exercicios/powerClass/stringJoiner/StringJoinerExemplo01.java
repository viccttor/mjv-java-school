package com.mjv.javaSchool.java.exercicios.powerClass.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerExemplo01 {

	public static void main(String[] args) {

	// Usado para construir um sequ�ncia de caracteres separados por delimitador.
		
		StringJoiner teste01 = new StringJoiner(",");
		teste01.add("Ol�");
		teste01.add(" Mundo!");
		teste01.setEmptyValue(" Mundo!");
		
		System.out.println(teste01);
		
		System.out.println("Sai maldi��o: " + teste01);
	}

}
