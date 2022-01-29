package evaluacion;

public abstract class TrabajadorDeHospital {
	private String nombre, domicilio, puestoDeTrabajo;
	private int edad;
	private final int numeroEmpleado;
	public static int ultimoNumeroEmpleado = 0;

	public TrabajadorDeHospital(String nombre, int edad, String domicilio) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
		this.numeroEmpleado = ultimoNumeroEmpleado + (int)Math.floor(Math.random()*10);
		ultimoNumeroEmpleado = this.numeroEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getPuestoDeTrabajo() {
		return puestoDeTrabajo;
	}

	public void setPuestoDeTrabajo(String puestoDeTrabajo) {
		this.puestoDeTrabajo = puestoDeTrabajo;
	}
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public abstract void showResponsabilities();
}
