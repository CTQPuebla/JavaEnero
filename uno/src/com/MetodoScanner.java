package com;

import java.util.*;

public class MetodoScanner {
	public static void main(String[] args) {
		String numero;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		numero=sc.nextLine();
		System.out.println("El numero "+numero+" tiene "+numero.length()+" cifras");
		
		int numeroint;
		System.out.println("Escribe otro numero:");
		numeroint=sc.nextInt();
		
		if(numeroint>=0 && numeroint<10) {
			System.out.println("el numero "+numeroint+" tiene una cifra");
		}else
		if(numeroint>=10 && numeroint<100) {
			System.out.println("el numero "+numeroint+" tiene dos cifra");
		}else if(numeroint>=100 && numeroint<1000) {
			System.out.println("el numero "+numeroint+" tiene tres cifra");
		}else if(numeroint>=1000 && numeroint<10000) {
			System.out.println("el numero "+numeroint+" tiene cuatro cifra");
		}else if(numeroint>=10000 && numeroint<100000) {
			System.out.println("el numero "+numeroint+" tiene cinco cifra");
		}else if(numeroint>=100000 && numeroint<1000000) {
			System.out.println("el numero "+numeroint+" tiene seis cifra");
		}
		
		int x=1;
		//primero evalua despues realiza
		while(x<10) {
			System.out.println("linea"+x);
				x++;
		}
		//primero realiza despues evalua
		int xx=1;
		do {
			System.out.println("impresion al menos una vez");
		xx++;
		}while(xx<=10);

		for(int n=0;n<=50;n++) {
			System.out.println("mirara aqui "+n);
		}
		for(int n=50;n>=0;n--) {
			System.out.println("mirara aqui "+n);
		}
		
		int z=10;
		for(;;) {
				System.out.println("hola ");
			z++;
			System.out.println(z);
			if(z==70) {
				break;
			}
		}
	}
}
