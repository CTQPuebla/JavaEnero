package com;

public class Perro {

	String nombre;
	int edad;
	double altura;
	String raza;
	String color;
	
	public Perro(String nombre, int edad,double altura,String raza,String color) {
		this.nombre=nombre;
		this.edad=edad;
		this.altura=altura;
		this.raza=raza;
		this.color=color;
	}
	public Perro() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", raza=" + raza + ", color=" + color
				+ "]";
	}
	
	
	
}
