package com.mjv.aguaLuz.notification.app;

import com.mjv.aguaLuz.atraction.model.Contrato;
import com.mjv.aguaLuz.notification.repository.ContratoTxtRepository;
import com.mjv.aguaLuz.notification.servico.GeradorMensagem;

public class SistemaAguaLuzNotification {

	public static void main(String[] args) {

		ContratoTxtRepository rep = new ContratoTxtRepository();
		
		Contrato contrato =  rep.buscar();
		
		GeradorMensagem gm = new GeradorMensagem();
		
		gm.gerar(contrato);
		
	}

}