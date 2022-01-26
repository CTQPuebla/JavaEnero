package com;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("¿Cuántos números va a ingresar?");
			int espacios = entrada.nextInt();
			
			int[] numeros = new int[espacios];
			int longitud = numeros.length, index = 0, numEntrada = 0, posicion = 0, pares = 0, impares = 0;
			boolean esPrimo = true;
			String numPrimos = "", numPares="", numImpares="";
			
			for(index = 0; index < longitud; index++ ) {
				posicion = index + 1;
				
				if(posicion == 1 || posicion == 3) {
					System.out.println("Ingrese el "+posicion+"er número:");
				} else {
					System.out.println("Ingrese el "+posicion+"° número:");
				}
				numEntrada = entrada.nextInt();
				numeros[index] = numEntrada;
				
				if (numEntrada % 2 == 0) {
					pares += numEntrada;
					if(!numPares.equals("")) {
						numPares += " + ";
					}
					numPares += String.valueOf(numEntrada);
					
				} else {
					impares += numEntrada;
					if(!numImpares.equals("")) {
						numImpares += " + ";
					}
					numImpares += String.valueOf(numEntrada);
				}
				
				esPrimo = true;
				if (numEntrada == 0 || numEntrada == 1 || numEntrada == 4) {
					esPrimo = false;
				} else {
					for(int x=2; x < numEntrada / 2 ; x++) {
						if(numEntrada % x == 0) {
							esPrimo = false;
						}
					}
				}
				
				if(esPrimo == true) {
					if(!numPrimos.equals("")) {
						numPrimos += ", ";
					}
					numPrimos += String.valueOf(numEntrada);
				}
			}
			
			System.out.println("Números ingresados: "+Arrays.toString(numeros));
			System.out.println("Numeros pares: "+numPares+" = "+pares);
			System.out.println("Numeros impares: "+numImpares+" = "+impares);
			System.out.println("Números primos: "+numPrimos);
		}
}
