package com;

import java.util.Date;
import java.util.HashMap;

public class Principal {       
	public static void main(String[] args) {
		Hospital h = new Hospital("IMSS","DIRECCI�N");
		
		Paciente p = new Paciente("Eduardo", "Ramirez","Colitis", 23, 57, 1.70);
		Paciente pa = new Paciente("Mar�a","Ventura","Fiebre y Tos", 21, 43, 1.54);
		Paciente pac = new Paciente("Mario","Gonzalez","Insuficiencia Card�aca", 21, 43.500,1.76);
		Paciente paci = new Paciente("Monserrat", "Garc�a", "Epilepsia", 35, 60.600, 1.67);
		
		Medico familiar = new Medico("Dr. Daniel", "Escobar", "HHGDHG2435", "34", "Med. Familiar");
		Medico gastro = new Medico("Dr. Edson", "Ner�", "JHDDY2655", "51", "Gastroenterolog�a");
		Medico neuro = new Medico("Dra. Olivia","L�pez", "LOVODG637", "5", "Neurolog�a");
		Medico cardio = new Medico("Mario", "G�mez", "CHDJUET54423", "2", "Cardiolog�a");
		
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
