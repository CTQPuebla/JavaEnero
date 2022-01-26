package com;

public class Cliente {
	
	private int id;
	private String nombre;
	private String rfc;
	private String domicilio;
	private String correo;
	private String telefono;
	private String edad;
	private String NomBeneficiario;
	
	public Cliente(int id, String nombre, String rfc, String domicilio, String correo, String telefono, String edad,
			String nomBeneficiario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rfc = rfc;
		this.domicilio = domicilio;
		this.correo = correo;
		this.telefono = telefono;
		this.edad = edad;
		NomBeneficiario = nomBeneficiario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNomBeneficiario() {
		return NomBeneficiario;
	}

	public void setNomBeneficiario(String nomBeneficiario) {
		NomBeneficiario = nomBeneficiario;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Banco [nombre =" + nombre +",domicilio="+domicilio+"]";
		
	}
 //comportamiento propio
	
//public Object crearCuentaDebito (Cliente c ) {
//	if (c.getEdad()>=18 && c.getEdad()<=65) {
//		return new Cuenta 
	//}
}

	
	

}
