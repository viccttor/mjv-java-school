package com.mjv.openBanking.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.mjv.openBanking.model.Movimentacao;
import com.mjv.openBanking.model.TipoMovimentacao;

public class CnabTxtRepository {

	public Movimentacao buscar() {
		Movimentacao movimentacao = new Movimentacao();
		try {
			byte[] bytes = Files.readAllBytes(
					Paths.get("/gitHub/mjv-java-school/projetos-java/src/com/mjv/javaSchool/java/exercicios"
							+ "/openBank/banco_central/movimentacaoes/case02", "2022-05-04_movimentacao.txt"));
			String conteudo = new String(bytes);

			DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDate data = LocalDate.parse(conteudo.substring(0, 8), formatoData);
			movimentacao.setData(data);
			movimentacao.setCpfCnpj(conteudo.substring(8, 22));
			movimentacao.setNomeCliente(conteudo.substring(22, 52));
			Double valor = Double.valueOf(conteudo.substring(52, 62)) / 100;
			movimentacao.setValor(valor);
			movimentacao.setTipo(TipoMovimentacao.getServicoSigla(conteudo.substring(62, 63)));
			movimentacao.setEstornada(Boolean.valueOf(conteudo.substring(63, 64).equals("1")));

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(movimentacao.toString().toUpperCase());
		return movimentacao;

	}

}
