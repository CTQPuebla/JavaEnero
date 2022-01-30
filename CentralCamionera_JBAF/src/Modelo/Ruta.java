package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
	private String nombre;
	private String origen;
	private String destino;
	private List<String> escalas;
	
	public Ruta(String nombre, String origen, String destino, List<String> escalas) {
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.escalas = escalas;
	}
	
	public Ruta(String nombre, String origen, String destino) {
		this.nombre = nombre;
		this.origen = origen;
		this.destino = destino;
		this.escalas = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<String> getEscalas() {
		return escalas;
	}

	public void setNewEscala(String escala) {
		this.escalas.add(escala);
	}
}
