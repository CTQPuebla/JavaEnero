package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Paciente  {
	
	
	int id;
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	int edad;
	String genero;
	Scanner sc;
	ArrayList <Object> pacientes;
	
	

	public Paciente() {
		super();
	}
	


	public Paciente(int id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
			String genero) {
		super();
		this.id =id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.genero = genero;
		sc=new Scanner(System.in);
		pacientes=new ArrayList <Object>();
	}
	
	
	
	
	
	public int isId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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
	
	
	

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", edad=" + edad + ", genero=" + genero + "]";
	}




	
	
	
}
