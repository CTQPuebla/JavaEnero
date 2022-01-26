package ejerciciosMartes;

public class Producto {

	private String nombre;
	private double precio;
	private String categoria;
	private String codigoBarras;
	
	public Producto(String nombre, double precio, String categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
		this.codigoBarras = getCB();
	}
	
	
	//getters
	private String getCB() {
		String codigoBarras = "";
		
		for(int i = 0; i < 12; i++){
			
			codigoBarras = codigoBarras + (int)(Math.random() * 9);
		}
		
		return codigoBarras;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String setCategoria() {
		return categoria;
	}
	
	public String toString() {
		return "nombre: " + nombre + " precio: " + precio + " categoria: " + categoria + " codigo de barras: " + codigoBarras;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre + nombre;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
