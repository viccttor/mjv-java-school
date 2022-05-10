package com.mjv.javaSchool.collections.queue;

import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
		
		java.util.Queue<String> fila = new LinkedList<String>();
		
		// Ofter e ADD -> Adicionam elementos a fila. A diferen�a � que o comportamento
		// ocorre quando a fila est� cheia"
		fila.add("Victor");
		fila.offer("Henrique"); 
		fila.offer("Kettilym"); 
		fila.add("Adriely");
		fila.offer("Fabi"); //Lan�a uma exce��o
		fila.add("Silva");//Retorna falso
		
		// Peak e ekemente -> Obter o pr�ximo elemento da fila sem remover o mesmo
		// Diferen�a ocorre quando a fila est� vazia!
		System.out.println(fila.peek());//Retorna falso
		System.out.println(fila.peek());
		System.out.println(fila.element());//Lan�a uma exce��o
		
		//fila.size(); Verifica o tamanho
		// fila.clear(); limpar a fila
		// fila.isEmpty(); Saber se a fila est� vazia
		
		// O poll retorna o primeiro elemento da fila, removendo o mesmo
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	
	}

}