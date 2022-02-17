package com.persistence.request;

import java.util.Calendar;

import com.persistence.entity.Doctor;
import com.persistence.entity.Paciente;

//POJO
public class DiagnosticoRequest {
	int diagnosticoId;
	Doctor doc;
	Paciente pac;
	Calendar fecha;
	String detalle;
	
	public DiagnosticoRequest() {
	}

	public DiagnosticoRequest(int id) {
		this.diagnosticoId = id;
	}

	public DiagnosticoRequest(int diagnosticoId, Doctor doc, Paciente pac, Calendar fecha, String detalle) {
		this.diagnosticoId = diagnosticoId;
		this.doc = doc;
		this.pac = pac;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public int getDiagnosticoId() {
		return diagnosticoId;
	}

	public void setDiagnosticoId(int diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}

	public Doctor getDoc() {
		return doc;
	}

	public void setDoc(Doctor doc) {
		this.doc = doc;
	}

	public Paciente getPac() {
		return pac;
	}

	public void setPac(Paciente pac) {
		this.pac = pac;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
}
