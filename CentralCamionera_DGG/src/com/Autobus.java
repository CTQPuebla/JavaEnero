package com;

import java.util.Date;

public abstract class Autobus {

	int numPlaca;
	String horaDeSalida;
	Conductor conductor;
	
	
	
	public Autobus(int numPlaca, String numeroDeSalida, Conductor conductor) {
		super();
		this.numPlaca = numPlaca;
		this.horaDeSalida = numeroDeSalida;
		this.conductor = conductor;
	}
	
	
	public int getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(int numPlaca) {
		this.numPlaca = numPlaca;
	}
	public String  getNumeroDeSalida() {
		return horaDeSalida;
	}
	public void setNumeroDeSalida(String numeroDeSalida) {
		this.horaDeSalida = numeroDeSalida;
	}
	public Conductor getConductor() {
		return conductor;
	}
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	@Override
	public String toString() {
		return "Autobus [numPlaca=" + numPlaca + ", numeroDeSalida=" + horaDeSalida + ", conductor=" + conductor
				+ "]";
	}
	
	public abstract double  precios(double distancia);
	
	
	
}
