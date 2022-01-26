package com;

import java.util.Date;

public class Banco {
	private String nombre, domicilio;
	private int contador;

	public Banco(String nombre, String domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.contador = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", domicilio=" + domicilio + "]";
	} 
	
	//Comportamiento propio
	public Object crearCuentaDebito(Cliente c) {
		if(c.getEdad()>=18 && c.getEdad()<=65) {
			return new Cuenta(Integer.toString(++contador), "0000", new Date(), true, 2000, 100, 10000, c);
		} else {
			return "Edad de cliente no válida";
		}
	}
}
