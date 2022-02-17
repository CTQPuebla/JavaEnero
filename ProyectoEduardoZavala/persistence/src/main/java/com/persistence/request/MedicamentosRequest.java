package com.persistence.request;

import java.sql.Date;


public class MedicamentosRequest {

	private int medicamentoId;
	private String nombre;
	private Character patente;
	private Date fechaCad;
	private String ingredienteAct;
	private String marca;
	
	public MedicamentosRequest() {
		super();
	}

	public MedicamentosRequest(int medicamentoId, String nombre, Character patente, Date fechaCad,
			String ingredienteAct, String marca) {
		super();
		this.medicamentoId = medicamentoId;
		this.nombre = nombre;
		this.patente = patente;
		this.fechaCad = fechaCad;
		this.ingredienteAct = ingredienteAct;
		this.marca = marca;
	}

	public int getMedicamentoId() {
		return medicamentoId;
	}

	public void setMedicamentoId(int medicamentoId) {
		this.medicamentoId = medicamentoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Character getPatente() {
		return patente;
	}

	public void setPatente(Character patente) {
		this.patente = patente;
	}

	public Date getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}

	public String getIngredienteAct() {
		return ingredienteAct;
	}

	public void setIngredienteAct(String ingredienteAct) {
		this.ingredienteAct = ingredienteAct;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "MedicamentosRequest [medicamentoId=" + medicamentoId + ", nombre=" + nombre + ", patente=" + patente
				+ ", fechaCad=" + fechaCad + ", ingredienteAct=" + ingredienteAct + ", marca=" + marca + "]";
	}
	
	
	
}
