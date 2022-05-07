package com.mjvSchool.java.arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunosA = new double[4];
		System.out.println(Arrays.toString(notasAlunosA)); 
		notasAlunosA[0] = 8.2;
		notasAlunosA[1] = 9.0;
		notasAlunosA[2] = 7.9;
		notasAlunosA[3] = 5.9;
		System.out.println(Arrays.toString(notasAlunosA)); 
		
		double total = 0;
		for (int i =0; i < notasAlunosA.length; i++) {
			 total += notasAlunosA[i];
			System.out.println(total);
		}
		System.out.println(total/4);
		
		double[] notasAlunosB = {6.2,9.8,8.4,7.0};
		System.out.println("\n\n" + Arrays.toString(notasAlunosB));
		
		double totalb = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalb+=notasAlunosB[i];
			System.out.println(totalb);
		}
		
		System.out.println(totalb/3);
	}

}
