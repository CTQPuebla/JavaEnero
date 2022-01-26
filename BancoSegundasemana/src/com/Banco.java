package com;

public class Banco {
	
	private String nombre;
	private String domicilio;
	
	public Banco(String nombre,String domicilio) {
		super();
		this.nombre=nombre;
		this.domicilio= domicilio;
		
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
		return "Banco [nombre=" + nombre + ", domicilio=" + domicilio + "]";
	}

	public Object crearCuentaDebito (Cliente c) {
		
//	public Object crearCuentaDebito (Cliente c ) {
//		if (c.getEdad()>=18 && c.getEdad()<=65) {
//			return new Cuenta ;
//	
	
		}	
	}
}
