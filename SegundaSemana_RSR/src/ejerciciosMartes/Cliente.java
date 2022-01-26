package ejerciciosMartes;

public class Cliente {
	
	private String nombre;
	private String RFC;
	private String domicilio;
	private String correo;
	private String telefono;
	private int edad;
	private String nombreBeneficiario;
	
	public Cliente(String nombre, String RFC,String domicilio, String correo, String telefono, int edad, String nombreBeneficiario) {
		this.nombre = nombre;
		this.RFC = RFC;
		this.domicilio = domicilio;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
		this.nombreBeneficiario = nombreBeneficiario;
	}
	
	//getters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getRFC() {
		return RFC;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	
	public int getEdad() {
		return edad;
	}
	
	//setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setRFC(String RFC) {
		this.RFC = RFC;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
