package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Central {
	private String nombre;
	private List<Linea> lineas;
	private Direccion direccion;
	
	public Central(String nombre, List<Linea> lineas, Direccion direccion) {
		this.nombre = nombre;
		this.lineas = lineas;
		this.direccion = direccion;
	}
	
	public Central(String nombre, Direccion direccion) {
		this.nombre = nombre;
		this.lineas = new ArrayList<Linea>();
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Linea> getLineas() {
		return lineas;
	}

	public void setNewLinea(Linea linea) {
		this.lineas.add(linea);
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
