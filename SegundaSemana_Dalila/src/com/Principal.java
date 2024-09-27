package com;

import java.util.*;

public class Principal {
		public static void main(String args[]) {
		
			
			
			Estado e=new Estado();
			Estado e2=new Estado();
			//CONSTRUCTYOR CON 1 ARGUMENTO
			Estado e3=new Estado("SAN LUIS POTOSI");
			
			e.setNombre("Nuevo Leon");
			e.setCapiltal("Monterrey");
			e.setClave("cv1");
			e.setNumHabitantes(9999);
			e.setZona("Norte");
			e.setExtensionKM2(5665645);
			
			e2.setNombre("Guerrero");
			e2.setCapiltal("chilpancingo");
			e2.setClave("cv2");
			e2.setNumHabitantes(56464);
			e2.setZona("SUR");
			e2.setExtensionKM2(5665);
			
			System.out.println(e);
			System.out.println(e2);
			System.out.println(e3);
			System.out.println(e.getZona());
			
			
			//listas
			List<String >l=new ArrayList<>();
			//añadir valores a la lista
			l.add("cual quier cosa");
			l.add(new String ("Mientras sea string"));
			l.add(";");
			l.add("a");
			l.add("b");
			
			//pedirle un valor- metodo get ();
			System.out.println("valor: "+l.get(2));
			//ver su tamaño
			System.out.println("tamaño: "+l.size());
			l.remove("a");
			l.remove(3);
			System.out.println(l);
			
			//lista de numeros
			List<Integer >n=new ArrayList<>();
			n.add(45);
			n.add(12);
			n.add(4);
			n.add(99);
			n.add(5);
			n.add(76);
			
			
			n.remove(n.indexOf(5));
			//n.remove(5);
			//n.remove(new Integer(5));
			System.out.println(n);
			
			
		}
		
}
