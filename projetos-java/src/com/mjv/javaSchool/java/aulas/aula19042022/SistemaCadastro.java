package com.mjv.javaSchool.java.aulas.aula19042022;

public class SistemaCadastro {

	public static void main(String[] args) {

		Pessoa victor = new Pessoa();
		victor.nome = "Victor Henrique";
		victor.cpf = "988.222.111-29";
		victor.endereco = "Carpina,PE";
		
		System.out.println(victor.nome);
		System.out.println(victor.cpf);
		System.out.println(victor.endereco);
		System.out.println();
		System.out.println();
		
		Pessoa Henrique = new Pessoa("Henrique", "888.444.555-89", "Carpina,PE");
		System.out.println(Henrique.nome);
		System.out.println(Henrique.cpf);
		System.out.println(Henrique.endereco);
		System.out.println();
		System.out.println();
		
		Pessoa Silva = new Pessoa("Silva" , "222.111.221-20");
		System.out.println(Silva.nome);
		System.out.println(Silva.cpf);
		System.out.println(Silva.endereco);
		
	}

}
