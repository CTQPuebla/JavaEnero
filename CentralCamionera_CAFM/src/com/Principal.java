package com;
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Autobus> autobuses = new ArrayList<>();
		int numCliente = 0, numAsiento = 0;
		HashMap<String, Boleto> hs = new HashMap<String, Boleto>();
		Mensaje m = new Mensaje();
		
		//Cliente
		Cliente cliente1 = new Cliente(++numCliente, "Luis", "Pérez", "Reyes", "5512345678", "luispr@gmail.com");
		Cliente cliente2 = new Cliente(++numCliente, "María", "González", "Montejo", "9987654321", "mariagm@outlook.com");
		Cliente cliente3 = new Cliente(++numCliente, "Gertrudis", "de la Vega", "Cortázar", "2298723456", "g.delav.c@gmail.com");
		//Origen
		Origen or1 = new Origen("Acapulco", "Guerrero");
		Origen or2 = new Origen("Mérica","Yucatán");
		Origen or3 = new Origen("Puebla","Puebla");
		//Destino
		Destino dest1 = new Destino("Veracruz", "Veracruz");
		Destino dest2 = new Destino("Pachuca","Hidalgo");
		Destino dest3 = new Destino("Morelia","Michoacan");
		//Ejecutivos
		Autobus ab1 = new Autobus("001", "ejecutivo", 20, false, false, true, true, true, false);
		Autobus ab2 = new Autobus("002", "ejecutivo", 18, false, false, true, true, true, false);
		//Diamantes
		Autobus ab3 = new Autobus("101", "diamante", 16, true, true, true, true, true, true);
		Autobus ab4 = new Autobus("101", "diamante", 14, true, true, true, true, true, true);
		
		autobuses.add(ab1);
		autobuses.add(ab2);
		autobuses.add(ab3);
		autobuses.add(ab4);
		
		Viaje v1 = new Viaje(or1, dest1, crearFecha(28,1,2002,10,0), crearFecha(28,1,2002,15,30), ab1, 650);
		Viaje v2 = new Viaje(or1, dest1, crearFecha(28,1,2002,13,0), crearFecha(28,1,2002,18,30), ab2, 670);
		Viaje v3 = new Viaje(or2, dest1, crearFecha(28,1,2002,16,30), crearFecha(28,1,2002,22,00), ab3, 800);
		
		LineaBus ado = new LineaBus("ADO", autobuses);
		System.out.println(ado.getNombre());
		for(int i=0;i<ado.getAutobuses().size();i++) {
			System.out.println(ado.getAutobuses().get(i));
		}
		
		System.out.println("");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println("");
		numAsiento = 4;
		System.out.println(cliente1.nombreCompleto());
		System.out.println(cliente1);
		System.out.println("Asiento seleccionado: "+numAsiento);
		m =(Mensaje) v2.seleccionarAsiento(numAsiento);
		if(m.getNumeroError()==1) {
			System.out.println(m.getMensajeTexto());
			Boleto boleto1 = new Boleto(cliente1, v2.getOrigen().getOrigen(), v2.getDestino().getDestino(), v2.getSalida(), v2.getLlegada(), numAsiento, v2.getPrecio());
			hs.put(boleto1.getCliente().nombreCompleto(), boleto1);
			System.out.println(v2.getAutobus());
		}else {
			System.out.println(m.getMensajeTexto());	
		}
		
		System.out.println("");
		numAsiento = 11;
		System.out.println(cliente2.nombreCompleto());
		System.out.println(cliente2);
		System.out.println("Asiento seleccionado: "+numAsiento);
		m =(Mensaje) v2.seleccionarAsiento(numAsiento);
		if(m.getNumeroError()==1) {
			System.out.println(m.getMensajeTexto());
			Boleto boleto1 = new Boleto(cliente2, v2.getOrigen().getOrigen(), v2.getDestino().getDestino(), v2.getSalida(), v2.getLlegada(), numAsiento, v2.getPrecio());
			hs.put(boleto1.getCliente().nombreCompleto(), boleto1);
			System.out.println(v2.getAutobus());
		}else {
			System.out.println(m.getMensajeTexto());	
		}
		
		System.out.println("");
		numAsiento = 4;
		System.out.println(cliente3.nombreCompleto());
		System.out.println(cliente3);
		System.out.println("Asiento seleccionado: "+numAsiento);
		m =(Mensaje) v2.seleccionarAsiento(numAsiento);
		if(m.getNumeroError()==1) {
			System.out.println(m.getMensajeTexto());
			Boleto boleto1 = new Boleto(cliente3, v2.getOrigen().getOrigen(), v2.getDestino().getDestino(), v2.getSalida(), v2.getLlegada(), numAsiento, v2.getPrecio());
			hs.put(boleto1.getCliente().nombreCompleto(), boleto1);
			System.out.println(v2.getAutobus());
		}else {
			System.out.println(m.getMensajeTexto());	
		}
		
		System.out.println("");
		System.out.println(hs);
		
	}
	
	@SuppressWarnings("deprecation")
	public static Date crearFecha(int dia, int mes, int año, int hora, int minutos) {
		Date date = new Date();
		date.setYear(año);
		date.setMonth(mes);
		date.setDate(dia);
		date.setHours(hora);
		date.setMinutes(minutos);
		return date;
	}
}
