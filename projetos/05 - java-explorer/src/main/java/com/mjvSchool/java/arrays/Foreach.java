package com.mjvSchool.java.arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] a = { 5.1,6.2,8.3,9.1};
		
		for (int i=0; i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (double as: a) {
			System.out.print(as + " ");
		}

	}

}
