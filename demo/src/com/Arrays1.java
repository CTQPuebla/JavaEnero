package com;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		boolean lengthBoolean = true;
		int arrayLength = 0;
		do {
			try {
				System.out.println("Especifique la longitud de su Array");
				arrayLength = entry.nextInt();
				System.out.println("Creando un Array de longitud: " + arrayLength);
				lengthBoolean = false;
			}
			catch (InputMismatchException err) {
				System.out.println("El valor ingresado no es un numero valido");
				entry.nextLine();
			}
		} while (lengthBoolean);
		int[] intArray = new int[arrayLength];
		for(int i = 0; i < arrayLength; i++) {
			intArray[i] = (int)Math.floor(Math.random()*100);
		}
		System.out.println("Su array con datos aleatorios es el siguiente:");
		System.out.println(Arrays.toString(intArray));
		entry.close();
	}

}
