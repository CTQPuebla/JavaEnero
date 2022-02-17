package com.persistence.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DOCTORES")
public class Doctores implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="DOCTOR_ID", columnDefinition="NUMBER")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="did_auto")
	@SequenceGenerator(name="did_auto", sequenceName="DOC_SEQ", allocationSize=1)
	int doctorId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	String nombre;
	@Column(name="ESPECIALIDAD", columnDefinition="NVARCHAR2(15)")
	String especialidad;
	@Column(name="CEDULA", columnDefinition="NVARCHAR2(15)")
	String cedula;
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	Date fechaNacimiento;
	@Column(name="SEXO", columnDefinition="NVARCHAR2(1)")
	String sexo;
	
	public Doctores() {}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cedula="
				+ cedula + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + "]";
	}

	
	
}
