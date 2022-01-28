package com;
import java.util.*;

public class Boleto {
	Cliente cliente;
	String origen, destino;
	Date salida,llegada;
	int numAsiento;
	double precio;
	
	public Boleto() {
		
	}

	public Boleto(Cliente cliente, String origen, String destino, Date salida, Date llegada, int numAsiento,
			double precio) {
		this.cliente = cliente;
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.llegada = llegada;
		this.numAsiento = numAsiento;
		this.precio = precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public int getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
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
		return "Boleto [cliente=" + cliente + ", origen=" + origen + ", destino=" + destino + ", salida=" + fechaTexto(salida)
				+ ", llegada=" + fechaTexto(llegada) + ", numAsiento=" + numAsiento + ", precio=" + precio + "]";
	}
	
	
}
