package ejerciciosMartes;

import java.util.List;

public class MaquinaSM {
	
	private String serial;
	
	public MaquinaSM(String serial) {
		this.serial = serial;
	}
	
	//getters
	public String getSerial() {
		return serial;
	}
	
	
	//setters
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	//methods	
	public double registrarProductos(ClienteSM cliente) {
		
		double total = 0.0;
		
		//suma de productos
		for(int i = 0;i < cliente.getProductos().size(); i++) {
			total = total + cliente.getProductos().get(i).getPrecio();
		}
		
		return total;
		
		//generar ticket, comprobante
		
	}
	
	//agua
	//luz
	
	public double registrarServicios(ClienteSM cliente) {
		return 0;
	}
	
	public double getTotal(ClienteSM cliente) {
		
		return registrarProductos(cliente) + registrarServicios(cliente);
	}



}
