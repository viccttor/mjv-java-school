package com.mjv.projetoFinal.model.pedido;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="dataHora")
	private LocalDateTime dataHora;
	
	@Column(name="valor")
	private Double valorTotal;
	
	@Column(name="cliente_id")
	private Integer clienteId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pedido_id")
	private List<PedidoItem> itens;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<PedidoItem> getItens() {
		return itens;
	}
	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	public Integer getCliente() {
		return clienteId;
	}
	public void setCliente(Integer clienteId) {
		this.clienteId = clienteId;
	}
	
	
}
