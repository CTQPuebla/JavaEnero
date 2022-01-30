package Modelo;

public class Autobus {
	private int numeroAutobus;
	private String clase;
	private int numeroAsientos;
	private int[] asientos;
	private int asientosOcupados;
	private Trabajador chofer;
	
	public Autobus(int numeroAutobus, String clase, int numeroAsientos, int[] asientos, int asientosOcupados, Trabajador chofer) {
		this.numeroAutobus = numeroAutobus;
		this.clase = clase;
		this.numeroAsientos = numeroAsientos;
		this.asientos = asientos;
		this.asientosOcupados = asientosOcupados;
		this.chofer = chofer;
	}

	public int getNumeroAutobus() {
		return numeroAutobus;
	}

	public void setNumeroAutobus(int numeroAutobus) {
		this.numeroAutobus = numeroAutobus;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public int[] getAsientos() {
		return asientos;
	}

	public void setAsientos(int asiento) {
		this.asientos[asiento] = asiento;
		this.asientosOcupados++;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public Trabajador getChofer() {
		return chofer;
	}

	public void setChofer(Trabajador chofer) {
		this.chofer = chofer;
	}
}
