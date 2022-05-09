package com.mjv.aguaLuz.atracao.model;

import java.time.LocalDateTime;

public class Contrato {

	private Long numeroProtocolo;
	private Servico servico;
	private Double valor;
	private LocalDateTime dataHora;
	private Cadastro cliente;
	private TipoNotificacao tipoNotificacao;

	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}

	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
		this.valor = servico.getValor();
	}

	public Double getValor() {
		return valor;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Cadastro getCliente() {
		return cliente;
	}

	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Contrato [numeroProtocolo=" + numeroProtocolo + ", servico=" + servico + ", valor=" + valor
				+ ", dataHora=" + dataHora + ", cliente=" + cliente + ", tipoNotificacao=" + tipoNotificacao + "]";
	}

}