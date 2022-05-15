package com.mjv.javaSchool.notificacao.service;

import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.atracao.util.EscreverArquivo;
import com.mjv.javaSchool.notificacao.repository.ContratoTxtRepository;

public class GeradorArquivoMensagemTxt {
	public void GeradorArquivoMensagem(Mensagem mensagem) {
		ContratoTxtRepository contrato = new ContratoTxtRepository();
		Contrato cliente = contrato.buscarContrato();
		
		String  conteudo = mensagem.getConteudo();
		
		String nomeArquivo = ("contrato-cpf-"+ cliente.getCliente().getCpf()+".txt");
		EscreverArquivo.escreverArquivo(conteudo, nomeArquivo);

	}
}
