package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Linea {
	private String nombre;
	private List<Autobus> autobuses;
	private List<Ruta> rutas;
	
	public Linea(String nombre, List<Autobus> autobuses, List<Ruta> rutas) {
		this.nombre = nombre;
		this.autobuses = autobuses;
		this.rutas = rutas;
	}
	
	public Linea(String nombre) {
		this.nombre = nombre;
		this.autobuses = new ArrayList<Autobus>();
		this.rutas = new ArrayList<Ruta>();
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

	public void setNewAutobuses(Autobus autobus) {
		this.autobuses.add(autobus);
	}

	public List<Ruta> getRutas() {
		return rutas;
	}

	public void setNewRuta(Ruta ruta) {
		this.rutas.add(ruta);
	}
}
