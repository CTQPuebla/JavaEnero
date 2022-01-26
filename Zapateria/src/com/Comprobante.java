package com;

import java.util.*;

public class Comprobante {

	private Date fecha;
	private int numeroDeOperacion;
	private Venta producto;
	private Zapateria tienda;
	private Cliente cliente;
	

	
	
	public Comprobante( int numeroDeOperacion, Venta producto, Zapateria tienda, Cliente cliente) {
		super();
		this.numeroDeOperacion = numeroDeOperacion;
		this.producto = producto;
		this.tienda = tienda;
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getNumeroDeOperacion() {
		return numeroDeOperacion;
	}
	public void setNumeroDeOperacion(int numeroDeOperacion) {
		this.numeroDeOperacion = numeroDeOperacion;
	}
	
	
	
	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", numeroDeOperacion=" + numeroDeOperacion + ", producto=" + producto
				+ ", tienda=" + tienda + ", cliente=" + cliente + "]";
	}

	
	
}
