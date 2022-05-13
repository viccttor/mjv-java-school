package com.mjv.pedidoFast.repository;

import java.util.HashMap;
import java.util.Map;

import com.mjv.pedidoFast.model.cadastro.Cliente;
import com.mjv.pedidoFast.model.cadastro.Endereco;

public class ClienteFakeRepository {
	private Map<Integer, Cliente> clientes = new HashMap();

	public ClienteFakeRepository() {
		Cliente gleyson = new Cliente();
		gleyson.setCpf("12312");
		gleyson.setId(1);
		gleyson.setNome("GLEYSON SAMPAIO");
		gleyson.setWhastapp("11958940362");
		Endereco endGleyson = new Endereco();
		endGleyson.setBairro("CENTRO");
		endGleyson.setNumero("SN");
		endGleyson.setEstado("TERESINA");
		endGleyson.setCidade("PI");
		endGleyson.setLogradouro("RUA DO COMERCIO");
		gleyson.setEndereco(endGleyson);

		// Adicionando no map de Clientes
		clientes.put(1, gleyson);

		// Adicionando um novo cliente

		Cliente victor = new Cliente();
		victor.setCpf("321123");
		victor.setId(2);
		victor.setNome("VICTOR HENRIQUE");
		victor.setWhastapp("81979137180");
		Endereco endVictor = new Endereco();
		endVictor.setBairro("CENTRO");
		endVictor.setNumero("SN");
		endVictor.setEstado("CARPINA");
		endVictor.setCidade("PE");
		endVictor.setLogradouro("RUA DA LOJA");
		victor.setEndereco(endVictor);

		// Adicionando no map de Clientes
		clientes.put(2, victor);
	}

	public Cliente buscPorId(Integer id) {
		return clientes.get(id);
	}
}
