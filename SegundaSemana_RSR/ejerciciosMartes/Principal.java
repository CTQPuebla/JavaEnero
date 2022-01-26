package ejerciciosMartes;

public class Principal {

	public static void main(String[] args) {
		
		//String nombre, String RFC,String domicilio, String correo, String telefono, int edad, String nombreBeneficiario
		
		
		Banco banco = new Banco("Bancomer","España", "");
		
		Cliente cliente1 = new Cliente("Luis", "RFC1" ,"domicilio 1", "correo@dominio.com","12345",60, "beneficiario");
		Cliente cliente2 = new Cliente("Turing", "RFC2" ,"domicilio 2", "alanT@dominio.com","12345",60, "beneficiario 1");
		
		Cuenta cuenta1 = (Cuenta)banco.crearCuentaDebito(cliente1);
		Cuenta cuenta2 = (Cuenta)banco.crearCuentaDebito(cliente2);
		
		Comprobante comprobante = (Comprobante)cuenta1.retirar(cuenta1, 100.0);
		System.out.println(comprobante);
		System.out.println("saldo: " + cuenta1.getSaldoDisponible());
		
		Comprobante comprobante2 = (Comprobante)cuenta2.retirar(cuenta2, 0.0);
		System.out.println(comprobante2);
		System.out.println("saldo: " + cuenta2.getSaldoDisponible());
		
		cuenta1.transferir(cuenta2, 100.0);
		System.out.println("Saldo cuenta1: " + cuenta1.getSaldoDisponible());
		System.out.println("Saldo cuenta2: " + cuenta2.getSaldoDisponible());
		
	}

}
