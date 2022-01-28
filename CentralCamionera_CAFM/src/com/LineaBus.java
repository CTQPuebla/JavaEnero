package com;

import java.util.*;

public class LineaBus {
	String nombre;
	List<Autobus> autobuses;
	
	public LineaBus(String nombre, List<Autobus> autobuses) {
		super();
		this.nombre = nombre;
		this.autobuses = autobuses;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Autobus> getAutobuses() {
		return autobuses;
	}

	public void setAutobuses(List<Autobus> autobuses) {
		this.autobuses = autobuses;
	}

	@Override
	public String toString() {
		return "Linea Bus [nombre=" + nombre + ", autobuses=" + autobuses + "]";
	}
	
}
