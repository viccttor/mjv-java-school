package com.mjv.openBanking.app;

import com.mjv.openBanking.model.Movimentacao;
import com.mjv.openBanking.repository.CnabCsvRepository;
import com.mjv.openBanking.repository.CnabTxtRepository;

public class SistemaLeitorArquivo {

	public static void main(String[] args) {
		// Ler TXT do Dia
		CnabTxtRepository cnabTxt = new CnabTxtRepository();
		Movimentacao movimentacaoTxt = cnabTxt.buscar();
		System.out.println("TXT: "+movimentacaoTxt);
		
		// Ler CSV do Dia
		CnabCsvRepository cnabCsv = new CnabCsvRepository();
		Movimentacao movimentacaoCsv = cnabCsv.buscar();
		System.out.println("CSV: "+movimentacaoCsv);
		
		

	}

}
