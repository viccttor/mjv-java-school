package com.mjv.javaSchool.java.exercicios.powerClass.file;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

	public File(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Java IO Files

		String conteudoIo = "Exemplo - java.Io.File";
		String nomeArquivoIo = "fileIo.txt";

		java.io.File fileIo = new java.io.File("/gitHub/mjv-java-school/projetos-java/src/com/mjv/"
				+ "javaSchool/java/exercicios/powerClass/file/files/io");
		if(!fileIo.exists())
			fileIo.mkdirs();
		
		java.io.File arquivoIo = new java.io.File(fileIo, nomeArquivoIo);
		
		try (FileWriter fw = new FileWriter(arquivoIo)) { 
			arquivoIo.createNewFile();
			fw.write(conteudoIo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Java.nio.file.Files / Path / Paths
		
		

		// Java.nio.file.Path
		
		Path p1 = Paths.get("/gitHub/mjv-java-school/projetos-java/src/com/mjv/"
				+ "javaSchool/java/exercicios/powerClass/file/files/io/fileIo.txt");
		System.out.println(p1.getFileName());
		
		Path filePath = Paths.get("/gitHub/mjv-java-school/projetos-java/src/com/mjv/\"\r\n"
				+ "				+ \"javaSchool/java/exercicios/powerClass/file/files/path");
		

		// Java.nio.file.Paths

	}

}