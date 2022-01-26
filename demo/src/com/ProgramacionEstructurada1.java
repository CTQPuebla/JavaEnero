package com;

public class ProgramacionEstructurada1 {

	public static void main(String[] args) {
		
		int a = 0;
		
		if (a==0) {
			a++;
		}
		
		if(a==2) {
			System.out.println("No deberias ver esta linea");
		} else if(a==3) {
			System.out.println("No deberias ver esta linea");
		} else {
			System.out.println("Ejecucion apropiada");
			a += 5;
		}
		
		switch(a) {
		case 1:
			System.out.println("No deberias ver esta linea");
			break;
		case 3:
			System.out.println("No deberias ver esta linea");
			break;
		case 6:
			System.out.println("Fin del programa");
			break;
		default:
			System.out.println("!Algo salio mal!");
			break;
		}
		
	}

}
