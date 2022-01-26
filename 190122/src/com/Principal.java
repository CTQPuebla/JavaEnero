package com;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		System.out.println("Tamaño de array de números: "+numeros.length);
		System.out.println(Arrays.toString(numeros));
		
		
		String[] letras = {"a","b","c","d","e"};
		
		System.out.println("\n"+"Tamaño de array de letras: "+letras.length);
		System.out.println(Arrays.toString(letras));
		System.out.print(letras[3]);
		
	}

}
