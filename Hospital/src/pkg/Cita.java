package pkg;

import java.util.Date;

public class Cita extends Carnet{
	
	private Date fechaCita;
	private int numCita, numConsultorio;
	private Carnet carnet;
	public static int ultimaCita = 0;
	
	public Cita(String nombrePaciente, String numCarnet, String direccionPaciente, String telefonoPaciente,
			String contactoEmergencia, Date fechaCita, int numCita, int numConsultorio, Carnet carnet) {
		super(nombrePaciente, numCarnet, direccionPaciente, telefonoPaciente, contactoEmergencia);
		this.fechaCita = fechaCita;
		this.numCita = ultimaCita++;
		this.numConsultorio = numConsultorio;
		this.carnet = carnet;
	}
	public Date getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}
	public int getNumCita() {
		return numCita;
	}
	public void setNumCita(int numCita) {
		this.numCita = numCita;
	}
	public int getNumConsultorio() {
		return numConsultorio;
	}
	public void setNumConsultorio(int numConsultorio) {
		this.numConsultorio = numConsultorio;
	}
	public Carnet getCarnet() {
		return carnet;
	}
	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}
	@Override
	public String toString() {
		return "Cita \n[fechaCita=" + fechaCita + ", numCita=" + ++numCita + ",\n numConsultorio=" + numConsultorio
				 + ",\n nombrePaciente=" + nombrePaciente + ", numCarnet=" + numCarnet
				+ ",\n telefonoPaciente=" + telefonoPaciente + "]";
	}
	
	
	
	
}