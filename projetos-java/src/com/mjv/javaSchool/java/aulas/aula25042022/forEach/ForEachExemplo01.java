package com.mjv.javaSchool.java.aulas.aula25042022.forEach;

import java.util.Arrays;
import java.util.List;

public class ForEachExemplo01 {

	public static void main(String[] args) {
		List<Integer> itens = Arrays.asList(11,22,111,333,11);
		itens.forEach(item->System.out.println(item));
		
	}

}
