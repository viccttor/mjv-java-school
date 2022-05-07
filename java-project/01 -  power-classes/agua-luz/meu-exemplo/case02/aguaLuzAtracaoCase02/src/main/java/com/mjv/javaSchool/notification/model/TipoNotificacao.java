package com.mjv.javaSchool.notification.model;

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
	
	public static TipoNotificacao getTipoNotificacaoSigla(String sigla) {
		for(TipoNotificacao tp: TipoNotificacao.values()) {
			if(tp.getSigla().equals(sigla)){
				return tp;
			}
		}
		return null;
	}
}
