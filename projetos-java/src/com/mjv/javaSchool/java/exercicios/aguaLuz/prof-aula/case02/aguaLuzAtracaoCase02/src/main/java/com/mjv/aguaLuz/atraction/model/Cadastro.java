package com.mjv.aguaLuz.atraction.model;

public class Cadastro {
	
	private String nome;
	private String cpf;
	private String rg;
	private String protocolo;
	private Endereco endereco;
	private Pais pais;
	private String celular;
	
	public String getCelular() {
		return celular;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
		
	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", endereco=" + endereco + ", pais=" + pais
				+ ", celular=" + celular + "]";
	}
	
}