package com;

public class Alumno {
	String nombre;
	String matricula;
	int edad,grado;
	String grupo;
	String turno;
	
	//Metodo constructor vacio
	public Alumno(){
		
	}
	
	//Constructor con un parámetro
	public Alumno(String nombre,String matricula,int edad,int grado,String grupo,String turno) {
		this.nombre=nombre;
		this.matricula=matricula;
		this.edad=edad;
		this.grado=grado;
		this.grupo=grupo;
		this.turno=turno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", matricula=" + matricula + ", edad=" + edad + ", grado=" + grado
				+ ", grupo=" + grupo + ", turno=" + turno + "]";
	}
	
	
}
