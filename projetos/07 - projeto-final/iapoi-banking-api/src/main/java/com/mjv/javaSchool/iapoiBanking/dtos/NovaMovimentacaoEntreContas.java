package com.mjv.javaSchool.iapoiBanking.dtos;

public class NovaMovimentacaoEntreContas {

	private Double valor;
	private Integer idContaPagadora;
	private Integer idContaRecebedora;
	private String descricaoPagador;
	private String descricaoRecebedor;

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

	public String getDescricaoPagador() {
		return descricaoPagador;
	}

	public void setDescricaoPagador(String descricaoPagador) {
		this.descricaoPagador = descricaoPagador;
	}

	public String getDescricaoRecebedor() {
		return descricaoRecebedor;
	}

	public void setDescricaoRecebedor(String descricaoRecebedor) {
		this.descricaoRecebedor = descricaoRecebedor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


}
