package com.mjv.javaSchool.notificacao.app;

import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.notificacao.repository.ContratoTxtRepository;
import com.mjv.javaSchool.notificacao.service.GeradorMensagemTxt;
import com.mjv.javaSchool.notificacao.service.Mensagem;

public class SistemaAguaLuzNotificacao {
	public static void main(String[] args) {

		ContratoTxtRepository contrato = new ContratoTxtRepository();

		Contrato cliente = contrato.buscarContrato();
		Mensagem mensagem= new Mensagem();
		mensagem.gerarMensagem(cliente);
		
		GeradorMensagemTxt txt = new GeradorMensagemTxt();
		txt.GeradorMensagem(mensagem);
		
	}

}
