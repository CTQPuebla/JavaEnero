package com;

public  class Cliente extends Persona {

	int edad;

	public Cliente(String nombre, int edad) {
		super(nombre);
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", nombre=" + nombre + "]";
	}

	
	
	
}
