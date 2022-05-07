package com.mjvSchool.java.controle;

/**
 * @author viccttor
 * 
 */

/*
 * Continue, tem a função direfeten com a do break, pois interrompe apenas aquela condição ou repetição
 * 
 **/

public class Continue {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("FIM!");

	}

}
