package com;

public class Peliculas {
	
	
	String nombre;
	String estudio;
	String genero;
	String año;
	
	// Metodo contructor vacio 
	
	public Peliculas() {
		
	}
	
	
	//Metodo contructor con un parametro 
	
	public  Peliculas (String nombre, String estudio, String genero,String año) {
		this.nombre =nombre;
		this.estudio = estudio;
		this.genero = genero;
		this.año = año; 
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstudio() {
		return estudio;
	}
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", estudio=" + estudio + ", genero=" + genero + ", año=" + año + "]";
	}
	
	
	
	
	

}
