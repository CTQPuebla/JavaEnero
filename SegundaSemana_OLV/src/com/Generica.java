package com;

public class Generica {
	private String nombre;
	private String apellidos;
	private int edad;
	private String sexo;
	
	public Generica(String nombre, String apellidos, int edad, String sexo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre 
				+ "\nApellidos: " + apellidos 
				+ "\nEdad: " + edad 
				+ "\nSexo: " + sexo
				+"\n";
	}
	
	
	
	
	
	
	
	
	

}
