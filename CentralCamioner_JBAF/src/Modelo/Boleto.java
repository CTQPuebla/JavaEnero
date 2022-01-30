package Modelo;

public class Boleto extends Reporte {
	private int folio;
	private String horario;
	private int numeroAsiento;
	private double precio;

	public Boleto(Cliente cliente, Central origen, Central destino, Autobus autobus, Ruta ruta, int folio,
			String horario, int numeroAsiento, double precio, Trabajador vendedor) {
		super(cliente, origen, destino, autobus, ruta, vendedor);
		this.folio = folio;
		this.horario = horario;
		this.numeroAsiento = numeroAsiento;
		this.precio = precio;
	}

	@Override
	public String generarReporte() {
		return ""
				+ "Folio: " + this.folio + ":"
				+ "\nCliente: " + super.cliente.getNombre() + " " + super.cliente.getPrimerApellido()
				+ "\nOrigen: " + super.origen.getNombre()
				+ "\nDestino: " + super.destino.getNombre()
				+ "\nHorario: " + this.horario
				+ "\nNumero de Autobus: " + super.autobus.getNumeroAutobus()
				+ "\nPrecio: " + this.precio
				+ "\nAsiento: " + this.numeroAsiento
				+ "\nRuta: " + super.ruta.getNombre();
	}
}
