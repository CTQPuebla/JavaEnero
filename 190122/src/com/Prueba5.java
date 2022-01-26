package com;

import java.util.*;

public class Prueba5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String cadena = "", resultado = "";
		int inicio = 0, fin = 0;
		System.out.println("Introduce una cadena de texto:");
		cadena = entrada.nextLine();
		System.out.println("Cadena mayúsculas: "+cadena.toUpperCase());
		System.out.println("Cadena minúsculas: "+cadena.toLowerCase());
		
		System.out.println("¿Dónde inicia la cadena?");
		inicio = entrada.nextInt();
		System.out.println("¿Dónde termina la cadena?");
		fin = entrada.nextInt();
		
		resultado = cadena.substring(inicio-1,fin);
		System.out.println("Resultado: "+resultado);
		
		entrada.close();
	}
}
