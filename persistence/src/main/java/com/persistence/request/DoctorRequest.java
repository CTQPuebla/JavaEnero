package com.persistence.request;

import java.util.Calendar;

//POJO
public class DoctorRequest {
	int doctorId;
	String nombre;
	String especialidad;
	String cedula;
	Calendar fechaNac;
	String sexo;
	
	public DoctorRequest() {
	}

	public DoctorRequest(int id) {
		this.doctorId = id;
	}

	public DoctorRequest(int doctorId, String nombre, String especialidad, String cedula, Calendar fechaNac,
			String sexo) {
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

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
