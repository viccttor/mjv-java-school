package com.mjv.aguaLuz.notification.servico;

import com.mjv.aguaLuz.notification.model.Cadastro;
import com.mjv.aguaLuz.notification.model.Contrato;
import com.mjv.aguaLuz.notification.util.FormatadorUtil;

public class GeradorMensagem {

	public void gerar(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		Cadastro cliente = contrato.getCliente();
		String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
		// sb.append("Senhor(a) " + cliente.getNome() +" cpf de número " + cpfFormatado
		// );
		sb.append(String.format("Senhor(a) %s cpf de número %s, ", cliente.getNome(), cpfFormatado));
		sb.append(String.format("Informamos que conforme contrato com protocolo de número %d",
				contrato.getNumeroProtocolo()));
		// vai usar muita formatacao
		System.out.println(sb.toString());
	}
}