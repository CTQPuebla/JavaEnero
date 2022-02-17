package com.persistence.request;

import java.sql.Date;


public class DoctoresRequest {
	
	private int doctorId;	
	private String nombre;
	private String especialidad;
	private String cedula;
	private Date fechaNac;
	private String sexo;
	
	public DoctoresRequest() {
		super();
	}

	public DoctoresRequest(int doctorId, String nombre, String especialidad, String cedula, Date fechaNac,
			String sexo) {
		super();
		this.doctorId = doctorId;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.fechaNac = fechaNac;
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

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "DoctoresRequest [doctorId=" + doctorId + ", nombre=" + nombre + ", especialidad=" + especialidad
				+ ", cedula=" + cedula + ", fechaNac=" + fechaNac + ", sexo=" + sexo + "]";
	}
	
	
	
}
