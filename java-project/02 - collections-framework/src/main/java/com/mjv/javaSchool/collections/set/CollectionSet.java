package com.mjv.javaSchool.collections.set;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		conjunto.add(1);
		conjunto.add(2.4);
		conjunto.add(true);
		conjunto.add("Teste");
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		// Adcionando mais dados ao conjunto e um item duplicado
		
		conjunto.add(1);
		conjunto.add("teste"); // Esse teste é diferente do outro, por isso irá contabilizar
		conjunto.add(false);
		System.out.println("Tamanho do conjunto: " + conjunto.size()); // Note que só monstra 6 elemestos
		System.out.println(conjunto.contains(1)); // Verificando se há o item no conjunto
		conjunto.remove("teste");
		System.out.println("Tamanho do conjunto: " + conjunto.size());// Por que 5? o 1 não conta, o teste foi removido
		
		Set nums = new HashSet();
		nums.add(3);
		nums.add(1);
		nums.add(2);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // Uniao dos conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);

	}

}
