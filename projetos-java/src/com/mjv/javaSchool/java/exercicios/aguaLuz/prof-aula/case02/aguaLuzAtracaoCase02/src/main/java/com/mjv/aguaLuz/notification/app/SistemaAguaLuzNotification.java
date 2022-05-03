package com.mjv.aguaLuz.notification.app;

import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.repository.ContratoRepository;
import com.mjv.aguaLuz.notification.servico.GeradorArquivo;

public class SistemaAguaLuzNotification {

	public static void main(String[] args) {

		ContratoRepository rep = new ContratoRepository();
		Contrato contrato = rep.pegarUnicoContrato();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.txt(contrato);
		
	}

}