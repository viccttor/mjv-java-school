package com.mjv.javaSchool.notification.model;

import java.time.LocalDateTime;

public class GeradorContrato {
	private String numProtocolo;
	private String servico;
	private LocalDateTime dataHora;
	private Double valor;
	private GeradorCadastro cliente;
	
	public String getNumProtocolo() {
		return numProtocolo;
	}
	public void setNumProtocolo(String numProtocolo) {
		this.numProtocolo = numProtocolo;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
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
	public GeradorCadastro getCliente() {
		return cliente;
	}
	public void setCliente(GeradorCadastro cliente) {
		this.cliente = cliente;
	}
}
