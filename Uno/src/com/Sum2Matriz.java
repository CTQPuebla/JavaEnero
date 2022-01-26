package com;
import java.util.Arrays;
public class Sum2Matriz {
public static void main(String[] args) {
	int [][] matriz1 = new int [30][30];
	int [][] matriz2 = new int [30][30];
	int [][] resultado = new int [30][30];
	
	//Llenado primera matriz
	for (int i=0; i<matriz1.length;i++) {
		for(int j=0; j<matriz1.length;j++) {
			//usamos (int) Math.random()*numero del 1 al que queramos que muestre
			matriz1[i][j]= (int) (Math.random()*5);
		}
	}
	
	//Llenado segunda matriz
	for (int i=0; i<matriz2.length;i++) {
		for(int j=0; j<matriz2.length;j++) {
			//usamos (int) Math.random()*numero del 1 al que queramos que muestre
			matriz2[i][j]= (int)(Math.random()*5);
		}
	}
	//Suma de matrices aqui el for solo indica como se recorreran 
	//las filas y columnas en las matrices
	for (int i=0; i<matriz1.length;i++) {
		for(int j=0; j<matriz1.length;j++) {
			resultado[i][j]= matriz1[i][j] + matriz2[i][j];
		}
	}
	
	//Imprimimos los resultados
	
	System.out.println("Suma de las matrices: ");
	 
	for ( int i= 0 ; i < matriz1.length ; i++ ){ 
		for (int j= 0; j<matriz1.length ; j++){
			//.print nos proporciona impresion sin salto de linea
			System.out.print("[" + matriz1[i][j] + "]");
		}
		if(i==15) {
		System.out.print(" + ");
		}else {
			System.out.print("   ");
		}
		for (int j= 0; j<matriz2.length ; j++){
			System.out.print("[" + matriz2[i] [j] + "]");
		}
		if(i==15) {
			System.out.print(" = ");
			}else {
				System.out.print("   ");
			}
		for (int j= 0; j<resultado.length ; j++){
			System.out.print("[" + resultado[i][j] + "]");
		}
		System.out.println("   ");
	}
}
}
