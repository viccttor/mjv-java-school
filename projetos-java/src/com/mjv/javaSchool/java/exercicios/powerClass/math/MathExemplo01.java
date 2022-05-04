package com.mjv.javaSchool.java.exercicios.powerClass.math;

public class MathExemplo01 {

	public static void main(String[] args) {
		
		Double num = 20.5;
		Double potencia = Math.pow(num, 2);
		Double raiz = Math.sqrt(num);
		System.out.println("O valor de PI é: " + Math.PI);
		System.out.println(String.format("\nO número %.2f elevado por 2 é: %.2f", num,potencia));
		System.out.println(String.format("\nA raiz quadara de %.2f : %.2f", num,raiz));
		
	}

}
