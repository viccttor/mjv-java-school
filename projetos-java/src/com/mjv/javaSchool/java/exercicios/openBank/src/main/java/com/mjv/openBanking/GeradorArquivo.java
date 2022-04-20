package com.mjv.openBanking;

import java.time.LocalDate;

public class GeradorArquivo {

	public static void main(String[] args) {

		Movimentacao mov1 = new Movimentacao();
		mov1.setData(LocalDate.now());
		
		System.out.println(mov1.getData());
	}

}
