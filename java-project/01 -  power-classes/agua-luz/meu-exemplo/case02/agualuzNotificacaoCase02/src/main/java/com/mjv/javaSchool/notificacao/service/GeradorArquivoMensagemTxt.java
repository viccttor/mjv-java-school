package com.mjv.javaSchool.notificacao.service;

import com.mjv.javaSchool.atracao.util.EscreverArquivo;

public class GeradorArquivoMensagemTxt {
	public void GeradorArquivoMensagem(Mensagem mensagem) {
		
		String  conteudo = mensagem.getConteudo();
		
		String nomeArquivo = "contrato-xxx.txt";
		EscreverArquivo.escreverArquivo(conteudo, nomeArquivo);

	}
}
