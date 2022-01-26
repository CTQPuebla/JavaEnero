package com;

import java.util.Arrays;
import java.util.Scanner;

public class EjercArray2d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamf, tamc,tamf2, tamc2,dato,dato2;
		
		System.out.println("Filas de la matriz 1:");
		tamf=sc.nextInt();
		System.out.println("Columnas de la matriz 1:");
		tamc=sc.nextInt();
		System.out.println("Filas de la matriz 2:");
		tamf2=sc.nextInt();
		System.out.println("Columnas de la matriz 2:");
		tamc2=sc.nextInt();
			
		if(tamf==tamf2 && tamc==tamc2) {
			int[][] nums=new int[tamf][tamc];
			int[][] nums2=new int[tamf2][tamc2];
			int[][] suma=new int[tamf][tamc];
			
			System.out.println("Datos Matriz 1");
			for(int i=0;i<nums.length;i++){
				for(int j=0;j<nums.length;j++) {
					System.out.println("Ingrese el dato["+i+"]["+j+"]:");
					dato=sc.nextInt();
					nums[i][j]=dato; //nums[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Datos Matriz 2");
			for(int k=0;k<nums2.length;k++){
				for(int l=0;l<nums2.length;l++) {
					System.out.println("Ingrese el dato["+k+"]["+l+"]:");
					dato2=sc.nextInt();
					nums2[k][l]=dato2; //nums[i][j]=sc.nextInt();
				}
			}
			
			for(int m=0;m<suma.length;m++){
				for(int n=0;n<suma.length;n++) {
					suma[m][n]=nums[m][n]+nums2[m][n];
				}
			}
			System.out.println("Matriz 1: "+Arrays.deepToString(nums));
			System.out.println("Matriz 2: "+Arrays.deepToString(nums2));
			System.out.println("Suma: "+Arrays.deepToString(suma)); 
		}else {
			System.out.println("El tamaño de las matrices no coincide");
		}
	}
}
