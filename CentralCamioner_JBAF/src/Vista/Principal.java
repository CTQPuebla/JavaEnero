package Vista;

import java.util.Scanner;

import Controlador.Controlador;

public class Principal {

	public static void main(String[] args) {
		int opc = 0;
		Controlador control = new Controlador();
		Scanner scann = new Scanner(System.in);
		do {
			System.out.println(""
					+ "\n1. Agregar Cliente"
					+ "\n0. Salir\n");
			System.out.print("Ingresa tu opcion: "); 
			opc = scann.nextInt();
			System.out.println(control.filtroMenuPrincipal(opc));
		}while(opc != 0);
		scann.close();
	}

}
