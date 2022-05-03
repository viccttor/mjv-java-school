package com.mjv.aguaLuz.notification.model;

import java.time.LocalDateTime;

public class Contrato {
	
	private Long numeroProtocolo;
	private String Servico;
	private Double valor;
	private LocalDateTime dataHora;
	private Cadastro cliente;
	
	public Long getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Long numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public String getServico() {
		return Servico;
	}
	public void setServico(String servico) {
		Servico = servico;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
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
	 
	
}