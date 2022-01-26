package com;

public class Principal {

	public static void main  (String args[]) {
		Banco b=new Banco("BBVA Bancomer", "España");
		
		//crear cuenta
		// crear cliente
		Cliente cliente1=new Cliente(10,"luis","domicilio1","imail@server.com","05462656",29);
		Cliente cliente2=new Cliente(10,"maria","domicilio2","imail@hotmail.com","05462656",25);
		
		Cuenta cuenta=(Cuenta) b.crearCuentaDebito(cliente1);
		Cuenta cuenta2=(Cuenta) b.crearCuentaDebito(cliente2);
		//retiro
		System.out.println(cuenta);
		try {
		Comprobante comp=(Comprobante)cuenta.retirar(cuenta, 1850.00);
		System.out.println(comp);}
		catch(Exception ex) {
			String mensaje=(String)cuenta.retirar(cuenta, 1851.0);
		System.out.println(mensaje);
		}
		
		System.out.println("saldo"+cuenta.getSaldoDisponible());
		
		//depsitar
		cuenta.depositar(cuenta, 8000.00);
		System.out.println("saldo"+cuenta.getSaldoDisponible());
		
		
		//transferir
		cuenta.tranferir(cuenta2, 1850);
		System.out.println("saldo ceunta1"+cuenta.getSaldoDisponible());
		System.out.println("saldo ceunta2"+cuenta2.getSaldoDisponible());
		
		/*try {
		Cuenta cuenta=(Cuenta) b.crearCuentaDebito(cliente1);
		System.out.println(cuenta);
		}catch(Exception ex) {
		System.out.println("edad valida");
		System.out.println(ex.getMessage());
	}*/}
	
}
