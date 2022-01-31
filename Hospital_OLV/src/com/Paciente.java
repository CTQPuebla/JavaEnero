package com;

public class Paciente {
	String nombre;
	String apellido;
	String sintomas;
	int Edad;
	double peso;
	double estatura;
	
	public Paciente(String nombre, String apellido, String sintomas, int edad, double peso, double estatura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sintomas = sintomas;
		Edad = edad;
		this.peso = peso;
		this.estatura = estatura;
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

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre 
				+ "\nApellido: " + apellido 
				+ "\nSintomas: " + sintomas 
				+ "\nEdad: " + Edad
				+ "\nPeso: " + peso 
				+ "\nEstatura: " + estatura 
				+"\n";
	}
	
	
	
		
	

}
