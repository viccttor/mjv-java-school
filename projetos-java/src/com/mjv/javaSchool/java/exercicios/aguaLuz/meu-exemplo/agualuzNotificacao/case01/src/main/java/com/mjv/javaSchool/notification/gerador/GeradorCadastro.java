package com.mjv.javaSchool.notification.gerador;

public class GeradorCadastro {

	private String nome;
	private String cpf;
	private GeradorEndereco endereco;
	
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
	public GeradorEndereco getEndereco() {
		return endereco;
	}
	public void setEndereco(GeradorEndereco endereco) {
		this.endereco = endereco;
	}
	

}
