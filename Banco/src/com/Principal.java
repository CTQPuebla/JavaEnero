package com;

public class Principal {
	public static void main(String[] args) {
		Banco ban = new Banco("BBVA Bancomer","España");
		
		//Crear un cliente
		Cliente cli = new Cliente(20,"Luis","Domicilio1","Luis@gmail.com","8875665",29);
		Cliente cli2 = new Cliente(21, "Maria","Domicilio2","Maria@hotmail.com","7445078311",45);
		
		Cuenta cu = (Cuenta)ban.crearCuentaDebito(cli);
		Cuenta cu2 = (Cuenta)ban.crearCuentaDebito(cli2);
		
		Comprobante comp =(Comprobante)cu.Retirar(cu, 350.00);
		System.out.println(comp);
		System.out.println("saldo: "+cu.getSaldoDisponible());
		
		Comprobante comp2 =(Comprobante)cu.Retirar(cu2, 200.00);
		System.out.println(comp2);
		System.out.println("Saldo 2: " + cu2.getSaldoDisponible());
		
		
		//cu.transferir(cu2, 100.00);
		
	}

}
