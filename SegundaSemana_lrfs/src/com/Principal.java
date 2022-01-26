package com;

public class Principal {

	public static void main(String[] args) {
		
		Estado primerEstado = new Estado();
		System.out.println("instancia vacia: " + primerEstado);
		
		primerEstado.setNombre("Sinaloa");
		primerEstado.setCapital("Culiacan");
		primerEstado.setClave("SLN");
		primerEstado.setExtensionKm2(564654);
		primerEstado.setHabitantes(55555);
		System.out.println("instancia despues de setters: " + primerEstado);
		System.out.println();
		
		Volkswagen primerAuto = new Volkswagen("Jetta");
		System.out.println("Instancia inicial: " + primerAuto);
		
		primerAuto.setColor("Negro");
		primerAuto.setInterior("Piel");
		System.out.println("Instancia despues de setters: " + primerAuto);
	}

}
