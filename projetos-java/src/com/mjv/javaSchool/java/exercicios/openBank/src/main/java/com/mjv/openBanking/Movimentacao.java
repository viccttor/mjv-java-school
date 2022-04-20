package com.mjv.openBanking;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Movimentacao {
	
	private LocalDate data;
	private BigDecimal valor;
	private String nomeCliente;
	private String cpf;
	private String cnpj;
	private Boolean estornada;
	private TipoMovimentacao tipo;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate localDate) {
		this.data = localDate;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Boolean getEstornada() {
		return estornada;
	}
	public void setEstornada(Boolean estornada) {
		this.estornada = estornada;
	}
	public TipoMovimentacao getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}
	
	

}
