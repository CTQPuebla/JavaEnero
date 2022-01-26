package com;

public class Tienda {
	private String nombre;
	private String sucursal;
	
	public Tienda(String nombre, String sucursal) {
		super();
		this.nombre = nombre;
		this.sucursal = sucursal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", sucursal=" + sucursal + "]";
	}
	
	
}
