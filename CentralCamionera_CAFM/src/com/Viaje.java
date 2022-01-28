package com;

import java.util.*;

public class Viaje {
	Origen origen;
	Destino destino;
	Date salida;
	Date llegada;
	Autobus autobus;
	double precio;
	
	public Viaje(Origen origen, Destino destino, Date salida, Date llegada, Autobus autobus, double precio) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.llegada = llegada;
		this.autobus = autobus;
		this.precio = precio;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Date getSalida() {
		return salida;
	}

	public void setSalida(Date salida) {
		this.salida = salida;
	}

	public Date getLlegada() {
		return llegada;
	}

	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}

	public Autobus getAutobus() {
		return autobus;
	}

	public void setAutobus(Autobus autobus) {
		this.autobus = autobus;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@SuppressWarnings("deprecation")
	public String fechaTexto(Date date) {
		String fecha = "", separador="/", separador2=":";
		if(date.getDate()<10) {
			fecha += "0";
		}
		fecha += Integer.toString(date.getDate())+separador;
		if(date.getMonth()<10) {
			fecha += "0";
		}
		fecha += Integer.toString(date.getMonth())+separador;
		fecha += Integer.toString(date.getYear())+" ";
		
		if(date.getHours()<10) {
			fecha += "0";
		}
		fecha += Integer.toString(date.getHours())+separador2;
		if(date.getMinutes()<10) {
			fecha += "0";
		}
		fecha += Integer.toString(date.getMinutes())+" hrs";
		return fecha;
	}

	@Override
	public String toString() {
		return "Viaje [origen=\"" + origen.getOrigen() + "\", destino=\"" + destino.getDestino()
				+ "\", salida=" + fechaTexto(salida) + ", llegada=" + fechaTexto(llegada)
				+ ", autobus=" + autobus.getNumAutobus() + ", precio=$" + precio + "]";
	}
	
	public Object seleccionarAsiento(int asiento) {
		asiento--;
		List<Asiento> asientos = this.autobus.getAsientos();
		Mensaje m = new Mensaje();
		m.setNumeroError(0);
		m.setMensajeTexto("No se encontró el asiento");
		for(int i=0;i<asientos.size();i++) {
			if(i==asiento) {
				if(asientos.get(i).disponible==1) {
					m.setNumeroError(1);
					m.setMensajeTexto("Asiento disponible");
					this.autobus.getAsientos().get(i).setDisponible(0);
				} else {
					m.setNumeroError(2);
					m.setMensajeTexto("No está disponible el asiento");
				}
			}
		}
		return m;
	}
	
}
