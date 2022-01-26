package com;

public class Principal {

     public static void main(String[] args) {
	
    	 Banco b = new Banco ("BBVA Bancomer", "España");
    	 
    	 //Crear una cuenta
    	 
    	 //Crear un cliente
    	 
    	 Cliente cliente1 = new Cliente (10,"Luis","Domicilio","email@server.com","009876543",70);
    	 // utilizando como parametro el objeto anterior ,instancia una cuenta
         Cuenta cuenta = (Cuenta)b.crearCuentaDebito(cliente1);
         System.out.println(cuenta);
         
         
    	 
   }
}
