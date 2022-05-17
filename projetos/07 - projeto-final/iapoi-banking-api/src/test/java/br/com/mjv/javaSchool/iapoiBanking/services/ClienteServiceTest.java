package br.com.mjv.javaSchool.iapoiBanking.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mjv.javaSchool.iapoiBanking.models.Cliente;
import com.mjv.javaSchool.iapoiBanking.repositorys.ClienteRepository;
import com.mjv.javaSchool.iapoiBanking.services.ClienteService;

@SpringBootTest
public class ClienteServiceTest {
	
	private ClienteRepository repository;
	private ClienteService service;
	private String cpf = "11111111111";
	
	@DisplayName("Testando o Cadastro de Cliente")
	@Test
	 void buscarClienteCepTestTrue() {
	}
}
