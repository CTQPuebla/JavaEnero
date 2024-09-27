package com;

public class PrincipalPerro {

	public static void main(String args[]) {
		Perro perro1=new Perro("firulais",5,0.5,"chihuahua","cafe");
		Perro perro2=new Perro();
		
		perro2.setAltura(1.0);
		perro2.setColor("negro");
		perro2.setEdad(2);
		perro2.setNombre("solo vino");
		perro2.setRaza("pit bull");
		System.out.println(perro1);
		System.out.println("Perro de altura: "+perro2.getAltura()+", color: "+perro2.getColor()+", edad: "+perro2.getEdad()+", nombre: "+perro2.getNombre()+", raza: "+perro2.getRaza());
	}
}
