package com.persistence.entity;

import java.io.Serializable;

import java.sql.Date;

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
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@diagnosticoId" , scope =Diagnostico.class)
public class Diagnostico implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Diagnostico() {
		
	}
	
	public Diagnostico(int id) {
		this.diagnosticoId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="did_auto")
	@SequenceGenerator(name="did_auto", sequenceName="DIAG_SEQ", allocationSize=1)
	@Column(name="DIAGNOSTICO_ID", columnDefinition="NUMBER")
	private int diagnosticoId;
	
	@ManyToOne
	@JoinColumn(name="DOCTOR_ID",columnDefinition="NUMBER")
	private Doctores doctor;

	@ManyToOne
	@JoinColumn(name="PACIENTE_ID",columnDefinition="NUMBER")
	private Pacientes paciente;

	@Column(name="FECHA",columnDefinition="DATE")
	private Date fecha;

	@Column(name="DETALLE",columnDefinition="NVARCHAR2(100)")
	private String detalle;

	public Diagnostico(int diagnosticoId, Doctores doctor, Pacientes paciente, Date fecha, String detalle) {
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
		return "Diagnostico [diagnosticoId=" + diagnosticoId + ", doctor=" + doctor + ", paciente=" + paciente
				+ ", fecha=" + fecha + ", detalle=" + detalle + "]";
	}
	
	
	
}
