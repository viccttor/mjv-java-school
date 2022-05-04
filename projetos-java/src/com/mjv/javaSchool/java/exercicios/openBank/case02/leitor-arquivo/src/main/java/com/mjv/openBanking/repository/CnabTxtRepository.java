package com.mjv.openBanking.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.mjv.openBanking.model.Movimentacao;

public class CnabTxtRepository {
	
	public Movimentacao buscar() {
		try {
			byte[] bytes = Files.readAllBytes(Paths.get("/gitHub/mjv-java-school/projetos-java/src/com/mjv/javaSchool/java/exercicios"
								+ "/openBank/banco_central/movimentacaoes/case02","2022-05-04_movimentacao.txt"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
			
}
