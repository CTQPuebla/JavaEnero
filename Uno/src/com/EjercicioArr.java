package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class EjercicioArr {
public static void main(String[] args) {
	 /*Pedir 30 numeros de los cuales si e spar se suma
	  * si es impar se suma
	  * primo mandar a un string
	  * separados por comas
	  * */
	
	Scanner size = new Scanner(System.in);
	System.out.println("Digita el tamaño de tu Array ");
	int sizeA = size.nextInt();
	int[] sizeB =new int[sizeA];
	
	int sumPar =0;
	int sumImp=0;
	String primos ="";
	
	for(int a=0; a<sizeB.length; a++) {
		
		System.out.println("Ingresa tu numero, posicion: " + a 
				+ " ingreso: " + (a+1));
		sizeB[a] = size.nextInt();
		
		
		
		if (sizeB[a]%2==0) {
			sumPar+=sizeB[a];
			
		}
		else {
			sumImp+=sizeB[a];
			
		}
		
		if(esPrimo(sizeB[a])) {
			primos = primos + sizeB[a]+",";
			}
		
		
	}
	System.out.println("La suma de los numeros pares es " + sumPar);
	System.out.println("La suma de los numeros impares es " + sumImp);
	System.out.println(primos);
}

public static boolean esPrimo(int numero) {
if (numero <= 1) {
return false;
}
int contador = 0;
//bucle que cuenta los numeros divisibles
for (int i = (int) Math.sqrt(numero); i > 1; i--) {
if (numero % i == 0) {
contador++;
}
}
return contador < 1;
}
}
