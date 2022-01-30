package Modelo;

import java.util.Date;

public class Cliente extends Persona {
	private String tipoCliente;
	private int puntos;
	private int numViajes;
	
	public Cliente(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
			Direccion direccion, Contacto contacto, String tipoCliente, int puntos, int numViajes) {
		super(nombre, primerApellido, segundoApellido, fechaNacimiento, direccion, contacto);
		this.tipoCliente = tipoCliente;
		this.puntos = puntos;
		this.numViajes = numViajes;
	}
	
	public Cliente(String nombre, String primerApellido, Date fechaNacimiento,
			Direccion direccion, Contacto contacto, String tipoCliente, int puntos, int numViajes) {
		super(nombre, primerApellido, fechaNacimiento, direccion, contacto);
		this.tipoCliente = tipoCliente;
		this.puntos = puntos;
		this.numViajes = numViajes;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getNumViajes() {
		return numViajes;
	}

	public void setNumViajes(int numViajes) {
		this.numViajes = numViajes;
	}
}
