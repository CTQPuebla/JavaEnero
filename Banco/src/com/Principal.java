package com;

public class Principal {

	public static void main(String[] args) {
		
		Bancos b = new Bancos("BBVA", "Espana", 1);
		
		//Crear un cliente
		Cliente cliente1 = new Cliente(10,"Luis","Domicilio1","email@server.com","00921821", 29);
	    Cliente cliente2 = new Cliente(20, "Maria","Domicilio2", "sadsa@new.com", "00212123", 23);
		
		Cuenta cuenta = (Cuenta) b.crearcuentadebito(cliente1);
		Cuenta cuenta2 = (Cuenta) b.crearcuentadebito(cliente2); 
		
		//Retiro
		Comprobante comp = (Comprobante) cuenta.retirar(cuenta,400.00);
	    System.out.println(comp);
		System.out.println("saldo: " +cuenta.getSaldodisponible());
		
		//Depositar
		cuenta.depositar(cuenta, 800.00);
      
		System.out.println("Saldo: " + cuenta.getSaldodisponible());
		
		
		
	}
	
	
}
