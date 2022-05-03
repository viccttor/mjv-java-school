package com.mjv.aguaLuz.atraction.app;

import com.mjv.aguaLuz.atraction.model.Contrato;
import com.mjv.aguaLuz.atraction.repository.ContratoRepository;
import com.mjv.aguaLuz.atraction.servico.GeradorArquivo;

public class SistemaAguaLuzNotification {

	public static void main(String[] args) {

		ContratoRepository rep = new ContratoRepository();
		Contrato contrato = rep.pegarUnicoContrato();
		
		GeradorArquivo ga = new GeradorArquivo();
		ga.txt(contrato);
		
	}

}