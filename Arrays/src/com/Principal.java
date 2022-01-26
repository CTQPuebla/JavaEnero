package com;

import java.util.Arrays;

public class Principal {
	public static void main(String[] args) {
		//Arrays
		//Crear un array indicandole solo el tamaño
		int[] numeros = new int[10];
		
		System.out.println("Tamaño: "+numeros.length);
		//Visualizando el valor
		System.out.println(Arrays.toString(numeros)); //Dirección de memoria toString
		
		//Inicializa un array con valores directamente
		String[] letras = {"a","b","c","d","e"};
		System.out.println("Tamaño: "+letras.length);
		//Visualizando el valor
		System.out.println(Arrays.toString(letras)); 
		
		//Leer el valor del indice deseado
		System.out.println(letras[3]);
	}
}
