package com.mjv.javaSchool.collections.list;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

		// Declarando uma lista de alunos
		// OBS: A lista só aceita um tipo de dado!
		ArrayList<String> nome = new ArrayList<String>();

		// Adcionando alunos a lista
		System.out.print("Lista Completa: \n");
		nome.add("Gleyson");
		nome.add("Victor");
		nome.add("Tiago");
		nome.add("Julia");
		nome.add("Talita");
		nome.add("Thiago");
		// nome.add(22); // Note que ao colocar um número, a propria IDE acusa um erro

		// Percorrendo a lista utilizando o For each
		for (String chamada : nome) {
			System.out.println("Aluno(a): " + chamada);
		}

		// Removendo Item da lista
		nome.remove(0);
		nome.add("Henrique");
		System.out.print("\nNova Lista: \n");
		// Percorrendo usando o indice
		int n = nome.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Aluno(a): " + nome.get(i));
		}

		// Vendo se está vazia
		System.out.println("\nA lista está vazia? " + nome.isEmpty());

		// Tamanho da lista
		System.out.println("\nTamanho: " + nome.size());

		// Limpando a lista
		nome.clear();

		// Vendo se está vazia
		System.out.println("\nA lista está vazia? " + nome.isEmpty());
		
		// Tamanho da lista
		System.out.println("\nTamanho: " + nome.size());

	}

}
