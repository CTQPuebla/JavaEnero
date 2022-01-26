package com;

public class Cliente {
	private int id;
	private String nombre;
	private String domicilio;
	private String correo;
	private String telefono;
	private int edad;
	
	public Cliente(int id, String nombre, String domicilio, String correo, String telefono, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", domicilio=" + domicilio + ", correo=" + correo
				+ ", telefono=" + telefono + ", edad=" + edad + "]";
	}
	
	
}
