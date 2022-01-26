package com;

import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class Principal {
	public static void main(String[] args) {
		//Crear un objeto y se llama al constructor vacio
//		Estado e= new Estado();
//		Estado e2= new Estado();
//		//Se llama al constructor con un argumento
//		Estado e3= new Estado("San Luis Potosi");
//		
//		//Se dan valores a los atributos con set
//		e.setNombre("Nuevo Leon");
//		e.setCapital("Monterrey");
//		e.setClave("cv1");
//		e.setNumHabitantes(9999);
//		e.setZona("Norte");
//		e.setExtensionKm2(97899);
//		
//		e2.setNombre("Guerrero");
//		e2.setCapital("Chilpancingo");
//		
//		System.out.println(e);//Metodo toString
//		System.out.println(e2);
//		System.out.println(e3);
		//System.out.println(e.getZona());
		
		Alumno a=new Alumno();
		//Alumno a2=new Alumno("Antonio Angeles Lopez");
		
		a.setNombre("Isabela Jeon Canela");
		a.setMatricula("201823021");
		a.setEdad(17);
		a.setGrado(3);
		a.setGrupo("C");
		a.setTurno("Matutino");
		
//		a2.setMatricula("201800121");
//		a2.setEdad(16);
//		a2.setGrado(3);
//		a2.setGrupo("B");
//		a2.setTurno("Matutino");
		
//		System.out.println(a);
//		System.out.println(a2);
		
		//------------------------------LISTAS---------------------------
		//Añadir valores a la lista - metodo add();
		List<String> l= new ArrayList<>();
		l.add("Cualquier cosa");
		l.add(new String("Mientras sea String"));
		l.add(";");
		l.add("a");
		l.add("b");
		
		System.out.println(l);
		
		//Pedirle un valor - metodo get();
		System.out.println("Valor: "+l.get(2));
		
		//Ver su tamaño - metodo size();
		System.out.println("Tamaño: "+ l.size());
		
		//Remover elementos - indice
		l.remove("b"); //l.remove(3);
		System.out.println(l);
		
		List<Integer> n= new ArrayList<>();
		n.add(45);
		n.add(12);
		n.add(4);
		n.add(99);
		n.add(5);
		n.add(76);
		
		//n.remove(76);
		n.remove(n.indexOf(76)); //Busca el indice del valor 76 y elimina lo que esta en el indice
		//n.remove(new Integer(5));
		System.out.println(n);
	}
}
