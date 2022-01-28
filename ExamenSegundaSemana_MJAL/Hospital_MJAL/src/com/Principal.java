package com;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		
		Doctor doc=new Doctor("Juan Reyes Hernandez", "Medico General", "321456");
		Doctor doc2=new Doctor("Laura Lopez Jimenez", "Ginecologa", "789654");
		
		Paciente paciente=new Paciente("Miguel Angeles Serrano", 54, 1.60, 60, "masculino");
		Paciente paciente2=new Paciente("Rosario Lopez Vazquez", 48, 1.52, 62, "femenino");
		Paciente paciente3=new Paciente("Soledad Perez Juarez", 19, 1.73, 69, "femenino");
		
		Expediente ex1=new Expediente();
		ex1.setNombre("Hospital IMSS");
		ex1.setDireccion("139 poniente #13906 Colonia San Juan\n\n");
		
		System.out.println(ex1.getNombre());
		System.out.println(ex1.getDireccion());
		
		System.out.println(ex1.consultar("25 de enero de 2022",doc, paciente, "El paciente presenta fibre de 37.5° C y dolor de garganta a causa de amigdalitis infecciosa"));
		System.out.println(ex1.recetar("25 de enero de 2022",doc, paciente, "--Ampicilina 500 mg. 1 tab c/12 horas por 4 dias \n--Paracetamol 400 mg. 1 tab c/8 horas mientras persista la fiebre"));
		
		Expediente ex2=new Expediente();
		ex1.setNombre("Hospital IMSS");
		ex1.setDireccion("139 poniente #13906 Colonia San Juan\n\n");
		
		System.out.println(ex2.consultar("27 de enero de 2022",doc2, paciente2, "La paciente muestra ultrasonido pelvico en el cual se nota ovario poliquistico"));
		System.out.println(ex2.ordenarOperacion(1452, doc2, paciente2, "2 de febrero de 2022", "09:30", "Ovario poliquistico"));
		
		Expediente ex3=new Expediente();
		ex3.setNombre("Hospital IMSS");
		ex3.setDireccion("139 poniente #13906 Colonia San Juan\n\n");
		System.out.println(ex3.operar(doc, paciente3, 5678));
		
		
		HashMap<String, String> hs=new HashMap<String, String>();
		
		hs.put(paciente.getNombre(), "Consulta, Receta");
		hs.put(paciente2.getNombre(), "Consulta, Orden de Operacion");
		hs.put(paciente3.getNombre(), "Operacion");
		
		System.out.println("HASHMAP\n"+hs.toString());
	}
}
