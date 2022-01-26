package com;

public class Zapatos {
	private int id;
private String color;
private String nombre;
private double precio;
private double talla;
private int cantidadExistente;


public Zapatos(int id, String color, double precio, double talla, int cantidadExistente, String nombre) {
	super();
	this.id = id;
	this.color = color;
	this.nombre=nombre;
	this.precio = precio;
	this.talla = talla;
	this.cantidadExistente = cantidadExistente;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getTalla() {
	return talla;
}
public void setTalla(double talla) {
	this.talla = talla;
}
public int getCantidadExistente() {
	return cantidadExistente;
}
public void setCantidadExistente(int cantidadExistente) {
	this.cantidadExistente = cantidadExistente;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return "Zapatos [id=" + id + ", color=" + color + ", precio=" + precio + ", talla=" + talla + ", cantidadExistente="
			+ cantidadExistente + "]";
}



}
