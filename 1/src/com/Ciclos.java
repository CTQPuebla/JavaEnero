package com;

import java.util.*;

public class Ciclos {

	public static void main(String args[]) {
		int numero;
		int n=1;
		int cantidad=0;
		int total=0;
		while(n<=15) {
		System.out.println("Escribe un numero:");
		Scanner sc=new Scanner(System.in);
		numero=sc.nextInt();
		if((numero%2)==0) {
			cantidad=cantidad+1;
		}else {
			total=total+numero;
		}
			n++;
		}
		System.out.println(total);
		System.out.println(cantidad);
	}
}
