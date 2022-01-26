package com;

import java.util.*;

public class ArregloPerro {
	public static void main(String args[]) {
		String nombre;
		int edad;
		double tamaño;
		String raza;
		String color;
		
		Scanner sc=new Scanner(System.in);
		Perro perro1=new Perro("firulais",5,0.5,"chihuahua","cafe");
	
		
	List <String> pe=new ArrayList();
	List <String> lista=new ArrayList();
	System.out.print("Elige una opcion ");
	System.out.print("1 Agregar un perro");
	System.out.print("2 Editar");
	System.out.print("3 Eliminar");
	System.out.print("4 Mostrar por raza");
	System.out.print("4 Mostrar todo");
	int opc=sc.nextInt();
	
	
	switch(opc){
	case 1:
		System.out.print("escribe el  nombre");
		nombre=sc.nextLine();
		
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	}
	
	
	
	}
	
}
