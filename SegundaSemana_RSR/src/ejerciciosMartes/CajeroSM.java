package ejerciciosMartes;

public class CajeroSM {
	
	private String nombre;
	private String domicilio;
	private String telefono;
	
	public CajeroSM(String nombre, String domicilio, String telefono) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}
	
	//getters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	
	public String toString() {
		return "nombre: " + nombre + " domicilio: " + domicilio +" telefono: " + telefono;
	} 
	
	//setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	//methods
	
	public void cobrar(ClienteSM cliente) {
		//tomar pago
		MaquinaSM maquina = new MaquinaSM("serial - 1");
		maquina.getTotal(cliente);
		
	}
	
	
}
