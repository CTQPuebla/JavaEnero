package com;

import java.util.*;

public class ArregloDePerro {
	public static void main(String args[]) {
		String nombre;
		int edad;
		double tamaño;
		String raza="";
		String color;
		Perro p=null;
		Scanner sc=null;
		
		List <Perro> pe=new ArrayList();
		int opc=0;
		boolean salir=false;
		while(!salir) {

			System.out.println("1 Agregar un perro");
			System.out.println("2 Editar");
			System.out.println("3 Eliminar");
			System.out.println("4 Mostrar por raza");
			System.out.println("5 Mostrar todo");
			System.out.println("6 salir");
			System.out.println("Elige una opcion ");
			sc=new Scanner(System.in);
			opc=sc.nextInt();
try {
			switch(opc){
			case 1:
				sc=new Scanner(System.in);
				System.out.println("escribe el  nombre");
				nombre=sc.nextLine();
				sc=new Scanner(System.in);
				System.out.println("escribe el  edad");
				edad=sc.nextInt();
				sc=new Scanner(System.in);
				System.out.println("escribe el  altura");
				tamaño=sc.nextDouble();
				sc=new Scanner(System.in);
				System.out.println("escribe el  raza");
				raza=sc.nextLine();
				sc=new Scanner(System.in);
				System.out.println("escribe el  color");
				color=sc.nextLine();
				p=new Perro(nombre,edad,tamaño,raza,color);
				pe.add(p);
				break;
			case 2:
				System.out.println("ingresa el nombre de perro a editar");
				sc=new Scanner(System.in);
				nombre=sc.nextLine();
				for(int k=0;k<pe.size();k++) {
					if(pe.get(k).getNombre().equals(nombre)) {
						System.out.println("ingresa la nueva edad");
						edad=sc.nextInt();
						System.out.println("ingresa el nuevo tamaño");
						tamaño=sc.nextDouble();
						p.setEdad(edad);
						p.setAltura(tamaño);
					}
				}
				break;
			case 3:
				System.out.println("ingresa el nombre a eliminar");
				nombre=sc.nextLine();
				for(int j=0;j<pe.size();j++) {
					if(pe.get(j).getNombre().equals(nombre)) {
						pe.remove(j);
					}
				}
				break;
			case 4:
				System.out.println("ingresa la raza que quieras consultar");
				sc=new Scanner(System.in);
				raza=sc.nextLine();
				for(int j=0;j<pe.size();j++) {
					if(pe.get(j).getRaza().equals(raza)) {
						System.out.println(pe.get(j));
					}
				}
				break;
			case 5:
				System.out.println(pe);
				break;
			case 6:
				salir=true;
				break;
			}
			}catch(Exception ex){
				salir=false;
				
			}
		}
	}

}
