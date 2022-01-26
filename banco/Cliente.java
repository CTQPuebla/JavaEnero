package banco;

public class Cliente {
	
	private int id;
	private String nombre;
	private String rfc;
	private String domicilio;
	private String telefono;
	private int edad;
	
	public Cliente(int id, String nombre, String rfc, String domicilio, String telefono, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rfc = rfc;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.edad = edad;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", rfc=" + rfc + ", domicilio=" + domicilio + ", telefono="
				+ telefono + ", edad=" + edad + "]";
	}
	

}
