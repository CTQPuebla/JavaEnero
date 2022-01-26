package com;

public class Producto {
	
	String fechaCaducidad = "";
	double capacidad = 0;
	String nombreProducto = "";
	double precio = 0;
	int inventario = 0;
	
	
	
	public Producto(String fechaCaducidad, double capacidad, String nombreProducto, double precio, int inventario) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.capacidad = capacidad;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.inventario = inventario;
	}


	public String getFechaCaducidad() {
		return fechaCaducidad;
	}


	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	public double getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getInventario() {
		return inventario;
	}


	public void setInventario(int inventario) {
		this.inventario = inventario;
	}


	@Override
	public String toString() {
		return "Producto [fechaCaducidad=" + fechaCaducidad + ", capacidad=" + capacidad + ", nombreProducto="
				+ nombreProducto + ", precio=" + precio + ", inventario=" + inventario + "]";
	}
	
	
	
	
	
	

}
