package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		

		//Paciente
		Paciente nP = new Paciente();

		
		//Medico		
		Medico medico1 = new Medico("01"," Arturo", "Hernandez", "Huerta", 45, "Masculino", true, "Medico General", "Medicina Interna","15 años");
		Medico medico2 = new Medico("02"," María", "Huerta", "Ramirez", 36, "Femenino", true, "Medico General", "Infectología de Adulto", "6 años");
		
		
		Hospital hospital = new Hospital("IMSS","AZUL",medico1);
		
		
		

		do {
		System.out.println("-------------------" +" MENU "+ "-------------------" +
		"\n1.-Ingresar Datos del Paciente Nuevo " + 
		"\n2.-Obtener Historial del Paciente" +
		"\n0.-Salir ");
		System.out.println("Ingresa el numero de la opcion que deseas realizar:");
		 x= sc.nextInt();
		 
		
		switch(x) {
		 case(1):
			 
			hospital.nuevoPaciente();
		 

			


			
			 

		 
		 break;
		 
		 case(2):
			 
			 System.out.println(hospital);			 
		 } 
		
		
	}while(x!=0);
		
	}	
	
}
		
