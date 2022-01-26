package com;

public class Empleado {
	private String numEmpleado,nombre,apellidoPaterno,apellidoMaterno,rfc,area;
	private double sueldo = 5000;
	private boolean activo = true;
	
	//MÈtodos constructores
	public Empleado() {
		
	}
	
	public Empleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public String getNombreCompleto() {
		return nombre +" "+apellidoPaterno+" "+apellidoMaterno;
	}

	@Override
	public String toString() {
		return "\nEmpleado #" + numEmpleado
				+ "\nNombre completo\t"+ nombre +" "+apellidoPaterno+" "+apellidoMaterno
				+ "\nRFC\t\t" + rfc
				+ "\nSueldo\t\t$" + sueldo
				+ "\n¡rea\t\t" + area
				+ "\nActivo\t\t"	+ activo;
	}	
	
}
