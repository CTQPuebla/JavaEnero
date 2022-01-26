package com;

import java.util.Date;
import java.util.Scanner;

public class Ropa {
	private String idropa;
	private String tipo;
	private String color;
	private int talla;
	private int cantidad;
	private double precio;
	
	public Ropa(String idropa, String tipo, String color, int talla, int cantidad, double precio) {
		super();
		this.idropa=idropa;
		this.tipo = tipo;
		this.color = color;
		this.talla = talla;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public String getIdropa() {
		return idropa;
	}

	public void setIdropa(String idropa) {
		this.idropa = idropa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ropa [id ropa=" + idropa + ", tipo=" + tipo + ", color=" + color + ", talla=" + talla + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	Scanner sc=null;
	//Alta de producto nuevo, agregar producto a uno existente
	public Object alta(Ropa r) {
		System.out.println("ID:");
		sc=new Scanner(System.in);
		String idn=sc.nextLine();
		if(r.getIdropa().equals(idn)) {
			return "El producto ya existe";
		}else {
			r.setIdropa(idn);
			System.out.println("Tipo:");
			sc=new Scanner(System.in);
			String tip=sc.nextLine();
			r.setTipo(tip);
			System.out.println("Color:");
			sc=new Scanner(System.in);
			String col=sc.nextLine();
			r.setColor(col);
			System.out.println("Talla:");
			sc=new Scanner(System.in);
			int tal=sc.nextInt();
			r.setTalla(tal);
			System.out.println("Cantidad:");
			sc=new Scanner(System.in);
			int cant=sc.nextInt();
			r.setCantidad(cant);
			System.out.println("Precio:");
			sc=new Scanner(System.in);
			double prec=sc.nextDouble();
			r.setPrecio(prec);
		}
		return null;
	}
	
	
}
