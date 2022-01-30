package Modelo;

public class Direccion {
	private Estado estado;
	private String ciudad;
	private String cp;
	private String calle;
	private int numero;
	
	public Direccion(Estado estado, String ciudad, String cp, String calle, int numero) {
		this.estado = estado;
		this.ciudad = ciudad;
		this.cp = cp;
		this.calle = calle;
		this.numero = numero;
	}

	public Direccion(Estado estado, String ciudad, String cp, String calle) {
		this.estado = estado;
		this.ciudad = ciudad;
		this.cp = cp;
		this.calle = calle;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
