package com.mjvSchool.java.classes.date;

public class DateMain {

	public static void main(String[] args) {

		Date d1 = new Date(29, 03, 2022);
		
		Date d2 = new Date();
		
		System.out.printf(d1.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
	}

}
