package com;

import java.util.Date;

public class Expediente extends Hospital {
	
	@Override
	public String consultar(String fecha, Doctor dr, Paciente pac, String diagnostico) {
		// TODO Auto-generated method stub
		return "\nCONSULTA\nFecha:" + fecha+"\nDoctor: "+dr+"\nPaciente:"+pac+"\nDiagnostico:"+diagnostico;
	}
	
	@Override
	public String recetar(String fecha, Doctor dr, Paciente pac, String medicamentos) {
		// TODO Auto-generated method stub
		return "\nRECETA\nFecha:" +fecha+"\nDoctor: "+dr+"\nPaciente:"+pac+"\nMedicamentos"+medicamentos;
	}

	@Override
	public String ordenarOperacion(int numOrden, Doctor dr, Paciente pac, String fecha, String hora, String padecimiento) {
		// TODO Auto-generated method stub
		return "\nORDEN\n Doctor: "+dr+"\nOrden de operacion para el paciente "+pac+" por motivo de "+padecimiento+" el dia "+fecha+" a las "+hora+" horas.";
	}
	
	@Override
	public String operar(Doctor dr, Paciente pac, int numOrden) {
		// TODO Auto-generated method stub
		return "\nOPERACION\nOrden de operacion numero: "+numOrden+"\n\n";
	}

}
