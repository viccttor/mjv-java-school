package com.mjv.javaSchool.atracao.app;

import java.util.List;

import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.atracao.repository.ContratoRepository;
import com.mjv.javaSchool.atracao.service.GeradorArquivoCsv;
import com.mjv.javaSchool.atracao.service.GeradorArquivoTxt;

public class SistemaAguaLuzAtracao {

	public static void main(String[] args) {

		ContratoRepository rep = new ContratoRepository();
		List<Contrato> contratos = rep.lista();
		GeradorArquivoCsv gac = new GeradorArquivoCsv();
		gac.gerarArquivoCsv(contratos);
		
		GeradorArquivoTxt gat = new GeradorArquivoTxt();
		gat.gerarArquivoTxt(contratos);
	}

}
