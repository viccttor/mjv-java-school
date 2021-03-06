package com.mjv.javaSchool.atracao.model;

public class Endereco {
	
	@Override
	public String toString() {
		return "Endereco [lagradouro=" + lagradouro + ", numResidencia=" + numResidencia + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep
				+ ", pais=" + pais + "]";
	}
	private String lagradouro;
	private String numResidencia;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private Pais pais;
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getLagradouro() {
		return lagradouro;
	}
	public void setLagradouro(String lagradouro) {
		this.lagradouro = lagradouro;
	}
	public String getNumResidencia() {
		return numResidencia;
	}
	public void setNumResidencia(String numResidencia) {
		this.numResidencia = numResidencia;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
