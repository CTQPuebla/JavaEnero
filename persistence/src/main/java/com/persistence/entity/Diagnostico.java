package com.persistence.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="DIAGNOSTICO")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property = "@diagnosticoid",scope = Diagnostico.class)
public class Diagnostico implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="daid_auto")
	@SequenceGenerator(name="daid_auto", sequenceName="DIAG_SEQ",allocationSize=1)
	@Column(name="DIAGNOSTICO_ID", columnDefinition="NUMBER")
	int diagnosticoId;
	
	// Relación a doctor
	@ManyToOne
	@JoinColumn(name = "DOCTOR_ID", columnDefinition = "NUMBER")
	Doctor doc;

	// Relación a paciente
	@ManyToOne
	@JoinColumn(name = "PACIENTE_ID", columnDefinition = "NUMBER")
	Paciente pac;
	
	@Column(name="FECHA", columnDefinition="DATE")
	Calendar fecha;
	
	@Column(name="DETALLE", columnDefinition="NVARCHAR2(100)")
	String detalle;

	public Diagnostico() {
	}

	public Diagnostico(int diagnosticoId) {
		this.diagnosticoId = diagnosticoId;
	}

	public Diagnostico(int diagnosticoId, Doctor doc, Paciente pac, Calendar fecha, String detalle) {
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
