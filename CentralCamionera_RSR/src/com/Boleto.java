package com;

import java.util.Date;

public class Boleto{
	
	private String nombre;
	private String empresa;
	private String fechaSalida;
	private String horaSalida;
	private int asiento;
	private double precio;
	private String folio;
	private String origen;
	private String destino;
	private String tipo;
	
	public Boleto(String nombre, int edad, String empresa, String fechaSalida, String horaSalida, int asiento, boolean isEstudiante, double precio, String origen,String destino, String tipo) {

		this.nombre = nombre;
		this.empresa = empresa;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.asiento = asiento;
		this.precio = precio;
		this.folio = generarFolio();
		this.origen = origen;
		this.destino = destino;
		this.tipo = tipo;
		this.fechaSalida = fechaSalida;
	}
	
	private String generarFolio() {
		
			String folio = "";
			
			for(int i = 0; i < 12; i++){
				
				folio = folio + (int)(Math.random() * 9);
			}
			
			return folio;
		
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
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
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getFechaSalida() {
		return fechaSalida;
	}
	
	public String getHoraSalida() {
		return horaSalida;
	}
	
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	
	public int getAsiento() {
		return asiento;
	}
	
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo() {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Boleto [nombre=" + getNombre() + ", empresa=" + getEmpresa() + ", fecha de Salida=" + getFechaSalida() + ", hora de salida= "+ horaSalida + ", asiento=" + getAsiento()
				+ ", precio=" + precio + ", folio=" + folio + ", origen=" + origen + ", tipo=" + getTipo() + ", destino=" + destino + "]";
	}

}
