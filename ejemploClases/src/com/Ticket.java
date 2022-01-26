package com;

import java.util.Date;

public class Ticket {

	Date fechaventa;
	int cantidadDeProducto =0;
	double totalPagar = 0;
	Producto p;
	
	public Ticket(Date fechaventa, int cantidadDeProducto, double totalPagar, Producto p) {
		super();
		this.fechaventa = fechaventa;
		this.cantidadDeProducto = cantidadDeProducto;
		this.totalPagar = totalPagar;
		this.p = p;
	}

	public Date getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}

	public int getCantidadDeProducto() {
		return cantidadDeProducto;
	}

	public void setCantidadDeProducto(int cantidadDeProducto) {
		this.cantidadDeProducto = cantidadDeProducto;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Ticket [fechaventa=" + fechaventa + ", cantidadDeProducto=" + cantidadDeProducto + ", totalPagar="
				+ totalPagar + ", p=" + p + "]";
	}
	
	
	
	
}
