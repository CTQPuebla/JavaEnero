package com;

public class Principal {
	public static void main(String[] args) {
		int numi=19;
		float numf=30.5f;
		double numd=7.14;
		char car='h';
		boolean band=true;
		byte b=-128;
		long numl=1234567890;
		
		System.out.println(numi);
		System.out.println(numf);
		System.out.println(numd);
		System.out.println(car);
		System.out.println(band);
		System.out.println(b);
		System.out.println(numl);
		
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
		}else { 
			System.out.println("desconocido");
			}
	
		String h="abcd";
		if(h.equals("otra cosa")||h.length()==4){
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		System.out.println("\n");
	}
}
