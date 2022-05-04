package com.mjv.javaSchool.java.exercicios.powerClass.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExemplo01 {

	public static void main(String[] args) throws IOException {
		// Java IO Files

		String conteudoIo = "Exemplo - java.Io.File";
		String nomeArquivoIo = "fileIo.txt";

		java.io.File fileIo = new java.io.File("/gitHub/mjv-java-school/projetos-java/src/com/mjv/"
				+ "javaSchool/java/exercicios/powerClass/file/files/io");
		if (!fileIo.exists())
			fileIo.mkdirs();

		java.io.File arquivoIo = new java.io.File(fileIo, nomeArquivoIo);

		try (FileWriter fw = new FileWriter(arquivoIo)) {
			arquivoIo.createNewFile();
			fw.write(conteudoIo);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Java.nio.file.Files 
		
		String nomeArquivoFile = "fileFile.txt";
		String conteudoFile = "Exemplo - java.nio.File.File";
		
		
		String caminhoFile = "/gitHub/mjv-java-school/projetos-java/src/com/mjv/"
				+ "javaSchool/java/exercicios/powerClass/file/files/file";
		Path dirFile = Paths.get(caminhoFile);
		Files.createDirectories(dirFile);
		
		FileWriter fileTxt = new FileWriter("/gitHub/mjv-java-school/projetos-java/src/com/mjv/"
				+ "javaSchool/java/exercicios/powerClass/file/files/file/fileFile.txt");
		fileTxt.write(conteudoFile);
		fileTxt.close();
		
		
		// Java.nio.file.Path / Paths

		String nomeArquivoPath = "filePathPaths.txt";
		String conteudoPath = "Exemplo - java.nio.File.Path/Paths";

		Path p1 = Paths.get("/gitHub/mjv-java-school/projetos-java/src/com/mjv/"
				+ "javaSchool/java/exercicios/powerClass/file/files/io/fileIo.txt");
		System.out.println(p1.getFileName());

		Path pathEndereco = Paths.get("/gitHub/mjv-java-school/projetos-java/src/com/mjv/"
				+ "javaSchool/java/exercicios/powerClass/file/files/path");
		if (Files.notExists(pathEndereco)) {
			Path diretorioPath = Files.createDirectory(pathEndereco);
		}
		Path filePath = Paths.get(pathEndereco.toString(), nomeArquivoPath);
		if (Files.notExists(filePath)) {
			Path criarFilePath = Files.createFile(filePath);
		}
		Files.writeString(filePath, conteudoPath);


	}

}