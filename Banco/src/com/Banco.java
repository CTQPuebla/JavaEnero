package com;

import java.util.Date;

public class Banco {
	private String nombre;
	private String domicilio;
	
	private int contCuenta=0;
	
	
	
	

	public Banco(String nombre, String domicilio) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public int getContCuenta() {
		return contCuenta;
	}

	public void setContCuenta(int contCuenta) {
		this.contCuenta = contCuenta;
	}

	@Override
	public String toString() {
		return "Banco [nombre=" + nombre + ", domicilio=" + domicilio + ", contCuenta=" + contCuenta + "]";
	}
	
	
	//Comportamiento propio
	public Object crearCuentaDeDebito(Cliente c) {
		if(c.getEdad()>=18 && c.getEdad()<=65) {
			return new Cuenta(Integer.toString(contCuenta++),"0000",new Date(),true,2000.00,c,10000.00,150.00);					
		}else {
			return "Edad del cliente no valida";
		}
	}

}
