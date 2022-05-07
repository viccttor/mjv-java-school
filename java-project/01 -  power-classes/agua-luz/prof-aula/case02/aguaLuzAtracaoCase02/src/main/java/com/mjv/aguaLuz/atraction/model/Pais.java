package com.mjv.aguaLuz.atraction.model;

public enum Pais {
	BRASIL("br"), ESTADOS_UNIDOS("US"), FRANCA("FR");

	private String sigla;

	private Pais(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

	public static Pais getPaisSigla(String sigla) {
		for (Pais p : Pais.values()) {
			if (p.getSigla().equals(sigla)) {
				return p;
			}
		}
		return null;
	}
}
