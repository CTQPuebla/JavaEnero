package com;

import java.util.Date;

public abstract class Hospital {
	String nombre;
	String direccion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public abstract String consultar(String fecha, Doctor dr, Paciente pac, String diagnostico);
	public abstract String recetar(String fecha, Doctor dr, Paciente pac, String medicamentos);
	public abstract String ordenarOperacion(int numOrden, Doctor dr, Paciente pac, String fecha,String hora, String padeciemiento);
	public abstract String operar(Doctor dr, Paciente pac, int numOrden);
	
	
}
