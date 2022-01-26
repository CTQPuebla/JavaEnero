package com;

public class Principal {

	public static void main(String args[]) {
		
	Cliente c=new Cliente("dalila",12);
	System.out.println(c);
	Zapatos z=new Zapatos(5,"cafe",250.0,2.5,5,"choes");
	System.out.println(z);
	Zapateria t=new Zapateria("gsgdjs","jdjhsgj");
	System.out.println(t);
	Venta n=new Venta(5,z,5,5);
	System.out.println(n);
	Comprobante com=new Comprobante(5,n,t,c);
	System.out.println(com);
	}
}
