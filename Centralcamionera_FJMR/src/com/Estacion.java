package com;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Estacion implements Interfacecentral  {
	
	
 String nombre;
 String direccion;
 

int cont;





public Estacion(String nombre, String direccion, int cont) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	this.cont = 0;
}

public Estacion(String nombre, String direccion) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
}


public Estacion()
{
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


public int getCont() {
	return cont;
}


public void setCont(int cont) {
	this.cont = cont;
}


@Override
public String toString() {
	return "Nombre de su estacion: " + nombre + "    Direccion: " + direccion + "]";
}


@Override
public Object comprar(Autobuses a, Cliente c) {
	int d = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Dinero que pagara con: ");
	d = scan.nextInt();
	try {
					if(c.getEdad() <= 12 || c.getEdad() >= 60 || c.getOcupacion().equals("Estudiante"))
						{
								double x = 0.0d;
								x = a.getCosto() / 2;
								a.setCosto(x);
                               if(d >= x) {
							     System.out.println("Datos de su viaje: ");
								 Boleto b = new Boleto(cont++, new Date(), c, a);
								 System.out.println(b);
								
								
                               }
								
					    	}	
						else if(c.getEdad() > 12 && c.getEdad() < 60)
						{
							if(d >= a.getCosto())
							{
								System.out.println("Datos de su viaje: ");
								Boleto b = new Boleto(cont++, new Date(), c, a);
							    System.out.println(b);	
							  
							}	  
						} 
						else {
							System.out.println("Insuficiente");
						}
		}			
	catch(Exception e) {
		System.out.println("Error");
	}
	
		return "vacio";
}


@Override
public Object cancelar(HashMap<Integer, Object> h) {	
	
    int a;
	Scanner scan = new Scanner(System.in);
	System.out.println("El numero de boleto que desea eliminar");
	a = scan.nextInt();
//			h.entrySet().forEach(entry -> {System.out.println(entry.getKey() + " " + entry.getValue());	});
		  
	   for (Map.Entry<Integer, Object> entry : h.entrySet())
	   {
           if (Objects.equals(a, entry.getKey()))
           {
        	   System.out.println("Se ha borrado el boleto con folio: " + entry.getKey());
        	   h.remove(entry.getKey());
        	   System.out.println("nuevo hashmap: ");
        	   System.out.println(h);
        	   return entry.getKey();
           }
       }
       return null;
}





















}
