
public class Principal {
	
	public static void main (String arg []) {
		Banco b = new Banco ("BBVA Bancomer", "España"); 
		//Crear una cuenta

		//1.- Crear un cliente
		Cliente cliente1 = new Cliente (10,"Luis","domicilio1","email@server.com","009876543",55);
		Cliente cliente2 = new Cliente (20,"Maria","domicilio2","email@hotmail.com","12345678",25);
		
		//2.- Utilizando como parametro el objeto anterior, instancia una cuenta
		
			Cuenta cuenta = (Cuenta) b.crearCuentaDebito(cliente1);
			Cuenta cuenta2 = (Cuenta) b.crearCuentaDebito(cliente2);
		
			System.out.println(cuenta);
			
			//Retiro - ok
			try {
			Comprobante comp = (Comprobante) cuenta.retirar(cuenta, 400.00);
			System.out.println(comp);
			
			}catch(Exception ex){
			String mensaje = (String)cuenta.retirar(cuenta, 1851.00);
			System.out.println(mensaje);			
			}
			System.out.println("saldo: "+cuenta.getSaldoDisponioble());
			
			//Deposito -
			cuenta.depositar(cuenta, 800.00);
			System.out.println("Saldo: " + cuenta.getSaldoDisponioble());
			
			cuenta.transferir(cuenta2, 8001);
			System.out.println("Saldo cuenta1: " + cuenta.getSaldoDisponioble());
			System.out.println("Saldo cuenta2: " + cuenta2.getSaldoDisponioble());
							
		System.out.println(cuenta);
	}

}
