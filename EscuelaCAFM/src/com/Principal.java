package com;

import java.util.Collections;

public class Principal {
	public static void main(String[] args) {
		
		Universidad uni = new Universidad("Universidad Tecnológica del Estado de Nuevo Toledo",
				"Av. Marina Nacional 180, Xapotote, Nuevo Toledo");
		System.out.println(uni);
		
		Asignatura asign01 = new Asignatura("101", "Herramientas Matemáticas I", "C", 9.35);
		System.out.println(asign01);
		Asignatura asign02 = new Asignatura("102", "Programación Estructurada", "C", 5.65);
		System.out.println(asign02);
		Asignatura asign03 = new Asignatura("203", "Herramientas Matemáticas II", "C", 9.35);
		System.out.println(asign03);
		Asignatura asign04 = new Asignatura("204", "Programación Orientada a Objetos", "C", 5.65);
		System.out.println(asign04);
		
		int rvoe = (int)Math.floor(Math.random()*1000000);
		String rvoeString = Integer.toString(rvoe);
		
		PlanEstudios plan1 = new PlanEstudios("Ingeniería en Sistemas", "federal", rvoeString , 2020);
		plan1.agregarAsignatura(asign01);
		plan1.agregarAsignatura(asign02);
		plan1.agregarAsignatura(asign03);
		plan1.agregarAsignatura(asign04);
		
		System.out.println("\nAgregar carrera "+plan1.getNombre()+" "+plan1.getAnio());
		uni.agregarPlanEstudios(plan1);
		System.out.println(uni);
		
	}
}
