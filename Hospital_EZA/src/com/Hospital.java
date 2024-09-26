package com;

import java.util.HashMap;
import java.util.Scanner;

public class Hospital implements Hospitalito {
	
	String nombre;
	String direccion;
	Paciente paciente;
	Medico medico;
	Scanner sc = new Scanner(System.in);
	HashMap <Object,Paciente> pacientes = new HashMap <Object,Paciente>();
	
	
	
	
	public HashMap<Object, Paciente> getPacientes() {
		return pacientes;
	}



	public void setPacientes(HashMap<Object, Paciente> pacientes) {
		this.pacientes = pacientes;
	}



	public Hospital(String nombre, String direccion, Medico medico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.medico = medico;
	}



	public Hospital(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}



	public Hospital(String nombre, String direccion, Paciente paciente, Medico medico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.paciente = paciente;
		this.medico = medico;
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



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public Medico getMedico() {
		return medico;
	}



	public void setMedico(Medico medico) {
		this.medico = medico;
	}




	
	


	public void mostrarDatosHospital() {
		System.out.println("\n\t---------------");
		System.out.println("Hospital: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("\t---------------");
	}
	
	public Object nuevoPaciente() {
		
		 int id = (int) (Math.random()*10000000);
	     System.out.println("ID = " + id);
	     
	     sc = new Scanner(System.in);  
	     System.out.println("Ingresa el nombre del paciente: ");
	     nombre =sc.nextLine();
			 
	     sc = new Scanner(System.in);   
	     System.out.println("Ingresa el apellido Paterno: ");
	     String apellidoPaterno = sc.nextLine();
	     
		   
	     System.out.println("Ingresa el apellido Materno: ");
	     String apellidoMaterno = sc.nextLine();
	     
		     
	     System.out.println("Ingresa la edad del paciente: ");
	     int edad = sc.nextInt();
	     
	     sc = new Scanner(System.in);
	     System.out.println("Ingresa el genero del paciente: ");
	     String genero = sc.nextLine();
	    
	    Paciente paciente = new Paciente(id,nombre,apellidoPaterno,apellidoMaterno,edad,genero);
	    System.out.println(paciente);
	    
	    pacientes.put(paciente.getNombre(), paciente);
	    System.out.println(pacientes);
	    return "";	
	}
	
	@Override
	public String toString() {
		return "Hospital [nombre=" + nombre + ", direccion=" + direccion + ", paciente=" + paciente + ", medico="
				+ medico + ", Hashmap pacientes: " + pacientes + "]";
	}

}
