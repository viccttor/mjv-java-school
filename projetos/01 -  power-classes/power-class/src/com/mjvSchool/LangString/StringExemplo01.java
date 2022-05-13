package com.mjvSchool.LangString;

public class StringExemplo01 {
	
	String nome;
	
	// Construtor
	StringExemplo01 () {
		
	}
	
	
	StringExemplo01 (String nome) {
		this.nome = nome;
	}
	
	
	public static void main(String[] args) {
		
		// Instanciando uma String
		String ola = new String("Olá Mundo!");
		System.out.println(ola);
		System.out.println();
		
		// forma mais pratica
		System.out.println("Olá Mundo");
		
		// Concatenação e quebra de linha
		System.out.println("Victor\n Henrique " + 22);
		
		// Chamando Construtor
		
		StringExemplo01 t1 = new StringExemplo01();
		t1.nome = "Victor Henrique";
		System.out.println(t1.nome.toString());
	
		StringExemplo01 t2 = new StringExemplo01("Victor Henrique");
		System.out.println(t2.nome.toString());
		
	}

}
