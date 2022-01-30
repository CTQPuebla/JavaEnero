package Modelo;

public class Contacto {
	private String tipo;
	private String contacto;
	
	public Contacto(String tipo, String contacto) {
		this.tipo = tipo;
		this.contacto = contacto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
}
