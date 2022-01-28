package com;

public class Doctor {
	String nombre;
	String especialidad;
	String cedula;
	
	public Doctor(String nombre, String especialidad, String cedula) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return nombre + " Especialidad:" + especialidad + " Cedula:" + cedula;
	}
	
}
