package com.mjv.javaSchool.notificacao.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.mjv.javaSchool.atracao.model.Pais;

public class FormatadorUtil {

	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0, 3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);
		String cpfFormatador = String.format("%s.%s.%s5-%s", part1, part2, part3, part4);
		return cpfFormatador;
	}

	public static String formatarCep(String cep) {
		String part1 = cep.substring(0, 2);
		String part2 = cep.substring(2, 5);
		String part3 = cep.substring(5, 8);
		String cpfFormatador = String.format("%s.%s-%s", part1, part2, part3);
		return cpfFormatador;
	}

	public static String formatarDataHora(LocalDateTime data, Pais pais) {
		for (Pais p : Pais.values()) {
			if (p.getDescricao().equalsIgnoreCase(pais.getDescricao().toString())) {
				DateTimeFormatter dataFormatador = DateTimeFormatter.ofPattern(pais.getFormatoData());
				String dataFormatada = data.format(dataFormatador);
				return dataFormatada.toString();
			}
		}
		return null;
	}

//	public static String formatarValor(Double valor, Pais pais) {
//		String compararPais = pais.toString();
//		if(compararPais.equalsIgnoreCase("BRASIL")) {
//			String valorFormatadoBr = valor.toString().replace(".", ",");
//			return String.format("R$ %s", valorFormatadoBr);
//		} else if(compararPais.equalsIgnoreCase("CANADA")) {
//			return String.format("C$ %.2f", valor);
//		} else if(compararPais.equalsIgnoreCase("ESPANHA")) {
//			return String.format("€ %.2f", valor);
//		} else {
//			return null;
//		}
//	} 
//	
	// Muito feliz por ter conseguindo reduzir o código :)
	public static String formatarValor(Double valor, Pais pais) {
		for (Pais p : Pais.values()) {
			if (p.getDescricao().equalsIgnoreCase(pais.getDescricao().toString())) {
				if (p.getDescricao().equalsIgnoreCase("Brasil")) {
					String valorFormatadoBr = valor.toString().replace(".", ",");
					return String.format("%s %s", pais.getMoeda(), valorFormatadoBr);
				} else
					return String.format("%s %.2f", pais.getMoeda(), valor);
			}
		}
		return null;
	}
}
