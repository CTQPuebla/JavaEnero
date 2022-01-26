package com;

public class CapturaVenta {
	
	int cantidadProducto = 0;
	String nombreDelProducto = "";
	int totalProducto= 0;
	double totalVenta = 0;
	public CapturaVenta(int cantidadProducto, String nombreDelProducto, int totalProducto, double totalVenta) {
		super();
		this.cantidadProducto = cantidadProducto;
		this.nombreDelProducto = nombreDelProducto;
		this.totalProducto = totalProducto;
		this.totalVenta = totalVenta;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getNombreDelProducto() {
		return nombreDelProducto;
	}
	public void setNombreDelProducto(String nombreDelProducto) {
		this.nombreDelProducto = nombreDelProducto;
	}
	public int getTotalProducto() {
		return totalProducto;
	}
	public void setTotalProducto(int totalProducto) {
		this.totalProducto = totalProducto;
	}
	public double getTotalVenta() {
		return totalVenta;
	}
	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}
	@Override
	public String toString() {
		return "capturaVenta [cantidadProducto=" + cantidadProducto + ", nombreDelProducto=" + nombreDelProducto
				+ ", totalProducto=" + totalProducto + ", totalVenta=" + totalVenta + "]";
	}
	
	

}
