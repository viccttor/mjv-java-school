package com.mjv.openBanking.app;

import com.mjv.openBanking.model.Movimentacao;
import com.mjv.openBanking.repository.CnabTxtRepository;

public class SistemaLeitorArquivo {

	public static void main(String[] args) {

		CnabTxtRepository cnab = new CnabTxtRepository();
		
		Movimentacao movimentacao = cnab.buscar();
		

	}

}
