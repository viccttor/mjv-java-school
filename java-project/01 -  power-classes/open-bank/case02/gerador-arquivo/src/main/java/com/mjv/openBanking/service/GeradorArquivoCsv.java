package com.mjv.openBanking.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class GeradorArquivoCsv {
	public void escreverDisco(String geradorConteudoCsv) {
		LocalDate now = LocalDate.now();
		String nomeArquivo = now.toString() + "_movimentacao.csv";
		try {
			File diretorio = new File("/estudos/banco_central/movimentacaoes");
			if (!diretorio.exists())
				diretorio.mkdirs();

			Path path = Paths.get(diretorio.getAbsolutePath(), nomeArquivo);

			Files.write(path, geradorConteudoCsv.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
