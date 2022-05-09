package com.mjv.javaSchool.atracao.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mjv.javaSchool.atracao.model.Cadastro;
import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.atracao.model.Endereco;
import com.mjv.javaSchool.atracao.model.Pais;
import com.mjv.javaSchool.atracao.model.TipoNotificacao;
import com.mjv.javaSchool.atracao.model.TipoServico;

public class ContratoRepository {
	
	// Falso Banco de Dados
	
	private List<Contrato> contratos = new ArrayList<Contrato>();
	
	public List<Contrato> lista() {
		
		Contrato contrato = new Contrato();
		contrato.setDataHora(LocalDateTime.of(2022, 5, 7, 15, 21));
		contrato.setNumProtocolo("1984365");
		contrato.setValor(127.35);
		contrato.setTipoServico(TipoServico.AGUA);
		contrato.setTipoNotificacao(TipoNotificacao.SMS);

		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		cliente.setNome("Raimundo Nonato Loureiro Castelo Branco");
		cliente.setCpf("007.324.223.21");
		cliente.setCelular("(11) 99768-1515");
		cliente.setRg("33765-5");

		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		endereco.setLagradouro("Rua Sebastião Firmino");
		endereco.setNumResidencia("123");
		endereco.setComplemento("AP 210 BL CENTAURO");
		endereco.setBairro("São Sebastião");
		endereco.setCidade("São Raimundo Nonato");
		endereco.setEstado("Sp");
		endereco.setCep("07.210.715");
		endereco.setPais(Pais.BRASIL);
		
		contratos.add(contrato);
		return contratos;
	}
	
	
	
	
}
