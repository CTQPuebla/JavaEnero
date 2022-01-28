package com;

public class Cliente {
	int numCliente;
	String nombre, apellido1, apellido2, telefono, email;
	
	public Cliente() {
		
	}

	public Cliente(int numCliente, String nombre, String apellido1, String apellido2, String telefono, String email) {
		super();
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [numCliente=" + numCliente + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	public String nombreCompleto() {
		return nombre + " " + apellido1 + " " + apellido2;
	}
	
}
