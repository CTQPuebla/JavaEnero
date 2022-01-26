package com;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba6 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuántas filas tendrá la tabla 1?");
		int f1 = entrada.nextInt();
		System.out.println("¿Cuántas columnas tendrá la tabla 1?");
		int c1 = entrada.nextInt();
		
		System.out.println("¿Cuántas filas tendrá la tabla 2?");
		int f2 = entrada.nextInt();
		System.out.println("¿Cuántas columnas tendrá la tabla 2?");
		int c2 = entrada.nextInt();
		
		int[][] matrizA = new int[f1][c1],
				matrizB = new int[f2][c2];
		
		if(matrizA.length != matrizB.length) {
			System.out.println("El tamaño de la matriz 1 no coincide con el tamaño de la matriz 2");
		} else {
			int[][] matrizC = new int[f1][c1];
			int x=0,y=0,n=1,numero=0;
			
			String arregloA = "", arregloB = "", arregloC = "";
			
			
			for(n=1;n<3;n++) {
				System.out.println("\nMATRIZ "+n);
				for(int f=0; f<f1;f++) {
					for(int c=0;c<c1;c++) {
						x = f + 1;
						y = c + 1;
						System.out.println("Ingrese el valor (fila "+x+", columna "+y+")");
						numero = entrada.nextInt();
						if(n==1) {
							matrizA[f][c] = numero;
						} else {
							matrizB[f][c] = numero;
							matrizC[f][c] = matrizA[f][c] + matrizB[f][c];
						}
					}
					if(n==1) {
						arregloA += Arrays.toString(matrizA[f])+"\n";
					} else {
						arregloB += Arrays.toString(matrizB[f])+"\n";
						arregloC += Arrays.toString(matrizC[f])+"\n";
					}
				}
			}
			
			entrada.close();
			
			arregloA = arregloA.replace("[", "");
			arregloA = arregloA.replace("]", "");
			arregloA = arregloA.replace(",", "\t");
			arregloB = arregloB.replace("[", "");
			arregloB = arregloB.replace("]", "");
			arregloB = arregloB.replace(",", "\t");
			arregloC = arregloC.replace("[", "");
			arregloC = arregloC.replace("]", "");
			arregloC = arregloC.replace(",", "\t");
			
			System.out.println("\nMATRIZ 1:\n"+arregloA);
			System.out.println("\nMATRIZ 2:\n"+arregloB);
			System.out.println("\nMATRIZ 3:\n"+arregloC);
		}
	}
}
