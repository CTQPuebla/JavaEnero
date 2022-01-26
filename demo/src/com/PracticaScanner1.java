package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaScanner1 {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		boolean programBoolean = true;
		do {
			boolean intBoolean = true, restartBoolean = true;
			do {
				try {
					System.out.println("Por favor ingrese un numero:");
					int intEntry = entry.nextInt();
					System.out.println("Tu numero tiene " + Integer.toString(intEntry).length() + " digitos");
					intBoolean = false;
				}
				catch (InputMismatchException err) {
					System.out.println("El valor ingresado no es un numero valido");
					entry.nextLine();
				}
			} while (intBoolean);
			while(restartBoolean) {
				try {
					System.out.println("¿Quiere ingresar otro numero? (1) Si (2) No");
					int restartEntry = entry.nextInt();
					if(restartEntry == 2) {
						restartBoolean = false;
						programBoolean = false;
					} else if(restartEntry == 1) {
						restartBoolean = false;
					} else {
						System.out.println("Por favor ingrese una opcion valida \n");
					}
				}
				catch (InputMismatchException err) {
					System.out.println("El valor ingresado no es una opcion valida");
					entry.nextLine();
				}
			}
		} while (programBoolean);
		entry.close();
		System.out.println("Fin de ejecucion");
	}
}
