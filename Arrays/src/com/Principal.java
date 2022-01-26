package com;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
	
	public static void main (String[] args) {
//		Arrays
		Scanner sc = new Scanner (System.in);
		
//		int[] numeros = new int [10];
//		
//		System.out.println("tamaño del array"+numeros.length);
//		//toString la direccion en memmoria que ocupa la variable
//		System.out.println(numeros.toString());  
//		//Visualizar el valor de array
//		System.out.println(Arrays.toString(numeros));
//		
//		//Inicializar un array con valores directamente
//		String[] letras= {"a","b","c","d","e"};
//		System.out.println("tamaño\n" +letras.length);
//		//visualizando el valor
//		System.out.println(Arrays.toString(letras));
//		//regresa el valor del indice deseado
//		System.out.println(letras[3]);
		
		/*EJERCICIO recibir 30 numeros sumar pares e impares
		imprimir en un string los numeros primos separados 
		por comas -mio*/
		

//		int tamaño=0;
//		
//		System.out.println("Digite el tamaño del Array");
//		tamaño = sc.nextInt();
//		int pares=0;
//		int impar=0;
//		String primos ="";
//		
//		int array [] = new int [5];
//		
//		for (int i = 0; i < array.length; i++)
//		{	System.out.println("Introduzca el numero " +i);
//			array[i]=sc.nextInt(); 
//			if(array[i]%2==0)
//			{pares+=array[i];}
//				 else if (array[i]%1==0 && array[i]%array[i]==0)
//				{
//					primos+=array[i]+",";
//					impar+=array[i];
//				}
//					
//		}
//		System.out.println("Suma de pares" +pares);
//		System.out.println("Suma de impares" +impar);
//		System.out.println("String de primos" +primos);
//		System.out.println(Arrays.toString(array));
//		
//		/*Resolucion del maesttro con funcion para los primos*/
//		
//
//		System.out.println("Ingresa el tamaño");
//		int n = sc.nextInt(); int[] numeros = new int[n];
//		int sumPar = 0;
//		int sumImpar = 0;
//		
//		String primos = ""; for (int i = 0; i < numeros.length; i++) {
//		System.out.println("Ingresa un numero , posicion: " + i);
//		numeros[i] = sc.nextInt();
//		}
//		for (int j = 0; j < numeros.length; j++) 
//		{ 
//			if (numeros[j] % 2 == 0) 
//			{
//				sumPar = sumPar + numeros[j];
//			} 
//			else 
//			{
//				sumImpar = sumImpar + numeros[j];
//			}
//				if(esPrimo(numeros[j])) 
//				{
//					primos = primos + numeros[j]+",";
//				} 
//			} 
//		System.out.println("sumatoria pares: " + sumPar);
//		System.out.println("sumatoria impares: " + sumImpar);
//		System.out.println("primos " + primos);
//
//		public static boolean esPrimo(int numero) {
//		
//			if (numero <= 1) 
//			{
//				return false;
//			}
//		int contador = 0;
//		//bucle que cuenta los numeros divisibles
//		for (int i = (int) Math.sqrt(numero); i > 1; i--) 
//		{
//			if (numero % i == 0) {
//			contador++;
//		}
//		} 
//		return contador < 1;
//		}
//
//		int[] numeros = new int[10];
//		System.out.println("tamaño "+numeros.length);
//		//Visualizando el valor
//		System.out.println(Arrays.toString(numeros)); // Inicializar un array con valores directamente
//		String[] letras = {"a","b","c","d","e"};
//		System.out.println("tamaño "+letras.length);
//		//Visualizando el valor
//		System.out.println(Arrays.toString(letras));
//		//Leer el valor del indice deseado
//		System.out.println(letras[3]);
		
		/*Arreglo de dos dimensiones*/
		
//		int filas=0;
//		int columnas=0;
//		
//		System.out.println("Digite el numero de filas  del Array");
//		filas = sc.nextInt();
//		System.out.println("Digite el numero de columnas  del Array");
//		columnas = sc.nextInt();
//		
//		int array [][] = new int [filas][columnas];
//		
//		for (int i = 0; i < array.length; i++)
//		{	System.out.println("fila" +i);
//			for(int j=0; j< array[i].length; j++)
//			{	System.out.println( "columna" +j);
//				array[i][j]=sc.nextInt();
//
//			}
//			System.out.println("\n");
//		}
//		System.out.println(Arrays.deepToString(array));
//		
		int ax=0;
		int ay=0;
		int bx=0;
		int by=0;
		
		
		System.out.println("Digite el tamaño del eje x en la matriz A");
		ax = sc.nextInt();
		System.out.println("Digite el tamaño del eje y en la matriz A");
		ay = sc.nextInt();
		System.out.println("Digite el tamaño del eje x en la matriz B");
		bx = sc.nextInt();
		System.out.println("Digite el tamaño del eje y en la matriz B");
		by = sc.nextInt();
		
		int matrizA [][] = new int [ax][ay];
		int matrizB [][] = new int [bx][by];
		int matrizC [][] = new int [bx][by];
		
		System.out.println("Matriz A");
		for (int i = 0; i < matrizA.length; i++)
		{	System.out.println("Filas A: \n" +i);
			for(int j=0; j < matrizA[i].length; j++)
			{	System.out.println( "Columna A: \n" +j);
				matrizA[i][j]=sc.nextInt();

			}
		}
		
		System.out.println("Matriz B");
		for (int i = 0; i < matrizB.length; i++)
		{	System.out.println("Filas B: \n" +i);
			for(int j=0; j< matrizB[i].length; j++)
			{	System.out.println( "Columna B: \n" +j);
				matrizB[i][j]=sc.nextInt();

			}
		}
		
		System.out.println("Matriz C SUMA");
		for (int i = 0; i < matrizC.length; i++)
		{
			for(int j=0; j< matrizC[i].length; j++)
			{	
				matrizC[i][j]=matrizA[i][j]+matrizB[i][j];

			}
		}
		System.out.println(Arrays.deepToString(matrizC));
		System.out.println(Arrays.deepToString(matrizA));
		System.out.println(Arrays.deepToString(matrizB));
		
	
	}

}
