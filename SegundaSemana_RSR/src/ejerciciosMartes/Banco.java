package ejerciciosMartes;

import java.util.Date;

public class Banco {
	
	private String nombre;
	private String domicilio;
	private String clave;
	private int contCuenta;
	
	public Banco(String nombre, String domicilio, String clave) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.clave = clave;
		this.contCuenta = 0;
	}
	
	//getters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public String getClave() {
		return clave;
	}
	
	
	//setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	//methods
	
	public Object crearCuentaDebito(Cliente cliente) {
		
		if(cliente.getEdad() >= 18 && cliente.getEdad() <= 100) {
			
			return new Cuenta(Integer.toString(contCuenta++),"0000", new Date(), true, 2000, cliente, 150.0, 10000.0);
			
		}else {
			return "Fuera de la edad";
		}
	}
	
	
}


