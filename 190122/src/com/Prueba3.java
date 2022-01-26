package com;

import java.util.*;

public class Prueba3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuántas filas tendrá la tabla?");
		int filas = entrada.nextInt();
		System.out.println("¿Cuántas columnas tendrá la tabla?");
		int columnas = entrada.nextInt();
		
		int x=0,y=0,n=1,numero=0;
		
		String arregloA = "", arregloB = "", arregloC = "";
		
		int[][] matrizA = new int[filas][columnas],
				matrizB = new int[filas][columnas],
				matrizC = new int[filas][columnas];
		
		
		for(n=1;n<3;n++) {
			System.out.println("\nMATRIZ "+n);
			for(int f=0; f<filas;f++) {
				for(int c=0;c<columnas;c++) {
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
