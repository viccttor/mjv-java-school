package com.mjv.openBanking.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.mjv.openBanking.model.Movimentacao;
import com.mjv.openBanking.model.TipoMovimentacao;

public class CnabCsvRepository {
	public Movimentacao buscar() {
		Movimentacao movimentacao = new Movimentacao();
		LocalDate now = LocalDate.now();
		String nomeArquivo = now.toString() + "_movimentacao.txt";
		try {
			byte[] bytes = Files.readAllBytes(
					Paths.get("/estudos/banco_central/movimentacaoes", nomeArquivo));
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
		return movimentacao;

	}
}
