package com;

import java.util.Date;
import java.util.Scanner;

public class Autobuses  {

	 String destino;
	 String origen;
	 String horasalida;
	 double costo;
	public Autobuses(String destino, String origen, String horasalida, double costo) {
		super();
		this.destino = destino;
		this.origen = origen;
		this.horasalida = horasalida;
		this.costo = costo;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getHorasalida() {
		return horasalida;
	}
	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	@Override
	public String toString() {
		return "\nDestino: " + destino + "\nOrigen: " + origen + "\nHorasalida: " + horasalida + "\nCosto: "
				+ costo ;
	}

	
	

}
