package com.mjv.javaSchool.collections.map;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// O put irá adicionar ou subistituir 
		usuarios.put(1, "Victor");
		usuarios.put(20, "Henrique");
		usuarios.put(2, "Henrique");
		
		System.out.println(usuarios);
		usuarios.put(20, "Silva");
		System.out.println(usuarios);
		
		System.out.println(usuarios.keySet()); // Retorna as chaves
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.values()); // reorna os valores
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Victor"));
		
		System.out.println(usuarios.get(20));
		
		System.out.println();
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		for (java.util.Map.Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
	}

}
