package com.mjv.aguaLuz.notification.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.aguaLuz.notification.model.Cadastro;
import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.model.Endereco;
import com.mjv.aguaLuz.notification.model.Pais;
import com.mjv.aguaLuz.notification.model.Servico;

public class ContratoRepository {
	//banco de dados fake
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	public List<Contrato> listar() {

		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 00));
		contrato.setNumeroProtocolo(2022025687L);
		contrato.setValor(Servico.AGUA.getValor());
		contrato.setServico(Servico.AGUA);
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		cliente.setNome("Gleyson Sampaio");
		cliente.setCpf("23476598727");
		cliente.setPais(Pais.BRASIL);
		cliente.setRg("337655");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setLagradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("27310657");
		contratos.add(contrato);
		
		return contratos;
	}
}
