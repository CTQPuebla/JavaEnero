package com;

import java.util.Date;

public class Comprobante {
	
	private Date fecha;
	private String numCuenta;
	private double retiro;
	private int numOperacion;
	public Comprobante(Date fecha, String numCuenta, double retiro, int numOperacion) {
		super();
		this.fecha = fecha;
		this.numCuenta = numCuenta;
		this.retiro = retiro;
		this.numOperacion = numOperacion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getRetiro() {
		return retiro;
	}
	public void setRetiro(double retiro) {
		this.retiro = retiro;
	}
	public int getNumOperacion() {
		return numOperacion;
	}
	public void setNumOperacion(int numOperacion) {
		this.numOperacion = numOperacion;
	}
	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", numCuenta=" + numCuenta + ", retiro=" + retiro + ", numOperacion="
				+ numOperacion + "]";
	}
	
	

}
