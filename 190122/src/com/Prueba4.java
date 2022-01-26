package com;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba4 {
	
	public static void main(String[] args) {
		
		Object[] b = new Object[5];
		Scanner sc = new Scanner(System.in);
//		b[0] = 73;
//		b[1] = '?';
//		b[2] = "hola";
//		b[3] = true;
//		b[4] = 1;
		
		for(int i=0;i<b.length;i++) {
			System.out.println("Valor "+(i+1));
			b[i] = sc.next();
		}
		sc.close();
		System.out.println(Arrays.toString(b));
	}
}
