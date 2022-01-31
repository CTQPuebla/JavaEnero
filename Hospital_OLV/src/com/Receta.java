package com;

public class Receta {
	Medico medico;
	String padecimiento;
	String diagnostico;
	
	public Receta(Medico medico, String padecimiento, String diagnostico) {
		super();
		this.medico = medico;
		this.padecimiento = padecimiento;
		this.diagnostico = diagnostico;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getPadecimiento() {
		return padecimiento;
	}

	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "\nReceta \n Medico " + medico 
				+ "\nPadecimiento: " + padecimiento 
				+ "\nDiagnostico: " + diagnostico;
	}
	
	
	
	

}
