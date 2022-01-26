package com;

public class Principal {
	public static void main(String[] args) {
		Banco b = new Banco("Banco Santander","México");
		
		//Crear cuenta
		//1.- Crear un cliente
		Cliente cliente1 = new Cliente(10, 30, "Luis Pérez", "Av. Grande No. 1", "luisp@gmail.com", "1234567890");
		Cliente cliente2 = new Cliente(20, 25, "Guadalupe Pineda", "Calle 1 no. 2", "lupis@gmail.com", "987654320");
		//2.- Utilizando como parámetro el objeto anterior, instancío una cuenta
		Cuenta cuenta1 = (Cuenta) b.crearCuentaDebito(cliente1);
		System.out.println(cuenta1.toString());
		Cuenta cuenta2 = (Cuenta) b.crearCuentaDebito(cliente2);
		System.out.println(cuenta2.toString());
		
		System.out.println("\nRETIRO");
		double monto = 1910;
		try {
			Comprobante comprobante1 = (Comprobante) cuenta1.retirar(cuenta1, monto);
			System.out.println(comprobante1);
			System.out.println("Monto de retiro: $"+comprobante1.getRetiro());
			System.out.println("Nuevo saldo: $"+cuenta1.getSaldoDisponible());
		} catch(Exception ex) {
			String mensaje = (String) cuenta1.retirar(cuenta1, monto);
			System.out.println(mensaje);
		}
		
		System.out.println("\nDEPÓSITO");
		monto = 500;
		try {
			Comprobante comprobante2 = (Comprobante) cuenta1.depositar(cuenta1, monto);
			System.out.println(comprobante2);
			System.out.println("Monto de depósito: $"+comprobante2.getRetiro());
			System.out.println("Nuevo saldo: $"+cuenta1.getSaldoDisponible());
		} catch(Exception ex) {
			String mensaje = (String) cuenta1.depositar(cuenta1, monto);
			System.out.println(mensaje);
		}
		
		System.out.println("\nTRANSFERENCIA");
		monto = 400;
		try {
			Comprobante comprobante3 = (Comprobante) cuenta1.trasnferir(cuenta2, monto);
			System.out.println(comprobante3);
			System.out.println("Monto de transferencia: $"+comprobante3.getRetiro());
			System.out.println("Nuevo saldo: $"+cuenta1.getSaldoDisponible());
			System.out.println("Nuevo saldo destino: $"+cuenta2.getSaldoDisponible());
		} catch(Exception ex) {
			String mensaje = (String) cuenta1.trasnferir(cuenta2, monto);
			System.out.println(mensaje);
		}
		
		
	}
}
