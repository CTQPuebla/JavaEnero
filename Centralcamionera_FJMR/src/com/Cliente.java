package com;

public class Cliente {

	 String nombre;
	 String apellido;
	 int edad;
	 String ocupacion;
	 
	public Cliente(String nombre, String apellido, int edad, String ocupacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ocupacion = ocupacion;
	}
	
	public Cliente()
	{
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	@Override
	public String toString() {
		return  "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nOcupacion: " + ocupacion;
	}
	
	
	
	
}