package com;

public class Estado {//Atributos
	String nombre;
	String clave;
	int numHabitantes;
	double extensionKm2;
	String capital, zona;
	
	//Metodo constructor vacio
	public Estado(){
		
	}
	
	//Constructor con un parámetro
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

	public double getExtensionKm2() {
		return extensionKm2;
	}

	public void setExtensionKm2(double extensionKm2) {
		this.extensionKm2 = extensionKm2;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Estado [nombre=" + nombre + ", clave=" + clave + ", numHabitantes=" + numHabitantes + ", extensionKm2="
				+ extensionKm2 + ", capital=" + capital + ", zona=" + zona + "]";
	}
	
	
}
