package com;

public class Generica {

	 String nombre;
	 String matricula;
	 String carrera;
	 double promedio;
	public Generica(String nombre, String matricula, String carrera, double promedio) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
		this.carrera = carrera;
		this.promedio = promedio;
	}
	public Generica() {
		
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
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nMatricula: " + matricula + "\nCarrera: " + carrera + "\nPromedio: "
				+ promedio ;
	}
	
	public void insertar()
	{
		
	}
	
	
	 
	 
	
}
