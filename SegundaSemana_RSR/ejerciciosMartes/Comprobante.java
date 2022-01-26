package ejerciciosMartes;

import java.util.Date;

public class Comprobante {

	private Date fecha;
	private String numeroCuenta;
	private double retiro;
	private int numeroOperacion;
	
	public Comprobante(Date fecha, String numeroCuenta, double retiro, int numeroOperacion) {
		this.fecha = fecha;
		this.numeroCuenta = numeroCuenta;
		this.retiro = retiro;
		this.numeroOperacion = numeroOperacion;
	}
	
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getRetiro() {
		return retiro;
	}

	public void setRetiro(double retiro) {
		this.retiro = retiro;
	}

	public int getNumeroOperacion() {
		return numeroOperacion;
	}

	public void setNumeroOperacion(int numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}


	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", numeroCuenta=" + numeroCuenta + ", retiro=" + retiro
				+ ", numeroOperacion=" + numeroOperacion + "]";
	}
	
	
	
}
