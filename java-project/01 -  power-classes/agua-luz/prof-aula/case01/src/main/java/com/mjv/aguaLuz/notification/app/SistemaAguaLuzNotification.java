package com.mjv.aguaLuz.notification.app;

import java.time.LocalDateTime;

import com.mjv.aguaLuz.notification.model.Cadastro;
import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.model.Endereco;
import com.mjv.aguaLuz.notification.servico.GeradorMensagem;

public class SistemaAguaLuzNotification {

	public static void main(String[] args) {

		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 00));
		contrato.setNumeroProtocolo(2022025687L);
		contrato.setValor(127.33);
		contrato.setServico("Água");
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		cliente.setNome("Gleyson Sampaio");
		cliente.setCpf("23476598727");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setLagradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("27310657");
		
		GeradorMensagem gm = new GeradorMensagem();
		gm.gerar(contrato);
		
	}

}