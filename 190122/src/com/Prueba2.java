package com;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuántas filas tendrá la tabla?");
		int filas = entrada.nextInt();
		System.out.println("¿Cuántas columnas tendrá la tabla?");
		int columnas = entrada.nextInt();
		
		int x=0,y=0;
		
		int[][] numeros = new int[filas][columnas];
		
		for(int f=0; f<filas;f++) {
			for(int c=0;c<columnas;c++) {
				x = f + 1;
				y = c + 1;
				System.out.println("Ingrese el valor (fila "+x+", columna "+y+")");
				numeros[f][c] = entrada.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(numeros));
	}
}
