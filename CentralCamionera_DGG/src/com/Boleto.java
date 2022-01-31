package com;

import java.util.*;

public class Boleto {

	Date fecha=new Date();
	Cliente cliente;
	int numeroCliente;
	Negocio nego;
	String destino;
	
	public Object tipoAltaBaja;
	public Boleto( Cliente cliente, int numeroCliente, Negocio nego,Object tipoAltaBaja ,String destino) {
		super();
		this.cliente = cliente;
		this.numeroCliente = numeroCliente;
		this.nego = nego;
		this.tipoAltaBaja=tipoAltaBaja;
		this.destino=destino;
		
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
	public int getNumeroCliente() {
		return numeroCliente;
	}
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	public Negocio getNego() {
		return nego;
	}
	public void setNego(Negocio nego) {
		this.nego = nego;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Object getTipoAltaBaja() {
		return tipoAltaBaja;
	}
	public void setTipoAltaBaja(Object tipoAltaBaja) {
		this.tipoAltaBaja = tipoAltaBaja;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Boleto [cliente=" + cliente +", fecha=" + fecha + ", numeroCliente=" + numeroCliente + ", nego=" + nego
				+ ", destino=" + destino + ", tipoAltaBaja=" + tipoAltaBaja + "]";
	}
		
		

	

	
	
	
}
