package br.com.mjv.javaSchool.iapoiBanking.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {
	
	@Column(name="num_conta")
	private Long numero;
	
	@Column(name="saldo_conta")
	private Double saldo;

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
