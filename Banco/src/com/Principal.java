package com;

public class Principal {
	public static void main(String[] args) {
		
		Banco b = new Banco("BBVA Bancomer", "España");
		
		//Crea una cuenta
		
		//1. Crear un cliente
		Cliente cliente1 = new Cliente(10, "Luis", "Domicilio 1", "email@server.com","009876543", 29);
		Cliente cliente2 = new Cliente(20, "Maria", "Domicilio 2", "email@hotmail.com","123456789", 25);
		//2. Utilizando como parametro el objeto anterior instancio una cuenta
		
		Cuenta cuenta = (Cuenta) b.crearCuentaDebito(cliente1);
		Cuenta cuenta2 = (Cuenta) b.crearCuentaDebito(cliente2);
					
		System.out.println(cuenta);

		//Retiro - OK
		try{
			Comprobante comp = (Comprobante) cuenta.retirar(cuenta, 1851.00);
			System.out.println(comp);
	    }catch(Exception ex){
      	String mensaje = (String) cuenta.retirar(cuenta, 1851.00);
			System.out.println(mensaje);
	    }
		
//		System.out.println("Saldo: "+cuenta.getSaldoDisponible());
		
		//Deposito - OK
//		cuenta.depositar(cuenta, 800.00);
//		System.out.println("Saldo: "+cuenta.getSaldoDisponible());
		
		//Transferir - OK
//		cuenta.transferir(cuenta2, 8001.00);
//		System.out.println("Saldo cuenta 1: "+cuenta.getSaldoDisponible());
//		System.out.println("Saldo cuenta 2: "+cuenta2.getSaldoDisponible());
	}
}
