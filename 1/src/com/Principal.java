package com;

public class Principal {
	
	/*static int NumeroEntero=5;
	static char Cadena='H';
	static boolean B=true;
	static float Decimal=8.5f;
	static double NumeroDecimal=8.5;
	*/public static void main(String[] args){
	//Aqui
		int NumeroEntero=5;
		char Cadena='H';
		boolean B=true;
		float Decimal=8.5f;
		double NumeroDecimal=8.5;
		byte Baty=127;
		long Largo=123456789;
		
		Character Caracteres='h';
		Integer Entero=15;
		Float Decimal2=0f;
		Double ND=0.0;
		if(Caracteres.equals('h')) {//compararndo caracteres
			System.out.println(Caracteres);
		}
		Entero.toString();//convirtiendo el entero a String
		System.out.println(Entero);
		
		System.out.println(Decimal2.min(4.5f,10.0f));//buscando el numero menor
		
		
		
	System.out.println("17 de enero de 2022");
	System.out.println(NumeroEntero+5);
	System.out.println(Cadena);
	System.out.println(B);
	System.out.println(Decimal);
	System.out.println(NumeroDecimal);
	System.out.println(Baty);
	System.out.println(Largo);
	
	
	
	String m="hola";
	if(m.length()>7&& m.equals("hoLA")){
		System.out.println("si");
	}else {
		System.out.println("no");
	}
	
	int o=5;
	switch(o) {
	case 1:
		System.out.println("uno");
		break;
	case 2:
		System.out.println("dos");
		break;
	case 3:
		System.out.println("tres");
		break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
	
		default:
			System.out.println("desconocido");
	}
	
	String oo="a";
	switch(oo) {
	case "a":
		System.out.println("uno");
		break;
	case "b":
		System.out.println("dos");
		break;
	case "c":
		System.out.println("tres");
		break;
		case "d":
			System.out.println("4");
			break;
		case "e":
			System.out.println("5");
			break;
	
		default:
			System.out.println("desconocido");
	}
	
	if(oo.equals("a")) {
		System.out.println("si es a");
	}else if(oo.equals("b")) {
		System.out.println("si es b");
	}else { System.out.println("desconocido");}
	
	String h="abcd";
	if(h.equals("otra cosa")||h.length()==4){
		
		System.out.println("si");
	}else {
		System.out.println("no");
	}
	System.out.println("\n");
//	ejercicio
	
	int calificacion=10;
	String ALUMNO="DAVID";
	switch(ALUMNO) {
	case "DAVID":
	if((calificacion>5) &&(calificacion<=10)) {
		System.out.println(ALUMNO+": aprobado");	
	}else if((calificacion<=5)&&((calificacion>0)||calificacion==0)){
		System.out.println(ALUMNO+": reprobado");
	}else {
		System.out.println("la calificacion asignada no entra dentro del rango");
	}break;
	case "JUAN":
		if((calificacion>5) &&(calificacion<10)) {
			System.out.println(ALUMNO+": aprobado");	
		}else if((calificacion<=5)&&((calificacion>0)||calificacion==0)){
			System.out.println(ALUMNO+": reprobado");
		}else {
			System.out.println("la calificacion asignada no entra dentro del rango");
		}break;
	default:
		System.out.println("usted no es alumno");
	}}}

