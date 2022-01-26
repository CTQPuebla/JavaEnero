package com;

import java.util.Date;

public class Purificadora {

	String nombre = "";
	String rfc= "";
	String direccion = "";
	
	public Purificadora(String nombre, String rfc, String direccion) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Purificadora [nombre=" + nombre + ", rfc=" + rfc + ", direccion=" + direccion + "]";
	}
	
	//generar un ticket
	
	public Object crearTicket(Producto pg,int cantidadp) {
		
		if(cantidadp >pg.getInventario()) {
			return "Inventario insuficiente";
			
			
		}else {
			//
			pg.setInventario(pg.getInventario()-cantidadp);
			
			Ticket tk = new Ticket(new Date(),20, pg.getPrecio()*cantidadp, pg);
			return tk;
			
		}

		
	}
	
	
}
