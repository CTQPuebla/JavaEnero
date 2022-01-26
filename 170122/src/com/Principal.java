package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//Primitivos
		char a = 'a';
		byte b = 1;
		short c = 2;
		int d = 3;
		long e = 4500;
		float f = 500.6f;
		double g = 450909.78;
		boolean h = true;
		
		System.out.println("DATOS PRIMITIVOS");
		System.out.println("char: " +a);
		System.out.println("byte: " +b);
		System.out.println("short: " +c);
		System.out.println("int: " +d);
		System.out.println("long: " +e);
		System.out.println("float: " +f);
		System.out.println("double: " +g);
		System.out.println("boolean: " +h);
		
		//Wrapped
		Character charobj=a;
		Byte byteobj = new Byte(b);
		Short shortobj = new Short(c);
		Integer intobj = new Integer(d);
		Long longobj = new Long(e);
		Float floatobj = new Float(f);
		Double doubleobj = new Double(g);
		Boolean booleanobj = new Boolean(h);
		
		System.out.println("\nDATOS WRAPPED");
		System.out.println("char: " +charobj);
		System.out.println("byte: "+byteobj);
		System.out.println("short: " +shortobj);
		System.out.println("int: " +intobj);
		System.out.println("long: " +longobj);
		System.out.println("float: " +floatobj);
		System.out.println("double: " +doubleobj);
		System.out.println("boolean: " +booleanobj);
		
		//WRAPPED con datos nuevos
		Character charobj2='p';
		Byte byteobj2 = 9;
		Short shortobj2 = 15;
		Integer intobj2 = 30;
		Long longobj2 = new Long(560);
		Float floatobj2 = new Float(98.76);
		Double doubleobj2 = new Double(129830.12);
		Boolean booleanobj2 = new Boolean(false);
		
		System.out.println("\nDATOS WRAPPED con nuevos datos");
		System.out.println("char: " +charobj2);
		System.out.println("byte: "+byteobj2);
		System.out.println("short: " +shortobj2);
		System.out.println("int: " +intobj2);
		System.out.println("long: " +longobj2);
		System.out.println("float: " +floatobj2);
		System.out.println("double: " +doubleobj2);
		System.out.println("boolean: " +booleanobj2);
	}

}
