package ejerciciosMartes;

import java.util.List;

//cliente super mercado
public class ClienteSM {

	private String nombre;
	private double dinero;
	private String formaPago;
	private List<Producto> productos;
	
	public ClienteSM(String nombre, double dinero, String formaPago, List<Producto> productos) {
		this.nombre = nombre;
		this.dinero = dinero;
		this.formaPago = formaPago;
		this.productos = productos;
	}
	
	//getters
	
	public String getNombre() {
		return nombre;
	}
	
	public double getDinero() {
		return dinero;
	}
	
	public String formaPago() {
		return formaPago;
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	public String toString() {
		return "nombre: " + nombre + " dinero: " + dinero + " forma de pago: " + formaPago + "\n numero de productos: " + productos.size() + "\n productos: " + productos;
	}
	
	//setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
}
