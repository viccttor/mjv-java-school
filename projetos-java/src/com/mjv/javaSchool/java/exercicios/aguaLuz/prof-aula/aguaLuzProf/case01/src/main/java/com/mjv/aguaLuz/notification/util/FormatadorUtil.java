package com.mjv.aguaLuz.notification.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorUtil {

	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3,6);
		String part3 = cpf.substring(6,9);
		String part4 = cpf.substring(9,11);
		String cpfFormatador = String.format("%s.%s.%s5-%s", part1,part2,part3,part4);
		return cpfFormatador;
	}
	
	public static String formatarCep(String cep) {
		String part1 = cep.substring(0,2);
		String part2 = cep.substring(2,5);
		String part3 = cep.substring(5,8);
		String cpfFormatador = String.format("%s.%s-%s", part1,part2,part3);
		return cpfFormatador;
	}
	
	public static String formatarDataHora (LocalDateTime data) {
		DateTimeFormatter dataFormatador = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm");
		String dataFormatada = data.format(dataFormatador);
		return dataFormatada.toString();
	}
	
}
