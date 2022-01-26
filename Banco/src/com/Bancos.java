package com;

import java.util.Date;

public class Bancos {

	private String nombre;
	private String domicilio;

	private int cont;
	


	public Bancos(String nombre, String domicilio, int cont) {
		super();
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.cont = 0;
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

	@Override
	public String toString() {
		return "Bancos [nombre=" + nombre + ", domicilio=" + domicilio + "]";
	}
	
	
	public Object crearcuentadebito (Cliente c) 
	{
		if(c.getEdad() >= 18 && c.getEdad() <= 65)
		{
			return new Cuenta(Integer.toString(cont++), "0000", new Date(), true, 2000.00, c , 10000.00, 150.00);
		}
		else {
			return "";
		}
	}
	
	
}
