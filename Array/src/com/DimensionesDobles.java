package com;

import java.util.*;

public class DimensionesDobles {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String arg[]) {

		int x = 0, y = 0;
		System.out.println("escribe x: ");
		x = sc.nextInt();
		System.out.println("escribe y: ");
		y = sc.nextInt();
		int[][] arreglo = new int[x][y];
		int[][] arreglos = new int[x][y];
		System.out.println("datos de la primera matriz ");
		rellenoDeArreglo(x, y, arreglo);
		System.out.println("datos de la segunda matriz");
		rellenoDeArreglo(x, y, arreglos);

		int[][] arreglo3 = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int ii = 0; ii < y; ii++) {
				int numero = arreglo[i][ii] + arreglos[i][ii];
				arreglo3[i][ii] = numero;
			}
		}
		System.out.println("primera matriz: ");
		imprimir(arreglo);
		System.out.println("segunda matriz: ");
		imprimir(arreglos);
		System.out.println("esta matriz es la suma de las matrices anteriores: ");
		imprimir(arreglo3);
	}

	public static void imprimir(int[][] arreglo) {
		System.out.println(" _______________");
		for (int i = 0; i < arreglo.length; i++) {

			for (int ii = 0; ii < arreglo.length; ii++) {
				System.out.print(" | ");
				System.out.print(arreglo[i][ii]);
			}
			System.out.print(" | ");
			System.out.println("");
			System.out.println(" ----------------");
		}
	}

	public static void rellenoDeArreglo(int x, int y, int[][] arreglos) {
		int r;
		for (int i = 0; i < x; i++) {
			for (int ii = 0; ii < y; ii++) {
				System.out.println("escribe un numero para el lugar : " + i + " y " + ii);
				r = sc.nextInt();
				arreglos[i][ii] = r;
			}
		}
	}
}
