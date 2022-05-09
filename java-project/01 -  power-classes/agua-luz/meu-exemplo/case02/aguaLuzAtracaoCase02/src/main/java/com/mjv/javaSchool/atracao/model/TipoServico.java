package com.mjv.javaSchool.atracao.model;

public enum TipoServico {
	AGUA("A","Água",137.21),
	LUZ("L","Energia",132.15);

	private String sigla;
	private String descricao;
	private Double valor;
	
	private TipoServico(String sigla, String descricao, Double valor) {
		this.sigla = sigla;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
	
	public static TipoServico getTipoServico(String sigla) {
		for(TipoServico tp: TipoServico.values()) {
			if(tp.getSigla().equals(sigla)) {
				return tp;
			}
		}
		return null;
	}
	
}
