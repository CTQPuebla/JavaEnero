package com;

public class Negocio {

	String nombre;
	String Direccion;
	public Negocio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		Direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Negocio [nombre=" + nombre + ", Direccion=" + Direccion + "]";
	}
	
	
}
