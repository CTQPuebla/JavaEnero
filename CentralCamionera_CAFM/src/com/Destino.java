package com;

public class Destino extends Lugar{
	boolean disponible;

	public Destino(String ciudad, String estado) {
		super(ciudad, estado);
		this.disponible = true;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		if(disponible) {
			return ciudad + "," + estado + " (Disponible)";
		} else {
			return ciudad + "," + estado + " (No disponible)";
		}
	}
	
	public String getDestino() {
		return ciudad + ", " + estado;
	}
	
}
