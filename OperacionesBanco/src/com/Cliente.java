package com;

public class Cliente {
	private int id, edad;
	private String nombre, domicilio, correo, telefono;
	
	public Cliente(int id, int edad, String nombre, String domicilio, String correo, String telefono) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.correo = correo;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String gettelefono() {
		return telefono;
	}

	public void settelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", domicilio=" + domicilio + ", correo="
				+ correo + ", telefono=" + telefono + "]";
	}
	
}
