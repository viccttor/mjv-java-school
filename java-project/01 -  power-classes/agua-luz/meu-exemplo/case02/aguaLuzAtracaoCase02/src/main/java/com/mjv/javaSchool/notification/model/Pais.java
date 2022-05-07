package com.mjv.javaSchool.notification.model;

public enum Pais {
	
	BRASIL("BR","Brasil","R$","dd/MM/yyyy H:MM"), 
	CANADA("CA","Canada","C$","MM/dd/yyyy H:MM"),
	ESTADOS_UNIDOS("US","Estados Unidos da América","$","MM/dd/yyyy H:MM");
	
	private String sigla;
	private String descricao;
	private String moeda;
	private String formatoData;
	
	private Pais(String sigla, String descricao, String moeda, String formatoData) {
		this.sigla = sigla;
		this.descricao = descricao;
		this.moeda = moeda;
		this.formatoData = formatoData;
	}
	
	public String getFormatoData() {
		return formatoData;
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
	
	
}
