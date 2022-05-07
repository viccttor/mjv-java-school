package com.mjv.javaSchool.notification.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.javaSchool.notification.model.Cadastro;
import com.mjv.javaSchool.notification.model.Contrato;
import com.mjv.javaSchool.notification.model.Endereco;
import com.mjv.javaSchool.notification.model.Pais;
import com.mjv.javaSchool.notification.model.TipoServico;

public class ContratoRepository {
	
	// Falso Banco de Dados
	
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	public List<Contrato> lista() {
		
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 2, 21, 16, 00));
		contrato.setNumProtocolo("2022025687");
		contrato.setValor(127.33);
		contrato.setTipoServico(TipoServico.AGUA);

		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		cliente.setNome("Gleyson Sampaio");
		cliente.setCpf("23476598727");

		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setLagradouro("Rua das Marias");
		endereco.setNumResidencia("243");
		endereco.setComplemento("Ap 207, Bloco C");
		endereco.setBairro("Santo Antonio");
		endereco.setCidade("São Paulo");
		endereco.setEstado("SP");
		endereco.setCep("27310657");
		endereco.setPais(Pais.BRASIL);
		
		contratos.add(contrato);
		return contratos;
	}
	
	
	
	
}
