package evaluacion;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
	private String nombre, direccion, nacionalidad;
	private List<Expediente> expedientes = new ArrayList<Expediente>();
	private int edad;
	final private int ID;
	public static int lastId = 0;
	
	public Paciente(String nombre, String direccion, String nacionalidad, int edad) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.ID = lastId + (int)Math.floor(Math.random()*10);
		lastId += this.ID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public List<Expediente> getExpedientes() {
		return expedientes;
	}
	public void createExpediente(Medico medicoAsignado, String antecedentes, String diagnostico, String areaActual, int cama) {
		Expediente expediente = new Expediente(this, antecedentes, medicoAsignado, diagnostico, areaActual, cama);
		addExpediente(expediente);
	}
	public void addExpediente(Expediente expediente) {
		expedientes.add(expediente);
	}
	public int getID() {
		return new Integer(ID);
	}
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", direccion=" + direccion + ", nacionalidad=" + nacionalidad
				+ ", expedientes=" + expedientes + ", edad=" + edad + ", ID=" + ID + "]";
	}
}
