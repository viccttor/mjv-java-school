package com.mjvSchool.java.classes.user;

public class UsuarioEqualsAndHashCode {
	String nome;
	String email;
	
	 UsuarioEqualsAndHashCode() {
	
	 }
	 
	public boolean equals(Object objeto) {
		if ( objeto instanceof UsuarioEqualsAndHashCode) {
			UsuarioEqualsAndHashCode outro = (UsuarioEqualsAndHashCode) objeto;
			boolean nomeIgual = outro.nome.endsWith(this.nome);
			boolean emailIgual = outro.email.endsWith(this.email);
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
}
