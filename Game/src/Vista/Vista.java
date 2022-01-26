package Vista;

import java.util.Scanner;

import Controlador.Controlador;

public class Vista {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Controlador control = new Controlador("","");
		do {
			control.pintarInterfaz();
		} while(control.isActive());
	}

}
