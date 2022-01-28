package com;

public class Origen extends Lugar {
	boolean disponible;

	public Origen(String ciudad, String estado) {
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
	
	public String getOrigen() {
		return ciudad + ", " + estado;
	}
	
	
}
