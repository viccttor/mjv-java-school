package com.mjv.javaSchool.atracao.service;

import java.util.List;

import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.atracao.util.EscreverArquivo;

public class GeradorArquivoCsv {

	public void gerarArquivoCsv(List<Contrato> contratos) {
		StringBuilder gac = new StringBuilder();

		for (Contrato c : contratos) {
			gac.append(c.getCliente().getCpf().replaceAll("[\\D]", "") + ";");
			gac.append(c.getCliente().getRg().replaceAll("[\\D]", "") + ";");
			gac.append(c.getCliente().getNome() + ";");
			gac.append(c.getCliente().getCelular().replaceAll("[\\D]", "") + ";");
			gac.append(c.getCliente().getEndereco().getNumResidencia() + ";");
			gac.append(c.getCliente().getEndereco().getComplemento() + ";");
			gac.append(c.getCliente().getEndereco().getBairro() + ";");
			gac.append(c.getCliente().getEndereco().getCidade() + ";");
			gac.append(c.getCliente().getEndereco().getEstado() + ";");
			gac.append(c.getCliente().getEndereco().getCep() + ";");
			gac.append(c.getCliente().getEndereco().getPais() + ";");
			gac.append(c.getNumProtocolo() + ";");
			gac.append(c.getDataHora() + ";");
			gac.append(c.getTipoServico() + ";");
			gac.append(c.getValor() + ";");
			gac.append(c.getTipoNotificacao() + ";");

			System.out.println(gac.toString().toUpperCase());

			String nomeArquivo = "agua-luz-contratos.csv";
			EscreverArquivo.escreverArquivo(gac.toString().toUpperCase(), nomeArquivo);
		}

	}
}
