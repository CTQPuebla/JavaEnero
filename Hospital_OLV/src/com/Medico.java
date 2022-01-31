package com;

public class Medico {
	String nombre;
	String apellido;
	String cedula;
	String numConsultorio;
	String Especialidad;
	
	public Medico(String nombre, String apellido, String cedula, String numConsultorio, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.numConsultorio = numConsultorio;
		Especialidad = especialidad;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNumConsultorio() {
		return numConsultorio;
	}

	public void setNumConsultorio(String numConsultorio) {
		this.numConsultorio = numConsultorio;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre 
				+ "\nApellido: " + apellido 
				+ "\nCédula Profesional: " + cedula 
				+ "\nConsultorio: " + numConsultorio 
				+ "\nEspecialidad: " + Especialidad + "\n";
	}
	
	
	

}
