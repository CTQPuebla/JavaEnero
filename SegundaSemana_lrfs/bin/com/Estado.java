package com;

public class Estado {
	public Estado() {

	}
	
	public Estado(String nombre) {
		this.nombre = nombre;
	}
	
	String nombre, clave, capital;
	double extensionKm2;
	int habitantes;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getExtensionKm2() {
		return extensionKm2;
	}
	public void setExtensionKm2(double extensionKm2) {
		this.extensionKm2 = extensionKm2;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	@Override
	public String toString() {
		return "Estado [nombre=" + nombre + ", clave=" + clave + ", capital=" + capital + ", extensionKm2="
				+ extensionKm2 + ", habitantes=" + habitantes + "]";
	}
	
	
}
