package com.mjv.javaSchool.notificacao.service;

import com.mjv.javaSchool.atracao.util.EscreverArquivo;

public class GeradorMensagemTxt {
	public void GeradorMensagem(Mensagem mensagem) {
		
		String  conteudo = mensagem.getConteudo();
		
		String nomeArquivo = "contrato-xxx.txt";
		EscreverArquivo.escreverArquivo(conteudo, nomeArquivo);

	}
}
