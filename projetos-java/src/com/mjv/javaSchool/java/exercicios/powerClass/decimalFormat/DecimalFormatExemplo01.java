package com.mjv.javaSchool.java.exercicios.powerClass.decimalFormat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatExemplo01 {

	public static void main(String[] args) {

		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);
		System.out.println(df.format(124125434123123.123));

		// Aplicando o padrão Brasileiro

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');

		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(124125434123123.123));

	}

}
