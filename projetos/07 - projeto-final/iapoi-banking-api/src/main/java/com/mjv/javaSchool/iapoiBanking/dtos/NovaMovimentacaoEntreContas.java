package com.mjv.javaSchool.iapoiBanking.dtos;

public class NovaMovimentacaoEntreContas {

	private Double valor;
	private Integer idContaPagadora;
	private Integer idContaRecebedora;
	private String descricao;

	public Integer getIdContaPagadora() {
		return idContaPagadora;
	}

	public void setIdContaPagadora(Integer idContaPagadora) {
		this.idContaPagadora = idContaPagadora;
	}

	public Integer getIdContaRecebedora() {
		return idContaRecebedora;
	}

	public void setIdContaRecebedora(Integer idContaRecebedora) {
		this.idContaRecebedora = idContaRecebedora;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


}
