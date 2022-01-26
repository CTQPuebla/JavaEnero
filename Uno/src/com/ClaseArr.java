package com;
import java.util.Arrays;
import java.util.Scanner;


public class ClaseArr {
	public static void main(String[] args) {
		//Arrays
		
		//crear un array de un tamaña especifico
//		int [] numeros= new int[10];
//		System.out.println(numeros.length);
		//Visualizando el valor
//		System.out.println(Arrays.toString(numeros));
//		
//		String[] letras ={"a","e","i","o","u"};
//		System.out.println(letras.length);
//		System.out.println(Arrays.toString(letras));
//		System.out.println(letras[2]);
		
		//de que tamaño sera el array,llenarlo y mostra su contenido
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita el tamaño de tu Array ");
		int sizeA = sc.nextInt();
		int[] sizeB =new int[sizeA];
		for(int a=0; a<sizeB.length; a++) {
			
			System.out.println("Ingresa tu numero");
			sizeB[a] = sc.nextInt();
		}
		System.out.println(sizeB.length);
		System.out.println(Arrays.toString(sizeB));
		System.out.println(sizeB[3]);

}
}