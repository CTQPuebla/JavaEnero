package com;

public class Estado {
	String nombre;
	String clave;
	int numHabitantes;
	double extensionKM2;
	String capiltal,zona;
	
	public Estado() {
		
	}
	public Estado(String nombre) {
		this.nombre=nombre;
	}
	
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
	public int getNumHabitantes() {
		return numHabitantes;
	}
	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}
	public double getExtensionKM2() {
		return extensionKM2;
	}
	public void setExtensionKM2(double extensionKM2) {
		this.extensionKM2 = extensionKM2;
	}
	public String getCapiltal() {
		return capiltal;
	}
	public void setCapiltal(String capiltal) {
		this.capiltal = capiltal;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	@Override
	public String toString() {
		return "Estado [nombre=" + nombre + ", clave=" + clave + ", numHabitantes=" + numHabitantes + ", extensionKM2="
				+ extensionKM2 + ", capiltal=" + capiltal + ", zona=" + zona + "]";
	}
	
	
}
