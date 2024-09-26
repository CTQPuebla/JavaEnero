package com;
import java.util.Scanner;

public class Switchleeelnumero {
public static void main(String[] args) {
	Scanner edad = new Scanner(System.in);
	
	System.out.println("Escribe tu edad");
	int myAge = edad.nextInt();
	System.out.println("Tu edad es" + myAge);
	if (myAge<=12 && myAge>=1) {
		System.out.println("Niño pequeño ");
	}
	else if (myAge>=13) {
		System.out.println("Adolescente");
	}
	else if(myAge>=18) {
		System.out.println("Adulto Joven");
	}
	else {
		System.out.println("Adulto");
	}
	
	
	
	Scanner numero = new Scanner(System.in);
	System.out.println("Escribe tu numero");
	int a = numero.nextInt();
	String longitudNumero = Integer.toString(a);
//	 if (longitudNumero.length()==1) {
//		 System.out.println("Tu numero tiene 1 cifra");
//	 }
//	 else if (longitudNumero.length()==2) {
//		 System.out.println("Tu numero tiene 2 cifras");
//	 }
	System.out.println("El numero tiene " 
+ longitudNumero.length() + " cifras");
	 
	
    }	
	
}
