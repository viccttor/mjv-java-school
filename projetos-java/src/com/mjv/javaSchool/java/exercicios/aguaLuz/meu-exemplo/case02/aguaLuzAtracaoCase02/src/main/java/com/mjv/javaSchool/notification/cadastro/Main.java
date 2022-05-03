package com.mjv.javaSchool.notification.cadastro;

import java.time.LocalDateTime;

import com.mjv.javaSchool.notification.gerador.GeradorCadastro;
import com.mjv.javaSchool.notification.gerador.GeradorContrato;
import com.mjv.javaSchool.notification.gerador.GeradorEndereco;
import com.mjv.javaSchool.notification.service.Mensagem;

public class Main {

	public static void main(String[] args) {
		GeradorContrato contrato = new GeradorContrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 00));
		contrato.setNumProtocolo("2022025687");
		contrato.setValor(127.33);
		contrato.setServico("Água");

		GeradorCadastro cliente = new GeradorCadastro();
		contrato.setCliente(cliente);
		cliente.setNome("Gleyson Sampaio");
		cliente.setCpf("23476598727");

		GeradorEndereco endereco = new GeradorEndereco();
		cliente.setEndereco(endereco);
		endereco.setLagradouro("Rua das Marias");
		endereco.setNumResidencia("243");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("27310657");

		Mensagem gm = new Mensagem();
		gm.gerarMensagem(contrato);
	}

}
