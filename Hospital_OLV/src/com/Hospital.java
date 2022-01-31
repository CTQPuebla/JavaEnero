package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Hospital implements Acciones{
	Scanner sc = new Scanner(System.in);
	String nombre;
	String direccion;
	int folio= 1;
	Paciente paciente;
	
	HashMap<String, Cita> hp = new HashMap<String,Cita>();
	HashMap<String, Medico> med = new HashMap<String,Medico>();
	HashMap<Object, Receta> re = new HashMap<Object, Receta>();
	public Hospital() {
		
	}

	public Hospital(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
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
	
	public HashMap<String, Cita> getHp() {
		return hp;
	}

	public void setHp(HashMap<String, Cita> hp) {
		this.hp = hp;
	}
	

	public HashMap<String, Medico> getMed() {
		return med;
	}

	public void setMed(HashMap<String, Medico> med) {
		this.med = med;
	}
	

	public HashMap<Object, Receta> getRe() {
		return re;
	}

	public void setRe(HashMap<Object, Receta> re) {
		this.re = re;
	}

	@Override
	public String toString() {
		return "\nNombre: " + nombre 
				+"\nDirecci�n: " + direccion 
				+ "\nHash: " + hp
				+"\nHashMap de Medicos: " + med
				+"\nHashMap de Recetas: "+ re;
		
	}

	@Override
	public Object CrearCita(Paciente paciente) {
			Cita cita = new Cita(new Date(), folio++, paciente);
			hp.put(paciente.getNombre(), cita);
			return hp.values();
	}
	public Object AgregarMedico(Medico medico) {
		med.put(medico.getNumConsultorio(), medico);
		return med.values();
	}
	
	public Object Consulta(Paciente paciente) {
		int i;
		do {
			System.out.println("\n1. Gastroenterologo"
					            + "\n2.Neurologo"
					            + "\n3.Cardiologo"
					            +"\n4.Med. Familiar\n"
					            +"Elige una Opci�n: ");
			i = sc.nextInt();
		switch(i) {
		case 1:
			if(paciente.getSintomas().equals("Hepatitis")|| paciente.getSintomas().equals("Colitis")
					|| paciente.getSintomas().equals("�lcera P�ptica")) {
				Medico gastro = new Medico("Dr.Edson", "Ner�", "JHDDY2655", "51", "Gastroenterolog�a");
				System.out.println("Le atendio: "+gastro.toString());
				switch(paciente.getSintomas()) {
				case "Hepatitis":
					Receta receta = new Receta(gastro, paciente.getSintomas(), "Analisis de Sangre");
					System.out.println(receta);
					re.put(paciente.getNombre(), receta);
					break;
				case "Colitis":
					Receta receta1 = new Receta(gastro, paciente.getSintomas(), "Se necesita una endoscopia con biopsia");
					System.out.println(receta1);
					re.put(paciente.getNombre(), receta1);
					break;
				case "�lcera P�ptica": 
					Receta receta2 = new Receta(gastro, paciente.getSintomas(), "Pruebas de laboratorio para detectar bacterias helicob�cter pylori");
					System.out.println(receta2);
					re.put(paciente.getNombre(), receta2);
					break;
				}
				
				}else {
					System.out.println("Este padecimiento no pertenece a Gastroenterolog�a");
				}
			break;
		case 2: 
			if(paciente.getSintomas().equals("Epilepsia")|| paciente.getSintomas().equals("Esclerosis M�ltiple")
					|| paciente.getSintomas().equals("P�rkinson")) {
				Medico neuro = new Medico("Dra.Olivia","L�pez", "LOVODG637", "5", "Neurolog�a");
				System.out.println("Le atendio: "+neuro.toString());
				switch(paciente.getSintomas()) {
				case "Epilepsia":
					Receta receta = new Receta(neuro, paciente.getSintomas(), "Se necesita un examen Neurol�gico y/o un Electroencefalograma");
					System.out.println(receta);
					re.put(paciente.getNombre(), receta);
					break;
				case "Esclerosis M�ltiple":
					Receta receta1 = new Receta(neuro, paciente.getSintomas(), "Se necesita una Resonancia Magn�tica");
					System.out.println(receta1);
					re.put(paciente.getNombre(), receta1);
					break;
				case "P�rkinson": 
					Receta receta2 = new Receta(neuro, paciente.getSintomas(), "Realizar una Tomograf�a computalizada y una exploraci�n neurolog�ca");
					System.out.println(receta2);
					re.put(paciente.getNombre(), receta2);
					break;
				}
				
				}else {
					System.out.println("Este padecimiento no pertenece a Neurolog�a");
				}
			break;
		case 3: 
			if(paciente.getSintomas().equals("Insuficiencia Card�aca")|| paciente.getSintomas().equals("Hipertensi�n Arterial")
					|| paciente.getSintomas().equals("Angina de Pecho")) {
				Medico cardio = new Medico("Dr.Mario", "G�mez", "CHDJUET54423", "2", "Cardiolog�a");
				System.out.println("Le atendio: "+cardio.toString());
				switch(paciente.getSintomas()) {
				case "Insuficiencia Card�aca":
					Receta receta = new Receta(cardio, paciente.getSintomas(), "Necesita realizarse una Radiograf�a de pecho y un Ecocardiograma");
					System.out.println(receta);
					re.put(paciente.getNombre(), receta);
					break;
				case "Angina de Pecho":
					Receta receta1 = new Receta(cardio, paciente.getSintomas(), "Realizarse una Angiograf�a coronaria y Rayos X del t�rax");
					System.out.println(receta1);
					re.put(paciente.getNombre(), receta1);
					break;
				case "Hipertensi�n Arterial": 
					Receta receta2 = new Receta(cardio, paciente.getSintomas(), "Hipertensi�n etapa 1");
					System.out.println(receta2);
					re.put(paciente.getNombre(), receta2);
					break;
				}
				
				}else {
					System.out.println("Este padecimiento no pertenece a Cardiolog�a");
				}
			break;
		case 4: 
			if(paciente.getSintomas().equals("Fiebre y Tos")|| paciente.getSintomas().equals("Resfriado")
					|| paciente.getSintomas().equals("Presi�n baja")) {
				Medico familiar = new Medico("Dr. Daniel", "Escobar", "HHGDHG2435", "34", "Med. Familiar");
				System.out.println("Le atendio: "+familiar.toString());
				switch(paciente.getSintomas()) {
				case "Fiebre y Tos":
					Receta receta = new Receta(familiar, paciente.getSintomas(), "Tomar �cido acetilsalic�lico c/12hrs x 5 d�as, paracetamol c/8 hrs x 4 d�as");
					System.out.println(receta);
					re.put(paciente.getNombre(), receta);
					break;
				case "Resfriado":
					Receta receta1 = new Receta(familiar, paciente.getSintomas(), "Tomar Clorferamida compuesta c/8 hrs. x 4 d�as, Ambroxol 3 ml c/24 hrs x 5 d�as");
					System.out.println(receta1);
					re.put(paciente.getNombre(), receta1);
					break;
				case "Presi�n baja": 
					Receta receta2 = new Receta(familiar, paciente.getSintomas(), "Tomar fludrocortisona");
					System.out.println(receta2);
					re.put(paciente.getNombre(), receta2);
					break;
				}
				
				}else {
					System.out.println("Necesita un Especialista");
				}
			break;
			
		}
		System.out.println(re.values());
		}while(i!=4);
		
		return "" ;
	   
	}

	


	
	

	
	
	

}
