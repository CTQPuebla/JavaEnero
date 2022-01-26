package com;
import java.util.*;

public class Prueba8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer valor;");
		int a = sc.nextInt();
		System.out.println("Ingrese el segundo valor;");
		int b = sc.nextInt();
		String resultado = (a>b)?a+" es mayor a "+b:b+" es mayor a "+a;
		System.out.println(resultado);
	}

}
