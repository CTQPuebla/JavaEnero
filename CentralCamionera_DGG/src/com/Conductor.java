package com;

public class Conductor extends Persona{
	
	String licencia;
	String numEmpleado;
	int numCel;
	public Conductor(String nombre, String licencia, String numEmpleado, int numCel) {
		super(nombre);
		this.licencia = licencia;
		this.numEmpleado = numEmpleado;
		this.numCel = numCel;
	}
	public String getLicencia() {
		return licencia;
	}
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}
	public String getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public int getNumCel() {
		return numCel;
	}
	public void setNumCel(int numCel) {
		this.numCel = numCel;
	}
	@Override
	public String toString() {
		return "Conductor [licencia=" + licencia + ", numEmpleado=" + numEmpleado + ", numCel=" + numCel + ", nombre="
				+ nombre + "]";
	}
	
	
}
