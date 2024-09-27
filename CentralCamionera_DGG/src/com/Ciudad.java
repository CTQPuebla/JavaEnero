package com;

public class Ciudad {
	
	String nombre;
	int kilometro;
	
	

	public Ciudad(String nombre, int kilometro) {
		super();
		this.nombre = nombre;
		this.kilometro = kilometro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getKilometro() {
		return kilometro;
	}

	public void setKilometro(int kilometro) {
		this.kilometro = kilometro;
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", kilometro=" + kilometro + "]";
	}
	
	
}
