package com.mjv.javaSchool.notification.app;

import java.time.LocalDateTime;

import com.mjv.javaSchool.notification.model.Cadastro;
import com.mjv.javaSchool.notification.model.Contrato;
import com.mjv.javaSchool.notification.model.Endereco;
import com.mjv.javaSchool.notification.model.Pais;
import com.mjv.javaSchool.notification.model.TipoServico;
import com.mjv.javaSchool.notification.service.Mensagem;

public class SistemaLeitorContratoGeradorMensagem {

	public static void main(String[] args) {

		Mensagem gm = new Mensagem();
		gm.gerarMensagem(contrato);
	}

}
