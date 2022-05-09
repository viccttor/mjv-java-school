package com.mjv.aguaLuz.atracao.app;

import com.mjv.aguaLuz.atracao.model.Contrato;
import com.mjv.aguaLuz.atracao.repository.ContratoRepository;
import com.mjv.aguaLuz.atracao.servico.GeradorArquivo;

public class SistemaAguaLuzNotification {

	public static void main(String[] args) {

		ContratoRepository rep = new ContratoRepository();
		Contrato contrato = rep.pegarUnicoContrato();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.txt(contrato);
		
	}

}