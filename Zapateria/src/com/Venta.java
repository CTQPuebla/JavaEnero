package com;

public class Venta {

	private static int cantidadDeProducto;
	private static  Zapatos zapato;
	private static double totalDeProductos;
	private static int totalFinal;


	public Venta(int cantidadDeProducto, Zapatos zapato) {
		super();
		this.cantidadDeProducto = cantidadDeProducto;
		this.zapato = zapato;
	}
	
	
	public int getCantidadDeProducto() {
		return cantidadDeProducto;
	}
	public void setCantidadDeProducto(int cantidadDeProducto) {
		this.cantidadDeProducto = cantidadDeProducto;
	}

	public double getTotalDeProductos() {
		return totalDeProductos;
	}
	public void setTotalDeProductos(double totalDeProductos) {
		this.totalDeProductos = totalDeProductos;
	}
	public int getTotalFinal() {
		return totalFinal;
	}
	public void setTotalFinal(int totalFinal) {
		this.totalFinal = totalFinal;
	}
	@Override
	public String toString() {
		return "Venta [cantidadDeProducto=" + cantidadDeProducto + ", zapato=" + zapato + ", totalDeProductos="
				+ totalDeProductos + ", totalFinal=" + totalFinal + "]";
	}
	
	public Object insertar(Zapatos  id, int cantidadIngresar) {
		int can=id.getCantidadExistente()+cantidadIngresar;
		id.setCantidadExistente(can);
		return "se a agregado mas productos";		
	}
	
	public static void vender() {
		totalDeProductos=(cantidadDeProducto)*(zapato.getPrecio());
		System.out.println("total a pagar por un producto"+ totalDeProductos);
	}
}
