package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Generica> ls = new ArrayList();
		Generica ge = null;
		
		int t = 0;
		int x =0;
		String nom;
		String ape;
		int ed;
		String sex;
		
		
		do {
			System.out.println("1 Add");
			System.out.println("2 Editar");
			System.out.println("3 Eliminar");
			System.out.println("4 Mostrar por Edad");
			System.out.println("5 Mostrar Todo");
			System.out.println("Elige una opcion: ");
			t=sc.nextInt();
			
			switch(t) {
			case 1:
				System.out.println("Ingresa el nombre: ");
				nom = sc.next();
				System.out.println("Ingresa los apellidos: ");
				ape = sc.next();
				System.out.println("Ingresa la edad: ");
				ed = sc.nextInt();
				System.out.println("Ingresa el Sexo: ");
				sex = sc.next();
				
				ge = new Generica(nom,ape,ed,sex);
				ls.add(ge);
				System.out.println("datos ingresados correctamente");
				break;
				
			case 2:
				System.out.println("Ingresa el nombre a editar: ");
				nom = sc.next();
				
				for(int i = 0; i <ls.size(); i++) {
					if(ls.get(i).getNombre().equals(nom)) {
						System.out.println("Ingresa el nuevo nombre: ");
						nom = sc.next();
						
						ls.get(i).setNombre(nom);
						System.out.println("datos editados correctamente");
					}
					
				}
				break;
				
			case 3: 
				for(int j = 0; j<ls.size();j++) {
					System.out.println("Ingresa el nombre a eliminar: ");
					nom = sc.next();
					if(ls.get(j).getNombre().equals(nom)) {
						ls.remove(j);
						System.out.println(ls);
					}
				}
				break;
			case 4 :
				System.out.println("Ingresa la edad: ");
				ed = sc.nextInt();
				for(int z = 0; z<ls.size(); z++) {
					if(ls.get(z).getEdad() == ed ) {
						System.out.println(ls.get(z));
					}
				}
				break;
			case 5:
				System.out.println(ls);
				break;
				
			default:
				System.out.println("Elige una opcion de las anteriores");
			}
			
			x++;
		}while(t > 0 && t<=4 && x<6);
		
	

		
		
	}

}
