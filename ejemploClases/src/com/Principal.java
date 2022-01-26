package com;

public class Principal {
	public static void main(String[] args) {
		 Purificadora pu = new Purificadora("Gotitas", "GOT950902264", "Privada Aldama Colonia : Lomas de la selva");
	       Cliente cl = new Cliente("vanessa figueroa", "tetexcalpan 21", "7772142721");
	       Producto p =new Producto("20092022",20.00, "garrafon", 16.00, 50);
	       
	     
	      try {
	    	  
	    	  Ticket ti = (Ticket)  pu.crearTicket(p, 28);
		       System.out.println(ti);
		       
	      }catch (Exception ex) {
	    	  
	    	  String mensaje = (String) pu.crearTicket(p, 60);
	    	  System.out.println(mensaje);
	      }
	       
	}
	       
	       
	       
	       
}
