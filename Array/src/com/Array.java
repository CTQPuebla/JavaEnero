package com;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		System.out.println("tama�o" + numeros.length);
		System.out.println(Arrays.toString(numeros));

		String[] letras = { "a", "b", "c", "d" };
		System.out.println("tama�o" + letras.length);
		System.out.println(Arrays.toString(letras));
		System.out.println(letras[3]);

		int tama�o;
		Scanner sc = new Scanner(System.in);
		System.out.println("ESCRIBE EL TAMA�O DE TU ARRAYS");

		// tama�o=sc.nextInt();
		tama�o = 5;
		int[] arrays = new int[tama�o];
		int numero = 0;
		int impar = 0, par = 0, a = 0;
		String primos = "";
		for (int i = 0; i < tama�o; i++) {
			System.out.println("Escribe un numero: ");
			numero = sc.nextInt();
			arrays[i] = numero;
			if ((numero % 2) == 0) {
				par = par + numero;
			}
			if ((numero % 2) != 0) {
				impar = impar + numero;
			}

			if (esPrimo(numero)) {
				primos = primos + numero + ",";
			}
		}

		System.out.println("tama�o: " + arrays.length);
		System.out.println(Arrays.toString(arrays));

		System.out.println("par " + par);
		System.out.println("impar " + impar);
		System.out.println("primos: " + primos);

	}

	public static boolean esPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		int contador = 0;
		// bucle que cuenta los numeros divisibles
		for (int i = (int) Math.sqrt(numero); i > 1; i--) {
			if (numero % i == 0) {
				contador++;
			}
		}
		return contador < 1;
	}

}

/*
 * [12:07] Ceteq Puebla Scanner sc = new Scanner(System.in);
 * System.out.println("Ingresa el tama�o"); int n = sc.nextInt(); int[] numeros
 * = new int[n]; int sumPar = 0; int sumImpar = 0; String primos = ""; for (int
 * i = 0; i < numeros.length; i++) {
 * System.out.println("Ingresa un numero , posicion: " + i); numeros[i] =
 * sc.nextInt(); } for (int j = 0; j < numeros.length; j++) { if (numeros[j] % 2
 * == 0) { sumPar = sumPar + numeros[j]; } else { sumImpar = sumImpar +
 * numeros[j]; } if(esPrimo(numeros[j])) { primos = primos + numeros[j]+","; } }
 * System.out.println("sumatoria pares: " + sumPar);
 * System.out.println("sumatoria impares: " + sumImpar);
 * System.out.println("primos " + primos);
 * 
 * [12:07] Ceteq Puebla public static boolean esPrimo(int numero) { if (numero
 * <= 1) { return false; } int contador = 0; //bucle que cuenta los numeros
 * divisibles for (int i = (int) Math.sqrt(numero); i > 1; i--) { if (numero % i
 * == 0) { contador++; } } return contador < 1; }
 * 
 */
