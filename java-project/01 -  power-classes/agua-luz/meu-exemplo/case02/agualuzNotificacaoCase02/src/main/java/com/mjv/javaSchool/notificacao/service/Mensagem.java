package com.mjv.javaSchool.notificacao.service;

import com.mjv.javaSchool.atracao.model.Cadastro;
import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.notificacao.util.FormatadorUtil;

public class Mensagem {
	private String conteudo;
	public void gerarMensagem (Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		sb.append("Senhor(a) "+ cliente.getNome() + " cpf de número "+ cpfFormatado);
		sb.append(String.format(", Informamos que conforme contrato com protocolo de número %s está agendado para a data\\hora", contrato.getNumProtocolo()));
		String dataFormatada = FormatadorUtil.formatarDataHora(contrato.getDataHora(),cliente.getEndereco().getPais());
		String valorFormatadoBr = FormatadorUtil.formatarValor(contrato.getValor(),cliente.getEndereco().getPais());
		sb.append(String.format(" %sh a instalaçãoo do serviço de %s com taxa de valor %s em sua residência localizada no endereço "
				+ "abaixo:",dataFormatada,contrato.getTipoServico().getDescricao(),valorFormatadoBr));
		sb.append(String.format("\n\n° Lagradouro: %s,%s", cliente.getEndereco().getLagradouro(),cliente.getEndereco().getNumResidencia()));
		sb.append(String.format("\n° Complemento: %s", cliente.getEndereco().getComplemento()));
		sb.append(String.format("\n° Bairro: %s", cliente.getEndereco().getBairro()));
		sb.append(String.format("\n° Cidade: %s / %s", cliente.getEndereco().getCidade(),cliente.getEndereco().getEstado()));
		String cepFormatado = FormatadorUtil.formatarCep(cliente.getEndereco().getCep());
		sb.append(String.format("\n° Cep: %s", cepFormatado));
		System.out.println(sb.toString());
		
		conteudo = sb.toString();
		
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
}


