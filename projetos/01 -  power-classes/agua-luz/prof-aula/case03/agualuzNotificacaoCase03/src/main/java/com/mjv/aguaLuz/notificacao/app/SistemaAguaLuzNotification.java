package com.mjv.aguaLuz.notificacao.app;

import com.mjv.aguaLuz.atracao.model.Contrato;
import com.mjv.aguaLuz.notificacao.repository.ContratoTxtRepository;
import com.mjv.aguaLuz.notificacao.servico.GeradorMensagem;

public class SistemaAguaLuzNotification {

	public static void main(String[] args) {

		ContratoTxtRepository rep = new ContratoTxtRepository();
		
		Contrato contrato =  rep.buscar();
		
		GeradorMensagem gm = new GeradorMensagem();
		
		gm.gerar(contrato);
		
	}

}