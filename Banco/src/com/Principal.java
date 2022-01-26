package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Banco b =new Banco("BBVA Bancomer", "España");
		
		//Crear cuenta
		
		//1.-Crear un cliente
		Cliente cliente1 = new Cliente(10,"Luis","domicilio1","email@server.com","telefono",29);
		Cliente cliente2 = new Cliente(10,"Maria","domicilio2","email@server.com","telefono",25);
		//2.-Utilizando como parametro el objeto anterior,instancio de cuenta

		Cuenta cuenta= (Cuenta) b.crearCuentaDeDebito(cliente1);
		Cuenta cuenta2= (Cuenta) b.crearCuentaDeDebito(cliente2);
		System.out.println(cuenta);
//		if(cuenta!= null) {
		//Retiro
		Comprobante comp=(Comprobante)cuenta.retirar(cuenta,1000.00);
		System.out.println(comp);
		System.out.println("saldo " + cuenta.getSaldoDisponible());

//		}
		
		//Deposito
		cuenta.depositar(cuenta, 800.00);
		System.out.println("saldo: " + cuenta.getSaldoDisponible());
		
		//Transferir
		cuenta.transferir(cuenta2,900.00);
		System.out.println("saldo cuenta1: " + cuenta.getSaldoDisponible());
		System.out.println("saldo cuenta2: " + cuenta2.getSaldoDisponible());
		

	}

}
