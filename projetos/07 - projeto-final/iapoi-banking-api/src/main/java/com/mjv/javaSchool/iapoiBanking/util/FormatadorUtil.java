package com.mjv.javaSchool.iapoiBanking.util;

public class FormatadorUtil {
	
	public static String formatarCpfdB(String cpf) {
		String cpfRecebido = cpf.replaceAll("\\D", "");
		String cpfFormatado = String.format("%11s", cpfRecebido);
		
		return cpfFormatado;
		
	}
	
}
