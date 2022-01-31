package com;



import java.util.HashMap;


public class Principa {

	public static void main(String[] args) {
	   int contador = 0;
	  
		Estacion e = new Estacion("CAPU", "22 sur");
		Autobuses x = new Autobuses("morelos", "guadalajara", "5:00", 800.00);
		Cliente y  = new Cliente("Olivia", "Lopez", 11, "arquitecta");
		Autobuses x2 = new Autobuses("monterrey", "sinaloa", "14:00", 400.00);
		Cliente y2  = new Cliente("Javier", "mpra;es", 24, "Estudiante");
		Autobuses x3 = new Autobuses("cancun", "acapulco", "19:00", 750.00);
		Cliente y3  = new Cliente("eduardo", "lopez", 18, "Arquitecto");
		HashMap<Integer, Object> h = new HashMap<Integer, Object>();
	
	
	h.put(contador++, e.comprar(x, y));
	h.put(contador++, e.comprar(x2, y2));
	h.put(contador++, e.comprar(x3, y3));
	

	e.cancelar(h);
		
        
//		h.entrySet().forEach(entry -> {System.out.println(entry.getKey() + " " + entry.getValue());	});
		
	}
}
