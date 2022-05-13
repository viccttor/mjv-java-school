package com.mjv.javaSchool.atracao.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscreverArquivo {
	public static void escreverArquivo(String conteudo, String nomeArquivo) {
		
		try {
			File dir = new File("/estudo/mjv-java-school/agua-luz-output");
			if (!dir.exists())
				dir.mkdirs();
			
			Path path = Paths.get(dir.getAbsolutePath(),nomeArquivo);
			
			Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
