package com.mjv.javaSchool.iapoiBanking.dtos;

import com.mjv.javaSchool.iapoiBanking.models.FormaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.models.TipoMovimentacao;

public class NovaMovimentacaoEntreContas {

	private Double valor;
	private Integer idContaPagadora;
	private Integer idContaRecebedora;
	private String descricao;
	private FormaMovimentacao formaMovimentacao;
	private TipoMovimentacao tipoMovimentacao;

	public FormaMovimentacao getFormaMovimentacao() {
		return formaMovimentacao;
	}

	public void setFormaMovimentacao(FormaMovimentacao formaMovimentacao) {
		this.formaMovimentacao = formaMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}

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
