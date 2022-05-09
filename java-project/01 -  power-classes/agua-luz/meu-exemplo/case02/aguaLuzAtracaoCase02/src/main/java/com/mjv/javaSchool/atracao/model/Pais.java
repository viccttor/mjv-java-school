package com.mjv.javaSchool.atracao.model;

public enum Pais {
	
	BRASIL("BR","Brasil","R$","dd/MM/yyyy H:MM"), 
	CANADA("CA","Canadá","C$","MM/dd/yyyy H:MM"),
	ESTADOS_UNIDOS("US","Estados Unidos da América","$","MM/dd/yyyy H:MM");
	
	private String sigla;
	private String descricao;
	private String moeda;
	private String formatoDataHora;
	
	private Pais(String sigla, String descricao, String moeda, String formatoData) {
		this.sigla = sigla;
		this.descricao = descricao;
		this.moeda = moeda;
		this.formatoDataHora = formatoData;
	}
	
	public String getFormatoData() {
		return formatoDataHora;
	}
	
	public String getMoeda() {
		return moeda;
	}
	public String getDescricao() {
		return descricao;
	}

	public String getSigla() {
		return sigla;
	}
	
	public static Pais getPaisSigla(String sigla) {
		for(Pais pS: Pais.values()) {
			if(pS.getSigla().equals(sigla)) {
				return pS;
			}
		}
		return null;
	}
	
}
