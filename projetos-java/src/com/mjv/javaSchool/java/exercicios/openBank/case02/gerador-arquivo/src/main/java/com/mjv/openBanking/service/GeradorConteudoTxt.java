package com.mjv.openBanking.service;

import java.time.format.DateTimeFormatter;

import com.mjv.openBanking.model.Movimentacao;

public class GeradorConteudoTxt {

	public String gerar(Movimentacao movimentacao) {

		StringBuilder sb = new StringBuilder();
		sb.append(movimentacao.getData().format(DateTimeFormatter.ofPattern("yyyyMMdd")).toString().replaceAll("-", ""));
		String cpfCnpj = movimentacao.getCpfCnpj().replaceAll("[\\D]", "");
		Long cpfCnpjLong = Long.valueOf(cpfCnpj);
		String cpfCnpjFormatado = String.format("%014d", cpfCnpjLong);
		sb.append(cpfCnpjFormatado);
		
		String nome = movimentacao.getNomeCliente();
		if (nome.length() >= 30)
			sb.append(nome.substring(0, 30));
		else
			sb.append(String.format("%-30s", nome));

		sb.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("[\\D]", ""))));
		sb.append(movimentacao.getTipo().getSigla());

		if (movimentacao.getEstornada())
			sb.append("1");
		else
			sb.append("0");

		return sb.toString();
	}

} 
