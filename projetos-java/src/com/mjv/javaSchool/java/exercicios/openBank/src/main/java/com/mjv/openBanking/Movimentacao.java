package com.mjv.openBanking;

import java.time.LocalDate;

public class Movimentacao {

	private LocalDate data;
	private Double valor;
	private String nomeCliente;
	private String cpfCnpj;
	private Boolean estornada;
	private TipoMovimentacao tipo;

	// 2022041600013521779118RAIMUNDO NONATO LOUREIRO CAST0000127548R0
	@Override
	public String toString() {
		return "Movimentacao [data=" + data + ", valor=" + valor + ", nomeCliente=" + nomeCliente + ", cpf=" + cpfCnpj
				+ ", cnpj=" + ", estornada=" + estornada + ", tipo=" + tipo + "]";
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate localDate) {
		this.data = localDate;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
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
