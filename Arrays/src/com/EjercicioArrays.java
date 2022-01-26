package com;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam,dato,par=0,impar=0,cont=0;
		String primos="";
		
		System.out.println("Ingrese el tamaño del Array:");
		tam=sc.nextInt();
		
		int[] nums=new int[tam];
		
		for(int i=0;i<tam;i++){
			System.out.println("Ingrese el dato["+i+"]:");
			dato=sc.nextInt();
			nums[i]=dato; //nums[i]=sc.nextInt();
		
			if((nums[i]%2)==0) {
				par=par+nums[i];
			}else {
				impar=impar+nums[i];
			}
			
			if((nums[i]%(i+1))==0) {
				cont++;
			}
			
			if(cont==2 && nums[i]>1) {
				primos=primos+nums[i]+",";
			}
		}
		
		System.out.println("Sumatoria numeros pares: "+par);
		System.out.println("Sumatoria numeros impares: "+impar);
		System.out.println("Numeros primos: "+primos);
		
//		public static boolean esPrimo(int numero) {
//			if (numero <= 1) {
//				return false;
//			}
//			int contador = 0;
//			//bucle que cuenta los numeros divisibles
//			for (int i = (int) Math.sqrt(numero); i > 1; i--) {
//			if (numero % i == 0) {
//			contador++;
//			}
//			}
//
//
//
//			return contador < 1;
//			}
	}
}
