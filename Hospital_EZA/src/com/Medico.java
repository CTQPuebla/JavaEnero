package com;

import java.util.HashMap;

public class Medico {
	
	String idTrabajador;
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	int edad;
	String genero;
	boolean cedula;
	String profesion;
	String especialidad;
	String añosExperiencia;
	
	
	public Medico() {
		super();
	}


	public Medico(String idTrabajador, String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
			String genero, boolean cedula, String profesion, String especialidad, String añosExperiencia) {
		super();
		this.idTrabajador = idTrabajador;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.genero = genero;
		this.cedula = cedula;
		this.profesion = profesion;
		this.especialidad = especialidad;
		this.añosExperiencia = añosExperiencia;
	}


	public String getIdTrabajador() {
		return idTrabajador;
	}


	public void setIdTrabajador(String idTrabajador) {
		this.idTrabajador = idTrabajador;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidoPaterno() {
		return apellidoPaterno;
	}


	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}


	public String getApellidoMaterno() {
		return apellidoMaterno;
	}


	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public boolean isCedula() {
		return cedula;
	}


	public void setCedula(boolean cedula) {
		this.cedula = cedula;
	}


	public String getProfesion() {
		return profesion;
	}


	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public String getAñosExperiencia() {
		return añosExperiencia;
	}


	public void setAñosExperiencia(String añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}


	@Override
	public String toString() {
		return "Medico [idTrabajador=" + idTrabajador + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", edad=" + edad + ", genero=" + genero + ", cedula="
				+ cedula + ", profesion=" + profesion + ", especialidad=" + especialidad + ", añosExperiencia="
				+ añosExperiencia + "]";
	}
	

	
	
	
	
	}

