package com.mjv.aguaLuz.notification.servico;

import com.mjv.aguaLuz.notification.model.Cadastro;
import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.util.FormatadorUtil;

public class GeradorMensagem {
	
	public void gerar (Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		sb.append("Senhor(a) "+ cliente.getNome() + " cpf de número "+ cpfFormatado);
		sb.append(String.format(", Informamos que conforme contrato com protocolo de número %s está agendado para a data\\hora", contrato.getNumeroProtocolo()));
		String dataFormatada = FormatadorUtil.formatarDataHora(contrato.getDataHora());
		String valorFormatadoBr = FormatadorUtil.formatarValorBr(contrato.getValor());
		sb.append(String.format(" %sh a instalação do serviço de %s com taxa de valor R$ %s em sua residência localizada no endereço abaixo:", dataFormatada,contrato.getServico(),valorFormatadoBr));
		sb.append(String.format("\n\n° Lagradouro: %s,%s", cliente.getEndereco().getLagradouro(),cliente.getEndereco().getNumero()));
		sb.append(String.format("\n° Complemento: %s", cliente.getEndereco().getComplemento()));
		sb.append(String.format("\n° Bairro: %s", cliente.getEndereco().getBairro()));
		sb.append(String.format("\n° Cidade: %s / %s", cliente.getEndereco().getCidade(),cliente.getEndereco().getEstado()));
		String cepFormatado = FormatadorUtil.formatarCep(cliente.getEndereco().getCep());
		sb.append(String.format("\n° Cep: %s", cepFormatado));
		System.out.println(sb.toString());
	}
}