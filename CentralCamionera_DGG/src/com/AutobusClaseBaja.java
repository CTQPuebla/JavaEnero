package com;

import java.util.Date;
import java.util.HashMap;

public class AutobusClaseBaja extends Autobus{
	int velocidades=50;
	double valorClase2=30;
	
	int kilom;
	double precio;
	String destino;
	HashMap<String ,Ciudad>hs;
	int tiempoLLegada;
	double p;
	
	
	
	public AutobusClaseBaja(int numPlaca, String numeroDeSalida, Conductor conductor, HashMap<String ,Ciudad>hs,String destino) {
		super(numPlaca, numeroDeSalida, conductor);
		this.hs=hs;
		this.destino=destino;
		precio=precios(valorClase2);
		
	}


	public  double precios(double valorClase2) {
		for(String k:hs.keySet()) {
			if(hs.get(k).nombre.equals(destino)) {
				kilom=hs.get(k).kilometro;
				double tiempo=kilom/velocidades;
				 precio=tiempo*valorClase2;
			}
		}return precio;
		
	}


	@Override
	public String toString() {
		return "AutobusClaseBaja [ numPlaca="+ numPlaca + ", horaDeSalida=" + horaDeSalida + ", conductor=" + conductor +",precio="+precio+ "]";
	}
	
	
}
