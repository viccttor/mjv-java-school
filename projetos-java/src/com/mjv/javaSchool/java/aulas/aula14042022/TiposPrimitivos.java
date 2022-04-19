package com.mjv.javaSchool.java.aulas.aula14042022;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionáro

		// Tipos númericos inteiros
		byte anosDeEmpresa = 21;
		System.out.println(anosDeEmpresa);
		short numeroDeVoos = 129;
		System.out.println(numeroDeVoos);
		int id = 56998;
		System.out.println(id);
		long pontosAcumulados = 3_134_231_11L;
		System.out.println(pontosAcumulados);
		// Por que o "L", para indicar que e variável é do tipo long. Usar o L maisculo
		// para não confundir com o numero

		float salario = 11_445.44F;
		System.out.println(salario);
		// Por que o "F" no final? para indicar o java que é do tipo Float. E por que?
		// Porque o padrão é do tipo double.
		double batidasDePonto = 3_122_111_2;
		System.out.println(batidasDePonto);
		// Tipo bolleano
		boolean estadoDeFerias = false;
		System.out.println(estadoDeFerias);
		// Tipo de caractere
		char status = 'A'; // ativo, lembrando que não pode colocar mais de um caractere
		System.out.println(status);

		boolean teste = (2 > 9);
		System.out.println(teste);

	}

}
