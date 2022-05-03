package com.mjv.aguaLuz.atraction.util;

public class TextoUtil {
	public static String removerCaracteresEspeciais(String texto) {
		return texto.replaceAll("\\D", "");
	}

	public static String completar(String textoOrigianal, int tamanhoMaximo) {
		// %-10s
		String formato = "%-" + tamanhoMaximo + "s";
		String textoFormatado = String.format(formato, textoOrigianal);
		return textoFormatado;
	}

	public static String completarZeroEsquerda(Number numero, int tamanhoMaximo) {
		String formato = "%0" + tamanhoMaximo + "d";
		String textoFormatado = String.format(formato, numero);
		return textoFormatado;
	}

	public static String cortar(String textoOrigianal, int tamanhoMaximo) {
		String novoTexto = textoOrigianal.substring(0, tamanhoMaximo);
		return novoTexto;
	}

	public static String ajustar(String textoOrigianal, int tamanhoMaximo) {
		String textoAjustado = completar(textoOrigianal, tamanhoMaximo);
		textoAjustado = cortar(textoAjustado, tamanhoMaximo);
		return textoAjustado;
	}
}
