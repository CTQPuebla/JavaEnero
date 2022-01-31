package com;

import java.util.Date;

public class Cita {
	Date fecha;
	int folio;
	Paciente paciente;
	
	
	public Cita(Date fecha, int folio, Paciente paciente) {
		super();
		this.fecha = fecha;
		this.folio = folio;
		this.paciente = paciente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		return "\nFecha: " + fecha 
				+ "\nFolio: " + folio 
				+ "\nPaciente " + paciente;
	}
	
	
	
	
	

}
