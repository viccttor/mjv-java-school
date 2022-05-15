package com.mjv.javaSchool.iapoiBanking.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscreverArquivoUtil {
	public static void escreverArquivo(String local, String nomeArquivo, String conteudo) {
		
		try {
			File dir = new File(local);
			if (!dir.exists())
				dir.mkdirs();
			
			Path path = Paths.get(dir.getAbsolutePath(),nomeArquivo);
			
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
