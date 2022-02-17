package com.persistence.request;

import java.sql.Date;

import com.persistence.entity.Doctores;
import com.persistence.entity.Pacientes;

public class DiagnosticoRequest {
	
	private int diagnosticoId;
	private Doctores doctor;
	private Pacientes paciente;
	private Date fecha;
	private String detalle;
	
	public DiagnosticoRequest() {
		super();
	}

	public DiagnosticoRequest(int diagnosticoId, Doctores doctor, Pacientes paciente, Date fecha, String detalle) {
		super();
		this.diagnosticoId = diagnosticoId;
		this.doctor = doctor;
		this.paciente = paciente;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public int getDiagnosticoId() {
		return diagnosticoId;
	}

	public void setDiagnosticoId(int diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}

	public Doctores getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctores doctor) {
		this.doctor = doctor;
	}

	public Pacientes getPaciente() {
		return paciente;
	}

	public void setPaciente(Pacientes paciente) {
		this.paciente = paciente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "DiagnosticoRequest [diagnosticoId=" + diagnosticoId + ", doctor=" + doctor + ", paciente=" + paciente
				+ ", fecha=" + fecha + ", detalle=" + detalle + "]";
	}
	
	
	
	
}
