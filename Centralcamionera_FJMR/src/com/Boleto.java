package com;

import java.util.Date;

public class Boleto {
	int folio;
	Date fecha;
	 Cliente cliente;
	 Autobuses autobus;
	 
	
	public Boleto(int folio, Date fecha, Cliente cliente, Autobuses autobus) {
		super();
		this.folio = folio;
		this.fecha = fecha;
		this.cliente = cliente;
		this.autobus = autobus;
	}

	public Boleto()
	{
		
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Autobuses getAutobus() {
		return autobus;
	}
	public void setAutobus(Autobuses autobus) {
		this.autobus = autobus;
	}
	
	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	@Override
	public String toString() {
		return "Boleto-----------------------" + "\nFolio: " + folio + "\nFecha: " + fecha + "\nCliente--------" + cliente + "\nAutobus---------- " + autobus 
				
				;
	}
	 

    	
	 

}