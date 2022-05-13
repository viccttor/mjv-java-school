package com.mjv.openBanking.model;


public enum TipoMovimentacao {

	RECEITA("R"), DESPESA("D");
	
	private String sigla;
	private TipoMovimentacao( String sigla) {
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}
	
	public static TipoMovimentacao getServicoSigla(String sigla) {
		for(TipoMovimentacao tm: TipoMovimentacao.values()) {
			if(tm.getSigla().equals(sigla)) {
				return tm;
			}
		}
		return null;
	}
	
}
