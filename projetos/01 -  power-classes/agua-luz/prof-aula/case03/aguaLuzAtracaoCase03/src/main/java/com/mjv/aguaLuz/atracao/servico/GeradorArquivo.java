package com.mjv.aguaLuz.atracao.servico;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.mjv.aguaLuz.atracao.model.Cadastro;
import com.mjv.aguaLuz.atracao.model.Contrato;
import com.mjv.aguaLuz.atracao.model.Endereco;
import com.mjv.aguaLuz.atracao.util.TextoUtil;

public class GeradorArquivo {
	public void csv(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		sb.append(contrato.getCliente().getCpf() + ";");
		
		System.out.println(sb.toString());
		escrever(sb.toString(), "agua-luz-contratos.csv");
		
	}

	public void txt(Contrato contrato) {
		StringBuilder sb = new StringBuilder();
		
		Cadastro cli = contrato.getCliente();
		Endereco end = cli.getEndereco();
		
		
		sb.append(TextoUtil.removerCaracteresEspeciais(cli.getCpf()));
		sb.append(TextoUtil.ajustar(cli.getRg(),10));
		sb.append(TextoUtil.ajustar(cli.getNome(), 30) );
		sb.append(TextoUtil.removerCaracteresEspeciais(cli.getCelular()));
		sb.append(TextoUtil.ajustar(end.getLogradouro(), 20) );
		sb.append(TextoUtil.completarZeroEsquerda(Integer.valueOf(end.getNumero()), 6) );
		sb.append(TextoUtil.ajustar(end.getComplemento(), 10) );
		sb.append(TextoUtil.ajustar(end.getBairro(), 15) );
		sb.append(TextoUtil.ajustar(end.getCidade(), 30) );
		sb.append(TextoUtil.ajustar(end.getEstado(), 2) );
		String cep = TextoUtil.removerCaracteresEspeciais(end.getCep());
		sb.append(TextoUtil.ajustar( cep.replaceAll("\\D", ""), 8) );
		sb.append(cli.getPais().getSigla() );
		sb.append(TextoUtil.completarZeroEsquerda(contrato.getNumeroProtocolo(), 10) );
		sb.append(TextoUtil.removerCaracteresEspeciais(contrato.getDataHora().toString()));
		sb.append(contrato.getServico().getSigla() );
		String valor = TextoUtil.removerCaracteresEspeciais(contrato.getValor().toString());
		valor = TextoUtil.completarZeroEsquerda(Long.valueOf(valor), 8);
		sb.append(valor );
		
		sb.append(contrato.getTipoNotificacao().name() );
		
		escrever(sb.toString().toUpperCase(), "agua-luz-contratos.txt");
		
	}
	private void escrever(String conteudo, String nomeArquivo) {
		File dir = new File("/estudo/mjv-java-school/agua-luz-output");
		dir.mkdirs();
		
		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
