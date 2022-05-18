package br.com.mjv.javaSchool.iapoiBanking.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mjv.javaSchool.iapoiBanking.util.FormatadorUtil;

@SpringBootTest
public class FormatadorUtilCpfTest {
	
	@DisplayName("Teste - Formatar CPF para o banco de Dados - True")
	@Test
	void formatarCpfTesteErro() {
		String parametro = "111111111";
		String cpfFormatado = FormatadorUtil.formatarCpfdB(parametro);
		
		String expectativa = "11111111111";
		System.out.println(cpfFormatado);
		Assertions.assertTrue(expectativa.equalsIgnoreCase(cpfFormatado));
		
		//org.junit.jupiter.api.Assertions.assertEquals(cpfFormatado, expectativa);
		//Assertions.assertEquals(expectativa, cpfFormatado);
	}
}
