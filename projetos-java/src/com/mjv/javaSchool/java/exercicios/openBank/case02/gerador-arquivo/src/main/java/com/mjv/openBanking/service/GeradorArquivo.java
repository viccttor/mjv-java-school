package com.mjv.openBanking.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class GeradorArquivo {
	public void escreverDisco(String geradorConteudo) {
		LocalDate now = LocalDate.now();
		String nomeArquivo = now.toString() + "_movimentacao.txt";
		try {
			File diretorio = new File(
					"/gitHub/mjv-java-school/projetos-java/src/com/mjv/javaSchool/java/exercicios"
							+ "/openBank/banco_central/movimentacaoes/case02");
			if (!diretorio.exists())
				diretorio.mkdirs();

			Path path = Paths.get(diretorio.getAbsolutePath(), nomeArquivo);

			Files.write(path, geradorConteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
