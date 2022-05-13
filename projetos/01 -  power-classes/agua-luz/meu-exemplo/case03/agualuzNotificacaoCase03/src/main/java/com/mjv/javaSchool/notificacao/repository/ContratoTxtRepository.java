package com.mjv.javaSchool.notificacao.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.mjv.javaSchool.atracao.model.Cadastro;
import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.atracao.model.Endereco;
import com.mjv.javaSchool.atracao.model.Pais;
import com.mjv.javaSchool.atracao.model.TipoNotificacao;
import com.mjv.javaSchool.atracao.model.TipoServico;

public class ContratoTxtRepository {
	String nomeArquivo = "agua-luz-contratos.txt";

	public Contrato buscarContrato() {
		Contrato contrato = new Contrato();
		try {
			byte[] bytes = Files.readAllBytes(Paths.get("/estudo/mjv-java-school/agua-luz-output", nomeArquivo));
			String conteudo = new String(bytes);

			Cadastro cliente = new Cadastro();
			cliente.setCpf(conteudo.substring(0, 11));
			cliente.setRg(conteudo.substring(11, 21).trim());
			cliente.setNome(conteudo.substring(21, 51).trim());
			cliente.setCelular(conteudo.substring(51, 62));

			Endereco endereco = new Endereco();
			endereco.setLagradouro(conteudo.substring(62, 82).trim());
			endereco.setNumResidencia(conteudo.substring(82, 88));
			endereco.setComplemento(conteudo.substring(88, 98).trim());
			endereco.setBairro(conteudo.substring(98, 113).trim());
			endereco.setCidade(conteudo.substring(113, 143).trim());
			endereco.setEstado(conteudo.substring(143, 145).trim());
			endereco.setCep(conteudo.substring(145, 153));
			endereco.setPais(Pais.getPaisSigla(conteudo.substring(153, 155)));
			cliente.setEndereco(endereco);
			contrato.setCliente(cliente);

			contrato.setNumProtocolo(conteudo.substring(155, 165));
			DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
			LocalDateTime data = LocalDateTime.parse(conteudo.substring(165, 177), formatoData);
			contrato.setDataHora(data);
			contrato.setTipoServico(TipoServico.getTipoServico(conteudo.substring(177, 178)));
			Double valor = Double.valueOf(conteudo.substring(179, 186)) / 100;
			contrato.setValor(valor);
			contrato.setTipoNotificacao(TipoNotificacao.getTipoNotificacao(conteudo.substring(186, 187)));

		} catch (IOException e) {
			e.printStackTrace();
		}
		return contrato;
	}

}
