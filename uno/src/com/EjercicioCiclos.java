package com;

import java.util.*;

public class EjercicioCiclos {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num,par=0,impar=0;
		
		for(int i=0;i>15;i++) {
			System.out.println("Escribe un numero: ");
			num=sc.nextInt();
			if(num%2==0) {
				par++;
			}else {
				impar=impar+num;
			}
		}
		
		System.out.println("Hay "+par+" numeros pares");
		System.out.println("La sumatoria de los numeros impares es:"+impar);
	}
}
