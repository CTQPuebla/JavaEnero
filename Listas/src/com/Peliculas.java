package com;

public class Peliculas {
	
	
	String nombre;
	String estudio;
	String genero;
	String a�o;
	
	// Metodo contructor vacio 
	
	public Peliculas() {
		
	}
	
	
	//Metodo contructor con un parametro 
	
	public  Peliculas (String nombre, String estudio, String genero,String a�o) {
		this.nombre =nombre;
		this.estudio = estudio;
		this.genero = genero;
		this.a�o = a�o; 
		
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
	public String getA�o() {
		return a�o;
	}
	public void setA�o(String a�o) {
		this.a�o = a�o;
	}
	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", estudio=" + estudio + ", genero=" + genero + ", a�o=" + a�o + "]";
	}
	
	
	
	
	

}
