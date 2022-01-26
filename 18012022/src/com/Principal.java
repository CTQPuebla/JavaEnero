package com;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cifra");
		String entrada = sc.nextLine();
		String salida = entrada.replaceAll("[^0-9]", "");
		
		if (salida.length() > 0) {
			System.out.println("N�mero: "+salida);
			if (salida.length() == 1) {
				System.out.println("Tu n�mero tiene 1 cifra");
			} else {
				System.out.println("Tu n�mero tiene "+ salida.length() + " cifras");
			}
		} else {
			System.out.println("El valor introducido no contiene n�meros");
		}
		
		sc.close();
	}
}
