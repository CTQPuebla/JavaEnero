package com.persistence.request;

import java.sql.Date;


public class DoctorRequest {
	
	int doctorId;
	
	String nombre;
	
	String especialidad;
	
	String cedula;
	
	Date fechaNacimiento;
	
	String sexo;
	
	public DoctorRequest() {}

	public DoctorRequest(int doctorId, String nombre, String especialidad, String cedula, Date fechaNacimiento,
			String sexo) {
		super();
		this.doctorId = doctorId;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
	}

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

	@Override
	public String toString() {
		return "DoctorRequest [doctorId=" + doctorId + ", nombre=" + nombre + ", especialidad=" + especialidad
				+ ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + "]";
	}

	
	
}
