package com;
import java.util.Arrays;
import java.util.Scanner;
public class DobleArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digita el tamaño de fila ");
		int sizeA = sc.nextInt();
		System.out.println("Digita el tamaño de columna ");
		int sizeC = sc.nextInt();
		System.out.println("El tamaño de tu Array es " + sizeA + "x" + sizeC);
		
		int[][]sizeB =new int[sizeA][sizeC];
			


		for(int a=0; a<sizeB.length; a++) {
			for(int b=0; b<sizeB[a].length; b++) {
				System.out.println("Ingresa un numero : ");
				
				System.out.print("Fila " + "["+ a +"]" + "Columna" 
			+ "["+b+"]"  );
				sizeB[a][b] =sc.nextInt();
		}
	}
		System.out.println(Arrays.deepToString(sizeB));	
  }
}
