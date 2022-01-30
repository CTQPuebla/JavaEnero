package Controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Modelo.Cliente;

public class Controlador {
	private static Scanner scann;
	private static List<Cliente> listClientes = new ArrayList<Cliente>();
	
	public Controlador() {}
	
	public String filtroMenuPrincipal(int opcion) {
		String r = "Error, seleccione una opcion enlistada";
		if(opcion >= 0 && opcion <= 1) {
			switch(opcion) {
				case 1: r = this.registrarCliente();
					break;
				default: r = "*** ADIOS ***";
			}
		}
		return r;
	}
	
	public String registrarCliente() {
		String r = "Error al capturar datos";
		System.out.print("\nIngresa tu nombre: ");
		String nombre = scann.nextLine();
		if(nombre.length() > 0) {
			System.out.print("\nIngresa tu primer apellido: ");
			String primerApellido = scann.nextLine();
			if(primerApellido.length() > 0) {
				System.out.println("Ingresa tu fecha de nacimiento (DD-MM-YYYY)");
				SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");
				String fecha = scann.nextLine();
				try {
					Date fechaNacimiento = format.parse(fecha);
					
				} catch (ParseException e) {
					r = "Error en el formato de fecha";
					e.printStackTrace();
				}
			}
		}
		return r;
	}
	
	public String pedirDireccion() {
		String r = "Error al capturar la direccion";
		
		return r;
	}
}
