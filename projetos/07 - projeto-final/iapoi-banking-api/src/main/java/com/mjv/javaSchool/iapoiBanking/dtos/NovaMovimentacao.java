package com.mjv.javaSchool.iapoiBanking.dtos;

import com.mjv.javaSchool.iapoiBanking.models.FormaMovimentacao;
import com.mjv.javaSchool.iapoiBanking.models.TipoMovimentacao;

public class NovaMovimentacao {
	
	private Integer idConta;
	private String descricao;
	private Double valor;
	private FormaMovimentacao formaMovimentacao;
	private TipoMovimentacao tipoMovimentacao;
	
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
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

}
