package com;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		System.out.println(2 + 4 * 5 - 10 / (2 + 1));
		Scanner entry = new Scanner(System.in);
		boolean lengthBoolean = true;
		int arrayLength = 0;
		do {
			try {
				System.out.println("Especifique la longitud de su Array");
				arrayLength = entry.nextInt();
				System.out.println("\nCreando array de longitud: " + arrayLength);
				lengthBoolean = false;
			}
			catch (InputMismatchException err) {
				System.out.println("El valor ingresado no es un numero valido");
				entry.nextLine();
			}
		} while (lengthBoolean);
		Object[] objectsArray = new Object[arrayLength];
		System.out.println(Arrays.deepToString(objectsArray) + "\n");
		int stringNumber = 0;
		for(int i = 0; i < objectsArray.length; i++) {
			int randomIndex = (int)Math.floor(Math.random()*3);
			switch(randomIndex) {
			case 0:
				objectsArray[i] = (int)Math.floor(Math.random()*100);
				break;
			case 1:
				objectsArray[i] = false;
				break;
			case 2:
				int stringOrNumber = (int)Math.floor(Math.random()*2);
				if(stringOrNumber==1) {
					stringNumber ++;
					Integer stringNumberInteger = new Integer(stringNumber);
					objectsArray[i] = "string".concat(stringNumberInteger.toString());
				} else {
					Integer numberToString = new Integer((int)Math.floor(Math.random()*100));
					objectsArray[i] = numberToString.toString();
				}
				break;
			}
		}
		System.out.println("Creando elementos de clases aleatorias para su array");
		System.out.println("Array final:");
		System.out.println(Arrays.deepToString(objectsArray));
		System.out.println("\nDetalles de cada elemento:");
		System.out.print("[");
		for(int i = 0; i < objectsArray.length; i++) {
			if(i == objectsArray.length - 1) {
				if(objectsArray[i] instanceof Boolean) {
					System.out.print(objectsArray[i] + " es un boolean");
				} else if(objectsArray[i] instanceof Integer) {
					System.out.print(objectsArray[i] + " es un int");
				} else {
					System.out.print("\""+ objectsArray[i] + "\"" + " es un String");
				}
			} else {
				if(objectsArray[i] instanceof Boolean) {
					System.out.print(objectsArray[i] + " es un boolean,");
				} else if(objectsArray[i] instanceof Integer) {
					System.out.print(objectsArray[i] + " es un int,");
				} else {
					System.out.print("\""+ objectsArray[i] + "\"" + " es un String,");
				}
			}
		}
		System.out.println("]");
		
		String finalString = "";
		int sum = 0;
		for(Object n: objectsArray) {
			if(n instanceof Boolean) {
				continue;
			} else if(n instanceof Integer) {
				sum += (int)n;
			} else {
				try {
				  sum += Integer.valueOf((String)n);
				}
				catch(NumberFormatException err) {
				  finalString += (String)n + ",";
				}
			}
		}
		System.out.println("\nLa suma de los valores numericos y de las cadenas de texto completamente numericas es: " + sum);
		System.out.println("\nLa cadena de texto final es: " + finalString.substring(0, finalString.length()-1));
		entry.close();
	}
}
