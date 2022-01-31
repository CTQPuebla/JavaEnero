package com;

import java.util.Date;
import java.util.HashMap;

public class AutobusClaseAlta extends Autobus{
	
	int wifi;
	int velocidades=60;
	double valorClase2=50;
	
	int kilom;
	double precio;
	String destino;
	HashMap<String ,Ciudad>hs;
	int tiempoLLegada;
	double p;
	
	
	public AutobusClaseAlta(int numPlaca, String horaDeSalida, Conductor conductor, int wifi, HashMap<String ,Ciudad>hs,String destino) {
		super(numPlaca, horaDeSalida, conductor);
		this.wifi = wifi;
		this.hs=hs;
		this.destino=destino;
		precio=precios(valorClase2);
	}

	

	public int getWifi() {
		return wifi;
	}



	public void setWifi(int wifi) {
		this.wifi = wifi;
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
		return "AutobusClaseAlta [wifi=" + wifi + ", numPlaca=" + numPlaca + ", numeroDeSalida=" + horaDeSalida
				+ ", conductor=" + conductor +",precio="+precio+ "]";
	}
	
	

}
