package com;

//import java.util.HashMap;

public class Paciente {
	String nombre;
	int edad;
	double estatura;
	double peso;
	String sexo;
	
	//private HashMap<Integer, Paciente> pacientes = new HashMap<>();
	
	public Paciente(String nombre, int edad, double estatura, double peso, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return nombre + " Edad:" + edad + " Estatura:" + estatura + " Peso:" + peso + " Sexo:"
				+ sexo;
	}

		
//	public HashMap<Integer, Paciente> getPacientes() {
//		return pacientes;
//	}
//	public void setPacientes(HashMap<Integer, Paciente> pacientes) {
//		this.pacientes = pacientes;
//	}
}
