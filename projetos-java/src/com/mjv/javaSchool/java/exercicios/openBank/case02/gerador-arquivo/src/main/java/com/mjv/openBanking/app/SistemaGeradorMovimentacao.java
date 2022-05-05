package com.mjv.openBanking.app;

import java.time.LocalDate;

import com.mjv.openBanking.model.Movimentacao;
import com.mjv.openBanking.model.TipoMovimentacao;
import com.mjv.openBanking.service.GeradorArquivoTxt;
import com.mjv.openBanking.service.GeradorConteudoTxt;

public class SistemaGeradorMovimentacao {
	public static void main(String[] args) {
		
		Movimentacao mov1 = new Movimentacao();
		mov1.setData(LocalDate.of(2022,04,16));
		mov1.setCpfCnpj("135.217.791-18");
		mov1.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
		mov1.setValor(1275.48);
		mov1.setTipo(TipoMovimentacao.RECEITA);
		mov1.setEstornada(Boolean.TRUE);
		
		
		GeradorConteudoTxt gct = new GeradorConteudoTxt();
		String conteudoGerado = gct.gerar(mov1);
		
		GeradorArquivoTxt gat = new GeradorArquivoTxt();
		gat.escreverDisco(conteudoGerado);
		System.out.println(conteudoGerado);

		
	}

}
