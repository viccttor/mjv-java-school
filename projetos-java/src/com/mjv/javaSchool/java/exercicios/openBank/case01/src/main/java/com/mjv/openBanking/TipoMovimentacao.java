package com.mjv.openBanking;

public enum TipoMovimentacao {

	RECEITA("R"), DESPESA("D");
	
	private String sigla;
	private TipoMovimentacao( String sigla) {
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}
	
	
}
