package com.mjvSchool.java.classes.user;

public class Equals {

	public static void main(String[] args) {
		
		UsuarioEqualsAndHashCode u1 = new UsuarioEqualsAndHashCode();
		u1.nome = "Victor";
		u1.email = "a@gmail.com";
		
		UsuarioEqualsAndHashCode u2 = new UsuarioEqualsAndHashCode();
		u2.nome = "Victor";
		u2.email = "a@gmail.com";

		UsuarioEqualsAndHashCode u3 = new UsuarioEqualsAndHashCode();
		u3.nome = "Silva";
		u3.email = "c@gmail.com";
		UsuarioEqualsAndHashCode u4 = new UsuarioEqualsAndHashCode();
		u4.nome = "Morais";
		u4.email = "d@gmail.com";
		
		System.out.println(u1 == u2); //Note que ir� comparar o endere�o de mem�ria, por isso ser� falso 
		System.out.println(u1.equals(u2)); // Se n�o houver o m�todo eauls implementado, ir� trazer resultado falso, pois o equals fara a mesma fun��o do "==" 
		System.out.println(u2.equals(u1)); // Se n�o houver o m�todo eauls implementado, ir� trazer resultado falso, pois o equals fara a mesma fun��o do "==" 
		
	}

}
