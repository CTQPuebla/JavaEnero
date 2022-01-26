package Modelo;

public class Jugador {
	private char marca;
	private String nombre;
	private static int numero = 0;
	
	public Jugador(char marca, String nombre) {
		this.marca = marca;
		this.nombre = nombre;
	}

	public Jugador(char marca) {
		this.numero++;
		if(this.numero <= 2) {
			this.nombre = "Jugador " + this.numero;
			this.marca = marca;
		}
	}

	public char getMarca() {
		return marca;
	}

	public String getNombre() {
		return nombre;
	}
}
