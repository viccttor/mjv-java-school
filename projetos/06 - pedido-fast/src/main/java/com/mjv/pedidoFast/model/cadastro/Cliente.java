package com.mjv.pedidoFast.model.cadastro;

public class Cliente {
	private String nome;
	private String cpf;
	private Integer id;
	private String whastapp;
	private Endereco endereco;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWhastapp() {
		return whastapp;
	}

	public void setWhastapp(String whastapp) {
		this.whastapp = whastapp;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
