package com;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {
		boolean dimensionsBoolean = true;
		Scanner entry = new Scanner(System.in);
		int firstDimension = 0;
		int secondDimension = 0;
		int demoElement = 0;
		do {
			try {
				System.out.println("Especifique la primera dimension de su Array");
				firstDimension = entry.nextInt();
				System.out.println("Especifique la segunda dimension de su Array");
				secondDimension = entry.nextInt();
				System.out.println("Creando un Array de: " + firstDimension + "x" + secondDimension);
				dimensionsBoolean = false;
			}
			catch (InputMismatchException err) {
				System.out.println("El valor ingresado no es un numero valido");
				entry.nextLine();
			}
		} while (dimensionsBoolean);
		System.out.println();
		int[][] twoDimensionArray = new int[firstDimension][secondDimension];
		for(int i = 0 ; i < firstDimension; i++) {
			for(int j = 0; j < secondDimension; j++) {
				twoDimensionArray[i][j] = demoElement;
				demoElement++;
			}
		}
		for(int[] oneDimensionArray: twoDimensionArray) {
			for(int element: oneDimensionArray) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(twoDimensionArray));
		entry.close();
	}

}
