package com;

import java.util.Date;
import java.util.HashMap;

public class Principal {       
	public static void main(String[] args) {
		Hospital h = new Hospital("IMSS","DIRECCIÓN");
		
		Paciente p = new Paciente("Eduardo", "Ramirez","Colitis", 23, 57, 1.70);
		Paciente pa = new Paciente("María","Ventura","Fiebre y Tos", 21, 43, 1.54);
		Paciente pac = new Paciente("Mario","Gonzalez","Insuficiencia Cardíaca", 21, 43.500,1.76);
		Paciente paci = new Paciente("Monserrat", "García", "Epilepsia", 35, 60.600, 1.67);
		
		Medico familiar = new Medico("Dr. Daniel", "Escobar", "HHGDHG2435", "34", "Med. Familiar");
		Medico gastro = new Medico("Dr. Edson", "Nerí", "JHDDY2655", "51", "Gastroenterología");
		Medico neuro = new Medico("Dra. Olivia","López", "LOVODG637", "5", "Neurología");
		Medico cardio = new Medico("Mario", "Gómez", "CHDJUET54423", "2", "Cardiología");
		
		//Aqui se agregan los medicos al HashMap de medicos del Hospital
//		h.AgregarMedico(familiar);
//		h.AgregarMedico(gastro);
//		h.AgregarMedico(neuro);
//		h.AgregarMedico(cardio);
		
		//Aqui se crean las citas y se guaradan dentro de un HashMap
//		h.CrearCita(p);
//		h.CrearCita(pa);
//		h.CrearCita(pac);
//		
//		System.out.println(h);
		
		h.Consulta(pa);
		

		
		
		
		
		
		
		
		
	}

}
