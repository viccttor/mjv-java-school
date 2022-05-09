package com.mjv.javaSchool.atracao.model;

public enum TipoNotificacao {
	SMS("S"),
	WHATS("W");
	
	private String sigla;
	
	private TipoNotificacao(String sigla) {
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public static TipoNotificacao getTipoNotificacao(String sgla) {
		for(TipoNotificacao tp: TipoNotificacao.values()) {
			if(tp.getSigla().equals(sgla)) {
				return tp;
			}
		}
		return null;
	}
}
