package com;

import java.util.*;

public class Cliente extends Persona{

	//private String nombre;
	//private int edad;
	//private String domicilio;
	private Date fechaSalida;
	private String origen;
	private String destino;
	private int asiento;
	private boolean isEstudiante;
	//private int edad;
	
	public Cliente(String nombre, int edad, Date fechaSalida, String origen, String destino, int asiento, boolean isEstudiante) {
		super(nombre, edad);
		this.fechaSalida = fechaSalida;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.isEstudiante = isEstudiante;
	}
	
	
	
	public boolean getIsEstudiante() {
		return isEstudiante;
	}
	
	public void setIsEstudiante(boolean isEstudiante) {
		this.isEstudiante = isEstudiante;
	}
	public int getAsiento() {
		return asiento;
	}
	
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + getNombre() + ", fechaSalida=" + fechaSalida + ", origen=" + origen + ", destino="
				+ destino + ", isEstudiante=" + isEstudiante +"]";
	}
	
}
