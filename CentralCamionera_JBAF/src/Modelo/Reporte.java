package Modelo;

public abstract class Reporte {
	protected Cliente cliente;
	protected Central origen;
	protected Central destino;
	protected Autobus autobus;
	protected Ruta ruta;
	protected Trabajador vendedor;
	
	public Reporte(Cliente cliente, Central origen, Central destino, Autobus autobus, Ruta ruta, Trabajador vendedor) {
		this.cliente = cliente;
		this.origen = origen;
		this.destino = destino;
		this.autobus = autobus;
		this.ruta = ruta;
		this.vendedor = vendedor;
	}

	public abstract String generarReporte();
}
