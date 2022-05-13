package com.mjv.javaSchool.atracao.model;

public class Cadastro {

	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", rg=" + rg + ", celular="
				+ celular + "]";
	}
	private String nome;
	private String cpf;
	private Endereco endereco;
	private String rg;
	private String celular;
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
