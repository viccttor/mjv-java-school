package com.mjv.javaSchool.java.aulas.aula19042022;

public class Pessoa {

	String nome;
	String cpf;
	String endereco;

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf) {
		this(nome, cpf, "Não informado");
	}
	
	public Pessoa(String nome, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}
