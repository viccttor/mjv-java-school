package com.mjv.javaSchool.atracao.model;

import java.time.LocalDateTime;

public class Contrato {
	@Override
	public String toString() {
		return "Contrato [numProtocolo=" + numProtocolo + ", tipoServico=" + tipoServico + ", dataHora=" + dataHora
				+ ", valor=" + valor + ", cliente=" + cliente + ", tipoNotificacao=" + tipoNotificacao + "]";
	}
	private String numProtocolo;
	private TipoServico tipoServico;
	private LocalDateTime dataHora;
	private Double valor;
	private Cadastro cliente;
	private TipoNotificacao tipoNotificacao;
	
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	public String getNumProtocolo() {
		return numProtocolo;
	}
	public void setNumProtocolo(String numProtocolo) {
		this.numProtocolo = numProtocolo;
	}
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Cadastro getCliente() {
		return cliente;
	}
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
}
