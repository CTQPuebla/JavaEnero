package com;

public class Asiento {
	int numAsiento, disponible;
	
	public Asiento() {
	}
	
	public Asiento(int numAsiento) {
		super();
		this.numAsiento = numAsiento;
		this.disponible = 1;
	}

	public int getnumAsiento() {
		return numAsiento;
	}

	public void setnumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}

	public int getDisponible() {
		return disponible;
	}

	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		if(this.getDisponible() == 0) {
			return "(X) " + numAsiento;
		} else {
			return "( ) " + numAsiento;
		}
	}
	
	
}
