package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	private String nombre;
	private List<String> ciudades;
	
	public Estado(String nombre, List<String> ciudades) {
		this.nombre = nombre;
		this.ciudades = ciudades;
	}

	public Estado(String nombre) {
		this.ciudades = new ArrayList<String>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getCiudades() {
		return ciudades;
	}

	public void setNewCiudad(String ciudad) {
		this.ciudades.add(ciudad);
	}
	
	
}
