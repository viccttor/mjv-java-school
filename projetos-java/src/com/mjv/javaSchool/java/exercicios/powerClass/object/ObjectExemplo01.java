package com.mjv.javaSchool.java.exercicios.powerClass.object;

public class ObjectExemplo01 {

	public static void main(String[] args) {
		
		/*
		 * Essa classe é importante por um motivo bem simples: toda e qualquer classe em Java é subclasse da Object.
		 * Mesmo quando não usamos 'extends Object', o Java automaticamente faz sua classe herdar a Object.
		 * 
		 */
		
		// Criando Objeto
	    ClasseTeste ex01 = new ClasseTeste();
	    ClasseTeste02 ex02 = new ClasseTeste02();
	        
	    // Retorna um objeto do tipo Class
	    System.out.println("\ngetClass() da classeTeste: " + ex01.getClass());
	    System.out.println("getClass() da classeTeste2: " + ex02.getClass());
	        
	    // Object classe3 = classe2.clone();
	    
	    ClasseTeste02 ex03 = (ClasseTeste02) ex02.clone();
	    System.out.println("\nObjeto classe3 é clone ao classe2? "+ex03.equals(ex02));

	    // Transformando em String
	    
	    System.out.println("\ntoString da classe1: "+ex01.toString());
	    System.out.println("toString da classe2: "+ex02.toString());
	        
	        
	    // Comparando 
	    System.out.println("\nObjeto classe1 é igual classe2 ? " + ex02.equals(ex01));
	    System.out.println("Objeto classe1 é igual classe1 ? " + ex01.equals(ex01));
	    System.out.println("Objeto classe2 é igual classe3 ? " + ex02.equals(ex03));
	        
	    // Gerando um código hash
	    System.out.println("\nHash code da classe 1: "+ex01.hashCode());
	    System.out.println("Hash code da classe 2: "+ex02.hashCode());
	     System.out.println("Hash code da classe 3: "+ex03.hashCode());
	     
	}
}	
