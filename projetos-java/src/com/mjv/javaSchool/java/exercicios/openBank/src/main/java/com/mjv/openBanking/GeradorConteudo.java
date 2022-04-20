package com.mjv.openBanking;

public class GeradorConteudo {

	public String gerar(Movimentacao movimentacao) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(movimentacao.getData().toString().replaceAll("-", ""));
		sb.append(String.format("%014d", Long.valueOf(movimentacao.getCpfCnpj().replaceAll("[\\D]", ""))));
		String nome = movimentacao.getNomeCliente();
		
		if (nome.length() >= 30) 
			sb.append(nome.substring(0,30));
		else
			sb.append(String.format("%-29s", nome));
		
		sb.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("[\\D]", ""))));
		sb.append(movimentacao.getTipo().getSigla());
		
		if (movimentacao.getEstornada())
			sb.append("1");
		else
			sb.append("0");
				
		return sb.toString();
	}
	
}		//2022041600013521779118RAIMUNDO NONATO LOUREIRO CAST0000127548R0
		//2022041600013521779118RAIMUNDO NONATO LOUREIRO CAST0000127548R0

