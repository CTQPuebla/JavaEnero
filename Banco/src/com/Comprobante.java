package com;

import java.util.Date;

public class Comprobante {

	private Date fecha;
	private String numcuenta;
	private double retiro;
	private int numoperacion;
	
	public Comprobante(Date fecha, String numcuenta, double retiro, int numoperacion) {
		super();
		this.fecha = fecha;
		this.numcuenta = numcuenta;
		this.retiro = retiro;
		this.numoperacion = numoperacion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}
	public double getRetiro() {
		return retiro;
	}
	public void setRetiro(double retiro) {
		this.retiro = retiro;
	}
	public int getNumoperacion() {
		return numoperacion;
	}
	public void setNumoperacion(int numoperacion) {
		this.numoperacion = numoperacion;
	}
	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", numcuenta=" + numcuenta + ", retiro=" + retiro + ", numoperacion="
				+ numoperacion + "]";
	}
	
	
	
	
	
}
