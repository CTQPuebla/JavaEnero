package com;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		boolean lengthBoolean = true;
		int arrayLength = 0;
		LinkedList<Integer> evenList = new LinkedList<>();
		int evenSum = 0;
		LinkedList<Integer> oddList = new LinkedList<>();
		int oddSum = 0;
		String primeNumbers = "";
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
			intArray[i] = (int)Math.floor(Math.random()*1000);
			if(intArray[i]%2 == 0) {
				evenList.push(intArray[i]);
				evenSum += intArray[i];
			} else if(intArray[i]%2 == 1) {
				oddList.push(intArray[i]);
				oddSum += intArray[i];
			}
			if (isPrime(intArray[i])) {
				Integer primeNumber = new Integer(intArray[i]);
				if(!primeNumbers.contains(primeNumber.toString() + ",")){
					primeNumbers += (primeNumber.toString() + ",");
				}
			}
		}
		System.out.println("Su array con datos aleatorios es el siguiente:");
		System.out.println(Arrays.toString(intArray));
		System.out.println();
		System.out.println("La lista de elementos pares es: ");
		System.out.println(evenList);
		System.out.println("Y la suma de estos es: " + evenSum);
		System.out.println();
		System.out.println("La lista de elementos impares es: ");
		System.out.println(oddList);
		System.out.println("Y la suma de estos es: " + oddSum);
		System.out.println();
		System.out.println("De todos los valores los siguientes son numeros primos:");
		System.out.println(primeNumbers.substring(0, primeNumbers.length()-1));
		entry.close();
		
	}
	
	public static boolean isPrime(int number) {
        //number should be greater than 1
        if(number < 2) {
        	return false;
        }
            
        for(int i = 2; i <= number / 2; i++){

        	//if number is perfectly divisible, it is not prime 
        	if(number % i == 0) {
        		return false;
        	}
        }
        
        return true;
	}
}
