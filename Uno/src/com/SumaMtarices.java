package com;
import java.util.Scanner;
import java.util.Arrays;
public class SumaMtarices {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Matriz ");
	System.out.println("Digita el tamaño de fila ");
	int fila = sc.nextInt();
	System.out.println("Digita el tamaño de columna ");
	int columna = sc.nextInt();
	System.out.println("El tamaño de tu Array es " + fila + "x" + columna);
	
	int[][]mat1 =new int[fila][columna];
	int[][]mat2 =new int[fila][columna];
	int[][]res =new int[fila][columna];
	
	//Lenado de primer matriz
	//"a" indica el numero de fila(0++) y b el numero de columna(0++)
	System.out.println("Datos Matriz 1 :");
	for(int a=0; a<mat1.length; a++) {
		for(int b=0; b<mat1[a].length; b++) {
					
			System.out.println("Ingresa un numero : ");
			
			System.out.println("Fila " + "["+ a +"]" + "Columna" 
		+ "["+b+"]"  );
			mat1[a][b] =sc.nextInt();
	}
}
	
	//Llenado segunda matriz
	System.out.println("Datos Matriz 2 :");
	for(int a=0; a<mat2.length; a++) {
		for(int b=0; b<mat2[a].length; b++) {
			System.out.println("Ingresa un numero : ");
			
			System.out.println("Fila " + "["+ a +"]" + "Columna" 
		+ "["+b+"]"  );
			mat2[a][b] =sc.nextInt();
	}
}

	//Suma o resta de la matriz
	for ( int a= 0 ; a < mat1.length ; a++ ) {
		for ( int b= 0 ; b < mat2.length ;b++ )
		res[a][b] = mat1[a][b] + mat2[a][b] ; 
	}
		 
	//Imprimiendo las matrices
	// usar "\t" no da un espacio automatico no controlado
	//es mejor determinar en("   ") el numero de espacios que queremos
	// en este ejemplo/ejercicio  es 3,esto nos proporcionara orden.
	
	
		System.out.println("Suma de las matrices: ");
		 
		for ( int a= 0 ; a < mat1.length ; a++ ){ 
			for (int b= 0; b<mat1.length ; b++){
				//.print nos proporciona impresion sin salto de linea
				System.out.print("[" + mat1[a][b] + "]");
			}
			if(a==1) {
			System.out.print(" + ");
			}else {
				System.out.print("   ");
			}
			for (int b= 0; b<mat2.length ; b++){
				System.out.print("[" + mat2[a][b] + "]");
			}
			if(a==1) {
				System.out.print(" = ");
				}else {
					System.out.print("   ");
				}
			for (int b= 0; b<res.length ; b++){
				System.out.print("[" + res[a][b] + "]");
			}
			System.out.println("   ");
		}
 
    }

}
