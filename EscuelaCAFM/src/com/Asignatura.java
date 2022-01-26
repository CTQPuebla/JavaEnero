package com;

public class Asignatura {
	private String clave,nombre,tipo;
	private double creditos;
	public Asignatura(String clave, String nombre, String tipo, double creditos) {
		super();
		this.clave = clave;
		this.nombre = nombre;
		this.tipo = tipo;
		this.creditos = creditos;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getCreditos() {
		return creditos;
	}
	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}
	@Override
	public String toString() {
		return "\nAsignatura [clave=" + clave + ", nombre=" + nombre + ", tipo=" + tipo + ", créditos=" + creditos + "]";
	}
	
	
}
