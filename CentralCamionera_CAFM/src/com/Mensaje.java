package com;

public class Mensaje {
	int numeroError;
	String mensajeTexto;
	
	public Mensaje() {
		
	}
	
	public Mensaje(int numeroError, String mensajeTexto) {
		super();
		this.numeroError = numeroError;
		this.mensajeTexto = mensajeTexto;
	}

	public int getNumeroError() {
		return numeroError;
	}

	public void setNumeroError(int numeroError) {
		this.numeroError = numeroError;
	}

	public String getMensajeTexto() {
		return mensajeTexto;
	}

	public void setMensajeTexto(String mensajeTexto) {
		this.mensajeTexto = mensajeTexto;
	}
	
}
