package com.mjvSchool.java.classes.date;

public class ValorVsReferencia {

	public static void main(String[] args) {

		int a = 2;
		int b = a; // Atribuição por valor
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		Date d1 = new Date(2,3,2021);
		Date d2 = d1; // Atribuição por referência
		
		d1.dia = 30;
		d2.mes = 4;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadra(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 10;
		System.out.println(c);
		alteraPrimitivo(c);// Por que não gerou impacto? Porque é tipo primitivo é passado por valor e não por referência
		System.out.println(c);
		
		int d =10;
		System.out.println(d);
		alteraPrimitivo2(d); // Mais um exemplo
		System.out.println(d);
	}
	
	static void voltarDataParaValorPadra(Date d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alteraPrimitivo (int c) {
		c++;
	}
	
	static void alteraPrimitivo2 (int d) {
		d = 11;
	}
	
}

