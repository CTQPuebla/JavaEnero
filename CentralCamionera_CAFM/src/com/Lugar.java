package com;

public class Lugar {
	String ciudad, estado;
	
	public Lugar(String ciudad, String estado) {
		super();
		this.ciudad = ciudad;
		this.estado = estado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return ciudad + "," + estado;
	}
	
	
}
