package com;

public class Principal {
	
	public static void main(String [] args) {
		
		Banco b = new Banco ("BBVA Bancomer", "España");
		
		//CREAR UNA CUENTA
		//1.CREAR UN CLIENTE
		Cliente cliente1 = new Cliente (10,"Luis","domicilio","email@server.com","0200000023",29);   
		Cliente cliente2 = new Cliente (20,"Maria","domicilio2","email@hotmail.com","12233456",25);
		//2. Utilizando como parametro el objeto anterior,instancio una cuenta
	
			Cuenta cuenta = (Cuenta) b.crearCuentaDebito (cliente1);
			Cuenta cuenta2 = (Cuenta) b.crearCuentaDebito (cliente2);
		
//		//Retiro
//		Comprobante comp = (Comprobante)cuenta.retirar(cuenta, 400.00, 2);
//		System.out.println(comp);
//		System.out.println("saldo: " +cuenta.getSaldoDisponible());
		
		try{
			Comprobante comp1 = (Comprobante) cuenta.retirar(cuenta, 1851.00,1);
			System.out.print(comp1);
		}catch (Exception ex) {
			String mensaje = (String) cuenta.retirar (cuenta, 1851.00,1);
			System.out.println(mensaje);
		}
		//Deposito
//		cuenta.depositar(cuenta, 800.00);
//		System.out.println("saldo: " +cuenta.getSaldoDisponible());
//		
		
		//Transferencia
		cuenta.transferir(cuenta2, 8001.00);
		System.out.println("saldo cuenta1: " +cuenta.getSaldoDisponible());
		System.out.println("saldo cuenta2: " +cuenta2.getSaldoDisponible());
	}

	
}
