package com.mjv.pedidoFast.app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.pedidoFast.model.cadastro.Cliente;
import com.mjv.pedidoFast.model.cadastro.Produto;
import com.mjv.pedidoFast.model.pedido.Pedido;
import com.mjv.pedidoFast.model.pedido.PedidoItem;
import com.mjv.pedidoFast.repository.ClienteFakeRepository;
import com.mjv.pedidoFast.repository.ProdutoFakeRepository;
import com.mjv.pedidoFast.service.PedidoService;

public class PedidoFastApp {
	public static void main(String[] args) {
		ClienteFakeRepository clienteRepository = new ClienteFakeRepository();
		Cliente cliente = clienteRepository.buscPorId(2);
		Pedido pedido1 = new Pedido();
		pedido1.setCliente(cliente);
		pedido1.setId(100212);
		pedido1.setDataHora(LocalDateTime.now());
		pedido1.setValorTotal(0.0);

		ProdutoFakeRepository produtoRepositoy = new ProdutoFakeRepository();
		
		Produto produtoSelecionado = produtoRepositoy.buscarPorId(1);
		System.out.println("Produto selecionado foi: " + produtoSelecionado.getDescricao());

		List<PedidoItem> itens = new ArrayList();
		// Precisamos de uma classe hit�rica de como os produtos foram vendidos
		PedidoItem item1 = new PedidoItem();
		item1.setId(1001);
		item1.setIdProduto(produtoSelecionado.getId());
		item1.setQuantidade(2.0);
		item1.setValorUnitario(produtoSelecionado.getPrecoVenda());
		item1.setSubTotal(item1.getQuantidade() * item1.getValorUnitario());
		itens.add(item1);

		produtoSelecionado = produtoRepositoy.buscarPorId(2);
		System.out.println("Produto selecionado foi: " + produtoSelecionado.getDescricao());

		PedidoItem item2 = new PedidoItem();
		item2.setId(1002);
		item2.setIdProduto(produtoSelecionado.getId());
		item2.setQuantidade(2.0);
		item2.setValorUnitario(produtoSelecionado.getPrecoVenda());
		item2.setSubTotal(item2.getQuantidade() * item2.getValorUnitario());
		itens.add(item2);
		
		pedido1.setItens(itens);

		PedidoService service = new PedidoService();
		service.concluir(pedido1);

	}

}
