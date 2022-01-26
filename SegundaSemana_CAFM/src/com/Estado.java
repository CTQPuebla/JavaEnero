package com;

public class Estado {
	String nombre, clave, capital, zona;
	double extensionkm2;
	int numHabitantes;
	
	//Métodos constructores
	public Estado() {
	}
	
	public Estado(String nombre){
		this.nombre = nombre;
	}
	
	//Getters y setters
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

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public double getExtensionkm2() {
		return extensionkm2;
	}

	public void setExtensionkm2(double extensionkm2) {
		this.extensionkm2 = extensionkm2;
	}

	public int getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}
	
	//Método toString
	@Override
	public String toString() {
		return "Estado [nombre=" + nombre + ", clave=" + clave + ", capital=" + capital + ", zona=" + zona
				+ ", extensionkm2=" + extensionkm2 + ", numHabitantes=" + numHabitantes + "]";
	}

}
