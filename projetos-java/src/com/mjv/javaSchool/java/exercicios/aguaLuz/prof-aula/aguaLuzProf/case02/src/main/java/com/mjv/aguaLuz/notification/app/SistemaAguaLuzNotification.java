package com.mjv.aguaLuz.notification.app;

import java.util.List;

import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.repository.ContratoRepository;
import com.mjv.aguaLuz.notification.servico.GeradorArquivo;

public class SistemaAguaLuzNotification {

	public static void main(String[] args) {

		ContratoRepository rep = new ContratoRepository();
		List<Contrato> contratos = rep.listar();
		GeradorArquivo ga = new GeradorArquivo();
		ga.csv(contratos);
		ga.txt(contratos);
		
	}

}