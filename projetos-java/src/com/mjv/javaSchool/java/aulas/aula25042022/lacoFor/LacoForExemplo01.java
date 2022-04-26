package com.mjv.javaSchool.java.aulas.aula25042022.lacoFor;

public class LacoForExemplo01 {

	public static void main(String[] args) {

		LacoForExemplo01.Decremento(20);
		
	}
	
	static void Decremento(int num) {
for (int i = num; i >= 0; i-=2) {
			
			System.out.println(i);
			
		}
	}

}
