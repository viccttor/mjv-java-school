package com.mjv.pedidoFast.service;

import java.util.List;

import com.mjv.pedidoFast.model.pedido.Pedido;
import com.mjv.pedidoFast.model.pedido.PedidoItem;

public class PedidoService {
	public void concluir(Pedido pedido) {
		Double valorTotalPedido = 0.0d;
		List<PedidoItem> itens = pedido.getItens();
		for (PedidoItem item : itens) {
			valorTotalPedido = valorTotalPedido + item.getSubTotal();
		}
		pedido.setValorTotal(valorTotalPedido);
	}
}
