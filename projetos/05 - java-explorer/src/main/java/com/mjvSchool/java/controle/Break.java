package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Break, tem a função de quebrar ou parar o laço
 */

public class Break {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("FIM!");
	}

}
