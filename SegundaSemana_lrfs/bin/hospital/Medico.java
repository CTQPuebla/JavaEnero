package evaluacion;

import java.util.HashMap;

public class Medico extends TrabajadorDeHospital {
	private  String especialidad;
    private HashMap<Integer, Paciente> pacientesAsignados = new HashMap<>();
	final private int ID;
	public Medico(String nombre, int edad, String domicilio, String especialidad) {
		super(nombre, edad, domicilio);
		super.setPuestoDeTrabajo("Medico");
		this.especialidad = especialidad;
		this.ID = super.getNumeroEmpleado();
	}
	public String getNombre() {
		return super.getNombre();
	}
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public void addPacienteAsignado(Paciente paciente) {
		pacientesAsignados.put(paciente.getID(), paciente);
	}
	public int getID() {
		return new Integer(ID);
	}
	public void showResponsabilities() {
		System.out.println("Siempre intentar mejorar el estado de salud general del paciente");
	}
	@Override
	public String toString() {
		return "Medico [nombre=" + super.getNombre() + ", especialidad=" + especialidad + ", pacientesAsignados=" + pacientesAsignados + ", ID=" + ID
				+ "]";
	}
}
