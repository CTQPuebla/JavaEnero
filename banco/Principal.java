package banco;

public class Principal {

	public static void main(String[] args) {
		
		Banco b = new Banco("BBVA Bancomer","España");
		
		//Crear una cuenta
		//Crear un cliente
		Cliente cliente1 = new Cliente(10,"Luis","domicilio 1","luis@server.com","2472728",50);
		Cliente cliente2 = new Cliente(20,"Maria","domicilio 2","maria@hotmail.com","36524637",25);
		//Utilizando con parametro el objeto anterior, instancio una cuenta
		
			Cuenta cuenta = (Cuenta) b.crearCuentaDebito(cliente1);
			System.out.println(cuenta);
			Cuenta cuenta2 = (Cuenta) b.crearCuentaDebito(cliente2);
			System.out.println(cuenta2);
			
			
			//Retiro ok
			try {
				Comprobante comp = (Comprobante) cuenta.retirar(cuenta, 100.00);
				System.out.println(comp);
			}catch(Exception ex) {
				String mensaje = (String) cuenta.retirar(cuenta, 1851.00);
				System.out.println(mensaje);
				
			}
			
			System.out.println(cuenta.getSaldoDisponible());

			//Depóstito
			//cuenta.depositar(cuenta, 800);
			//System.out.println("saldo: "+cuenta.getSaldoDisponible());
			
			//Transferir
			//cuenta.transferir(cuenta2, 8001);
			//System.out.println("saldo cuenta 1: "+cuenta.getSaldoDisponible());
			//System.out.println("saldo cuenta 2: "+cuenta2.getSaldoDisponible());
	}

}
