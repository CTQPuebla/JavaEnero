package com;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		String nombre ,estudio, genero,año;
		
		Peliculas p1 = new Peliculas ("Spiderman","marvel","accion","2021");
		//System.out.println(p1);

		Peliculas p2 = new Peliculas ("Av","Dc","accion","2020");
		//System.out.println(p2);

		Peliculas p3 = new Peliculas ("Escuadron suicida","Dc","accion","2021");
		//System.out.println(p3);

		Peliculas p4 = new Peliculas ("La mujer maravilla","Dc","accion","2017");
		//System.out.println(p4);

		Peliculas p5 = new Peliculas ("Batmas vs Superman","DC","accion","2016");
		//System.out.println(p5);
		
		
		List <Peliculas> p = new ArrayList ();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		int opcion = 0;
		Scanner sc = new Scanner (System.in);
		
		boolean menu = true;
		do {
			try {
				
				
		 
		System.out.println("Selecciona una opcion \n1 para ingresar una pelicula ,\n2 para editar, \n3 eliminar , \n4 mostrar lista");
		 opcion = sc.nextInt();
		
		if (opcion>4 || opcion<=0) {
			
			System.out.println("La opcion es invalida");
		} else {
			//menu = false;
	switch (opcion) {
			
			case 1: 
				
				sc.nextLine();
				System.out.println("Ingresa el nombre de la pelicula ");
				nombre = sc.nextLine();
				
				//sc.nextLine();
				
				System.out.println("Ingresa el estudio ");
				estudio= sc.nextLine();
	
				System.out.println("Ingresa el genero ");
				genero = sc.nextLine();
	
				System.out.println("Ingresa el año");
				año = sc.nextLine();
				
				Peliculas c  =new Peliculas (nombre,estudio,genero,año);
				p.add(c);
				
				break;
				
				
			case 2: 
				
				System.out.println("esta es la lista de peliculas , selecciona una para editar");
				
				for (int k=0 ; k<p.size(); k++) {
					
					System.out.println(p.get(k));	
				}

				sc.nextLine();
				System.out.println("ingresa el nombre de la pelicula a editar");
				String opcp = sc.nextLine();
				
				for (int i=0 ; i<p.size(); i++) {
					//System.out.println(p.get(i));
					
					if(opcp.equals(p.get(i).getNombre())) {
						
						System.out.println("ingresa nuevo nombre");
						nombre=sc.nextLine();
						p.get(i).setNombre(nombre);
						System.out.println(p.get(i));
						
						
						
					}
					
				}
				
				
				
				break;
			case 3:
             System.out.println("esta es la lista de peliculas , selecciona una para eliminar");
				
				for (int k=0 ; k<p.size(); k++) {
					
					System.out.println(p.get(k));	
				}

				sc.nextLine();
				System.out.println("ingresa el nombre de la pelicula a eliminar");
				String opce = sc.nextLine();
				
				for (int i=0 ; i<p.size(); i++) {
					//System.out.println(p.get(i));
					
					if(opce.equals(p.get(i).getNombre())) {
						p.remove(i);
						System.out.println("Se elimino la palicula");
						
						
					}
					
				}
				break;
			case 4:
				
	                for (int i=0 ; i<p.size(); i++) {
					
					System.out.println(p.get(i));	
				}
				break;
				
				
			}
		   } 
		   }catch (InputMismatchException err) {
			     System.out.println("Error");
		}
			
			
		
			
		}while (menu); 
		
		 System.out.println("fuera del while");
		

		

		
		
		
		
		
		
	}

}
