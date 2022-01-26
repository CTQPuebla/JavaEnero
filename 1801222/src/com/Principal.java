package com;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = 0, pares = 0, impares = 0;
		
		for(int x = 1;x<=15; x++) {
			System.out.println(x+".- Ingrese un número");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) { //Si es par
				pares++;
				System.out.println("Pares: "+pares);
			} else {
				System.out.println("Impares: "+impares+" + "+numero+" = "+(impares += numero));
			}
		}
		System.out.println("Número de pares: "+pares);
		System.out.println("Suma de impares: "+impares);
		
		
		sc.close();
	}
}