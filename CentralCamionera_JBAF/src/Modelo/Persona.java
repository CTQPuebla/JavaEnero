package Modelo;

import java.util.Date;

public class Persona {
	protected String nombre;
	protected String primerApellido;
	protected String segundoApellido;
	protected Date fechaNacimiento;
	protected Direccion direccion;
	protected Contacto contacto;
	
	public Persona(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
			Direccion direccion, Contacto contacto) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.contacto = contacto;
	}

	public Persona(String nombre, String primerApellido, Date fechaNacimiento, Direccion direccion, Contacto contacto) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.contacto = contacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
}
