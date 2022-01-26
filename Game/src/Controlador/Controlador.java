package Controlador;

import Modelo.Juego;
import Modelo.Jugador;

public class Controlador {
	private boolean estado;
	private Juego juego;
	private Jugador[] jugadores = new Jugador[2];
	private String enTurno;
	
	public Controlador(String jugador1, String jugador2) {
		juego = new Juego();
		estado = juego.isEstatus();
		if(!jugador1.equals(""))
			jugadores[0] = new Jugador('X', jugador1);
		else
			jugadores[0] = new Jugador('X');
		
		if(!jugador2.equals(""))
			jugadores[1] = new Jugador('O', jugador2);
		else
			jugadores[1] = new Jugador('O');
		
		this.enTurno = jugadores[0].getNombre();
	}
	
	public void pintarInterfaz() {
		System.out.println(this.juego.getInterfaz());
		System.out.println("Turno de "+ this.enTurno);
	}
	
	public void changeEnTurno() {
		if(this.enTurno.equalsIgnoreCase(jugadores[0].getNombre())) {
			this.enTurno = jugadores[1].getNombre();
		} else {
			this.enTurno = jugadores[0].getNombre();
		}
	}
	
	public boolean isActive() {
		return estado;
	}
}
