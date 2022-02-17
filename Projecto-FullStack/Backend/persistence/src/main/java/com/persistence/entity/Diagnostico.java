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



@Entity
@Table(name = "DIAGNOSTICO")
public class Diagnostico implements Serializable{
	
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="DIAGNOSTICO_ID", columnDefinition="NUMBER")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="did_auto")
	@SequenceGenerator(name="did_auto", sequenceName="DIAG_SEQ", allocationSize=1)
	int diagnosticoId;
	@ManyToOne
	@JoinColumn(name="DOCTOR_ID", columnDefinition="NUMBER")
	Doctores doctor;
	
	@ManyToOne	
	@JoinColumn(name="PACIENTE_ID", columnDefinition="NUMBER")
	Paciente paciente;
	@Column(name="FECHA", columnDefinition="DATE")
	Date fecha;
	@Column(name="DETALLE", columnDefinition="NVARCHAR2(100)")
	String detalle;
	
	
	public Diagnostico() {}


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


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Diagnostico [diagnosticoId=" + diagnosticoId + ", doctor=" + doctor + ", paciente=" + paciente
				+ ", fecha=" + fecha + ", detalle=" + detalle + "]";
	}
	
	
}
