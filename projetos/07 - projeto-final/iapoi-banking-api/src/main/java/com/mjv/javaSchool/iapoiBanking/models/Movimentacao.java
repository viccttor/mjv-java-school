package com.mjv.javaSchool.iapoiBanking.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "movimentacao")
public class Movimentacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "data_hora", length = 30)
	private LocalDateTime dataHora;
	
	@Column(name = "descricao", length = 255)
	private String descricao;
	
	@Column(name = "valor")
	private Double valor;
	
	@Column(name = "conta_id")
	private Integer idConta;
	
	@Enumerated(EnumType.STRING)
	private FormaMovimentacao formaMovimentacao;

	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipoMovimentacao;

	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
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
	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	public FormaMovimentacao getFormaMovimentacao() {
		return formaMovimentacao;
	}
	public void setFormaMovimentacao(FormaMovimentacao formaMovimentacao) {
		this.formaMovimentacao = formaMovimentacao;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	
	

}
