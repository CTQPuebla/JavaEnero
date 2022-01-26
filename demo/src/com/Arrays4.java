package com;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays4 {
	public static void main(String[] args) {
		boolean dimensionsBoolean = true;
		Scanner entry = new Scanner(System.in);
		int firstDimension = 0;
		int secondDimension = 0;
		int demoElement = 0;
		
		do {
			try {
				System.out.println("Especifique la primera dimension de sus Array");
				firstDimension = entry.nextInt();
				System.out.println("Especifique la segunda dimension de sus Array");
				secondDimension = entry.nextInt();
				System.out.println("Creando 3 Array de: " + firstDimension + "x" + secondDimension);
				dimensionsBoolean = false;
			}
			catch (InputMismatchException err) {
				System.out.println("El valor ingresado no es un numero valido");
				entry.nextLine();
			}
		} while (dimensionsBoolean);
		
		System.out.println();
		
		int[][] twoDimensionArray1 = new int[firstDimension][secondDimension];
		int[][] twoDimensionArray2 = new int[firstDimension][secondDimension];
		int[][] twoDimensionArray3 = new int[firstDimension][secondDimension];
		
		for(int i = 0 ; i < firstDimension; i++) {
			for(int j = 0; j < secondDimension; j++) {
				twoDimensionArray1[i][j] = demoElement;
				demoElement++;
			}
		}
		
		for(int i = 0 ; i < firstDimension; i++) {
			for(int j = 0; j < secondDimension; j++) {
				twoDimensionArray2[i][j] = demoElement;
				demoElement++;
			}
		}
		
		for(int i = 0 ; i < firstDimension; i++) {
			for(int j = 0; j < secondDimension; j++) {
				twoDimensionArray3[i][j] = twoDimensionArray1[i][j] + twoDimensionArray2[i][j];
			}
		}
		
		System.out.println("Primer array: \n");
		for(int[] oneDimensionArray: twoDimensionArray1) {
			for(int element: oneDimensionArray) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(twoDimensionArray1));
		
		System.out.println("\nSegundo array: \n");
		for(int[] oneDimensionArray: twoDimensionArray2) {
			for(int element: oneDimensionArray) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(twoDimensionArray2));
		
		System.out.println("\nArray resultante de la suma de los anteriores: \n");
		for(int[] oneDimensionArray: twoDimensionArray3) {
			for(int element: oneDimensionArray) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(Arrays.deepToString(twoDimensionArray3));
		
		entry.close();
	}
}
