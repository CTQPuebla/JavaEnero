package com;

import java.time.LocalDate;
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		/*
		HashMap<String, Contacto> hs = new HashMap<String, Contacto>();
		
		Contacto contacto1 = new Contacto("juan","direccion1","123456789","juan@correo.com");
		Contacto contacto2 = new Contacto("Turing","127.0.0.1","123456781","AlanT@correo.com");
		Contacto contacto3 = new Contacto("Torvalds","localhost:8080","123456782","linux@correo.com");
		Contacto contacto4 = new Contacto("Ritchie","direccion4","123456782","linux@correo.com");
		
		//agregar elemento
		
		hs.put(contacto1.getNombre(), contacto1);
		hs.put(contacto2.getNombre(), contacto2);
		hs.put(contacto3.getNombre(), contacto3);
		hs.put(contacto4.getNombre(), contacto4);
		
		
		//System.out.println(hs.toString());
		
		//obtener un elemento del hash
		//System.out.println(hs.get(contacto2.getNombre()));
		
		//System.out.println(hs.values());
		
		//buscar dentro de los valores asociados
		for(String k: hs.keySet()) {
			
			if(hs.get(k).getDireccion().equals("127.0.0.1")) {
				System.out.println(hs.get(k));
			}
			
		}
		
		*/
		
		
		//central camionera
		//cliente, fecha y hora ida/vuelta
		//personal que atiende(central camionera)
		
		//reglas:
		//clases abstractas o interfaces
		//subirlo a teams
		//crear hashmap a que persona se le vendio el boleto
		
		//prueba
		Cliente cliente = new Cliente("Dennis ritchie", 60, new Date(), "Puebla", "Veracruz", 10, true);
		System.out.println(cliente);
		
		Terminal terminal = new Terminal("ADO");
		terminal.llenarEstados();
		
		/*
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("cuantos estados?");
		int numeroEstados = scan.nextInt();
		String nuevoEstado="";
		
		for(int i =0;i<numeroEstados;i++) {
			System.out.println("Escribe el estado");
			nuevoEstado = scan1.nextLine();
			terminal.setEstados(nuevoEstado);
		}
		
		*/
		System.out.println(terminal);
		
		TrabajadorTerminal expendedorBoletos = new TrabajadorTerminal("luis perez",50, "curp", "numero SS","RFC");
		System.out.println(expendedorBoletos);
		expendedorBoletos.recibirCliente(terminal, cliente);
		
	}

}
