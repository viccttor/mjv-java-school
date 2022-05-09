package com.mjv.aguaLuz.atracao.util;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatadorUtil {

	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		String cpfFormatador = String.format("%s.%s.%s5-%s", part1,part2,part3,part4);
		return cpfFormatador;
	}
	
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String val = nf.format(11234.56);
		System.out.println(val);
		
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale ( new Locale("pt", "BR") );
		String output = today.format ( formatter );
		System.out.println(output);
	}
	
}