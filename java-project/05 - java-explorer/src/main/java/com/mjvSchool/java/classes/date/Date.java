package com.mjvSchool.java.classes.date;

public class Date {
	
	
	int dia;
	int mes;
	int ano;
	
	Date () {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Date (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "\n%d/%d/%d";
		return String.format(formato,dia,mes,ano);	
	}
	
	String imprimirDataFormatada () {
		return String.format("\n%d/%d/%d",dia,mes,ano);
		
	}
	
	
}
