package evaluacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hospital {
	private String nombre, direccion;
	private List<String> especialidades = new ArrayList<String>();;
	private HashMap<Integer, Medico> medicos = new HashMap<>();
	private HashMap<Integer, Paciente> pacientes = new HashMap<>();
	final private int ID;
	public static int lastId = 0;
	public Hospital(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
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
	public String getEspecialidades() {
		return especialidades.toString();
	}
	public void addEspecialidades(String especialidad) {
		especialidades.add(especialidad);
	}
	public HashMap<Integer, Medico> getMedicos() {
		return medicos;
	}
	public void addMedico(Medico medico) {
		this.medicos.put(medico.getID(), medico);
	}
	public HashMap<Integer, Paciente> getPacientes() {
		return pacientes;
	}
	public void addPaciente(Paciente paciente) {
		this.pacientes.put(paciente.getID(), paciente);
	}
	public int getID() {
		return ID;
	}
	@Override
	public String toString() {
		return "Hospital [\n ID=" + ID + ",\n nombre=" + nombre + ",\n direccion=" + direccion + ",\n especialidades=" + especialidades
				+ ",\n medicos=" + medicos + ",\n pacientes=" + pacientes + "\n ]";
	}
	
}
