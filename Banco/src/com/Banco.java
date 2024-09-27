package com;

import java.util.*;

public class Banco {
private String nombre;
private String domicilio;
private int contCuenta;


public Banco(String nombre,String domicilio) {
	super();
	this.nombre=nombre;
	this.domicilio=domicilio;
	this.contCuenta=1;
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

public Object crearCuentaDebito(Cliente c) {
	if(c.getEdad()>=18 && c.getEdad()<=65) {
		return new Cuenta(Integer.toString(contCuenta++),"0000",new Date(),true,2000.0,c,10000.0,150.0);
	}else {
		return "edad del cliente no valida";
	}
}


}
