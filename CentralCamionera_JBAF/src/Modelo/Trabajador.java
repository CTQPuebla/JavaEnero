package Modelo;

import java.util.Date;

public class Trabajador extends Persona {
	private int numeroEmpleado;
	private String puesto;
	
	public Trabajador(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
			Direccion direccion, Contacto contacto, int numeroEmpleado, String puesto) {
		super(nombre, primerApellido, segundoApellido, fechaNacimiento, direccion, contacto);
		this.numeroEmpleado = numeroEmpleado;
		this.puesto = puesto;
	}
	
	public Trabajador(String nombre, String primerApellido, Date fechaNacimiento,
			Direccion direccion, Contacto contacto, int numeroEmpleado, String puesto) {
		super(nombre, primerApellido, fechaNacimiento, direccion, contacto);
		this.numeroEmpleado = numeroEmpleado;
		this.puesto = puesto;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
}
