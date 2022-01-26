package com;

import java.util.ArrayList;
import java.util.List;

public class PlanEstudios {
	private String nombre, tipo, rvoe;
	private int anio, numAsignaturas;
	private double credito;
	private boolean activo;
	private List<Asignatura> asignaturas;
	
	public PlanEstudios(String nombre, String tipo, String rvoe, int anio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.rvoe = rvoe;
		this.anio = anio;
		this.numAsignaturas = 0;
		this.credito = 0.0;
		this.activo = true;
		this.asignaturas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRvoe() {
		return rvoe;
	}

	public void setRvoe(String rvoe) {
		this.rvoe = rvoe;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	
	public int getNumAsignaturas() {
		return numAsignaturas;
	}

	public void setNumAsignaturas(int numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}

	@Override
	public String toString() {
		return "PlanEstudios [nombre=" + nombre + ", tipo=" + tipo + ", rvoe=" + rvoe + ", anio=" + anio
				+ ", numAsignaturas=" + numAsignaturas + ", credito=" + credito + ", activo=" + activo
				+ ", asignaturas=" + asignaturas + "]";
	}

	public void agregarAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
		this.setCredito(this.getCredito()+asignatura.getCreditos());
		this.setNumAsignaturas(this.getAsignaturas().size());
	}
	
}
