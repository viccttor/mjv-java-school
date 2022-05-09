package com.mjv.javaSchool.atracao.service;

import java.util.List;

import com.mjv.javaSchool.atracao.model.Contrato;
import com.mjv.javaSchool.atracao.util.EscreverArquivo;

public class GeradorArquivoTxt {
	public void gerarArquivoTxt(List<Contrato> contratos) {
		StringBuilder gac = new StringBuilder();
		
		for(Contrato c: contratos) {
			String cpf = c.getCliente().getCpf().replaceAll("[\\D]", "");
			gac.append(String.format("%-11s", cpf).substring(0, 11));
			
			String rg = c.getCliente().getRg().replaceAll("[\\D]", "");
			Integer rgInteger = Integer.valueOf(rg);
			gac.append(String.format("%10d",rgInteger)).substring(11, 21);
			
			String nome = c.getCliente().getNome();
			if (nome.length() >= 30)
				gac.append(nome.substring(0, 30)).substring(21, 51);
			else
				gac.append(String.format("%-30s", nome)).substring(21, 51);
			
			gac.append(c.getCliente().getCelular().replaceAll("[\\D]", "")).substring(51, 62);
			
			String lagradouro = c.getCliente().getEndereco().getLagradouro();
			if (lagradouro.length() >= 20)
				gac.append(lagradouro.substring(0, 20)).substring(62, 82);
			else
				gac.append(String.format("%-20s", lagradouro)).substring(62, 82);
			
			String numeroResidencia = c.getCliente().getEndereco().getNumResidencia();
			if (numeroResidencia.length() >= 6) {
				gac.append(numeroResidencia.substring(0, 6)).substring(82, 88);
			} else {
				Integer num = Integer.valueOf(numeroResidencia);
				gac.append(String.format("%06d", num)).substring(82, 88);
			}
			
			String complemento = c.getCliente().getEndereco().getComplemento();
			if (complemento.length() >= 10)
				gac.append(complemento.substring(0, 10)).substring(88, 98);
			else
				gac.append(String.format("%-10s", complemento)).substring(88, 98);
			
			String bairro = c.getCliente().getEndereco().getBairro();
			if (bairro.length() >= 15)
				gac.append(bairro.substring(0, 15)).substring(98, 113);
			else
				gac.append(String.format("%-15s", bairro)).substring(98, 113);
			
			String cidade = c.getCliente().getEndereco().getCidade();
			if (cidade.length() >= 30)
				gac.append(cidade.substring(0, 30)).substring(113, 143);
			else
				gac.append(String.format("%-30s", cidade)).substring(113, 143);
			
			gac.append(c.getCliente().getEndereco().getEstado().toString()).substring(143, 145);
			
			String cepString = c.getCliente().getEndereco().getCep().replaceAll("[\\D]", "");
			if (cepString.length() >= 8) {
				gac.append(cepString.substring(0, 8)).substring(145, 153);
			} else {
				Integer cetInteger = Integer.valueOf(cepString);
				gac.append(String.format("%08d", cetInteger)).substring(145, 153);
			}
			
			gac.append(c.getCliente().getEndereco().getPais().getSigla()).substring(153, 155);
			
			String protocoloString = c.getNumProtocolo();
			if (protocoloString.length() >= 10) {
				gac.append(protocoloString.substring(0, 10)).substring(155, 165);
			} else {
				Integer protocoloInteger = Integer.valueOf(protocoloString);
				gac.append(String.format("%010d", protocoloInteger)).substring(155, 165);
			}
			
			String data = c.getDataHora().toString().replaceAll("[\\D]", "");
			gac.append(data).substring(165, 177);
			
			gac.append(c.getTipoServico().getSigla().toString()).substring(177, 178);
			
			String valorString = c.getValor().toString().replaceAll("[\\D]", "");
			if (valorString.length() >= 8) {
				gac.append(valorString.substring(0, 8)).substring(178, 186);
			} else {
				Integer valorInteger = Integer.valueOf(valorString);
				gac.append(String.format("%08d", valorInteger)).substring(178, 186);
			}
			
			gac.append(c.getTipoNotificacao().getSigla().toString()).substring(186, 187);
			
			System.out.println(gac.toString().toUpperCase());
			
			String nomeArquivo = "agua-luz-contratos.txt";
			EscreverArquivo.escreverArquivo(gac.toString().toUpperCase(), nomeArquivo);
		
		}
		
	}
}
