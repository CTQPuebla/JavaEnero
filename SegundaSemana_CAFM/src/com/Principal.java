package com;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		//Clase Estado
//		Estado e = new Estado();
//		Estado e2 = new Estado();
//		Estado e3 = new Estado("San Luis Potosí");
//		
//		e.setNombre("Puebla");
//		e.setClave("PB");
//		e.setCapital("Puebla de Zaragoza");
//		e.setZona("Centro");
//		e.setExtensionkm2(546);
//		e.setNumHabitantes(6583278);
//		
//		e2.setNombre("Guerrero");
//		e2.setCapital("Chilpancingo");
		
//		System.out.println("Estados:");
//		System.out.println(e);
//		System.out.println(e2);
//		System.out.println(e3);
		
		//Clase Empleado
		//Creación de objetos Empleados
//		Empleado emp1 = new Empleado(), emp2 = new Empleado("534");
		
		//Empleado 1
//		emp1.setNombre("José Luis"); emp1.setApellidoPaterno("Perez"); emp1.setApellidoMaterno("López");
//		emp1.setNumEmpleado("463");
//		emp1.setActivo(true);
//		emp1.setRfc("JKLD872501DFG");
//		emp1.setSueldo(3000.55);
//		
//		emp2.setNombre("Cosme Fulanito"); emp2.setApellidoPaterno("Simpson"); emp2.setApellidoMaterno("Pereira");
//		emp2.setActivo(false);
//		emp2.setRfc("PDMM985231SM4");
//		emp2.setSueldo(5000.7);
//		
//		System.out.println("Empleados:");
//		System.out.println(emp1);
//		System.out.println(emp2);
		
		List<String> lista = new ArrayList<>();
		//Añadir valores a la lista
		lista.add("Chuchita");
		lista.add(new String("Guadalupe"));
		lista.add(";");
		lista.add(null);
		
		System.out.println(lista);
		
		//Obtener un valor
		System.out.println(lista.get(1));
				
		lista.add("Nada");
		System.out.println(lista);
		
		//Remover un elemento de la lista
		lista.remove(2);
		System.out.println(lista);
		
		//Ver el tamaño de la lista
		System.out.println("Tamaño de la lista: "+lista.size());
		System.out.println(lista);
		
		//Remover un objeto
		lista.remove("Guadalupe");
		System.out.println(lista);
		
	}
}
