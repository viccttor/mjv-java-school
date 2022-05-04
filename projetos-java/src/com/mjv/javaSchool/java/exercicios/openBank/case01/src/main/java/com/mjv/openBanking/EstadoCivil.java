package com.mjv.openBanking;

public enum EstadoCivil {
	SOLTEIRO("S"),
	CASADO("C"),
	DIVORCIADO("D");
	
	private String sigla;
	private EstadoCivil (String sigla) {
		this.sigla = sigla;
	}
	
	public String getSigla(	) {
		return sigla;
	}

}
