package com;

import java.util.*;

public class Autobus {
	String numAutobus, tipo;
	int numeroAsientos;
	boolean centroCarga, baños, asientosReclinables, aireAcondicionado, tv, wifi;
	List<Asiento> asientos;

	

	public Autobus(String numAutobus, String tipo, int numeroAsientos, boolean centroCarga, boolean baños,
			boolean asientosReclinables, boolean aireAcondicionado, boolean tv, boolean wifi) {
		super();
		this.numAutobus = numAutobus;
		this.tipo = tipo;
		this.numeroAsientos = numeroAsientos;
		this.centroCarga = centroCarga;
		this.baños = baños;
		this.asientosReclinables = asientosReclinables;
		this.aireAcondicionado = aireAcondicionado;
		this.tv = tv;
		this.wifi = wifi;
		this.asientos = new ArrayList<>();
		this.setAsientos(numeroAsientos);
	}

	public String getNumAutobus() {
		return numAutobus;
	}

	public void setNumAutobus(String numAutobus) {
		this.numAutobus = numAutobus;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public List<Asiento> getAsientos() {
		return asientos;
	}
	
	public boolean isCentroCarga() {
		return centroCarga;
	}

	public void setCentroCarga(boolean centroCarga) {
		this.centroCarga = centroCarga;
	}

	public boolean isBaños() {
		return baños;
	}

	public void setBaños(boolean baños) {
		this.baños = baños;
	}

	public boolean isAsientosReclinables() {
		return asientosReclinables;
	}

	public void setAsientosReclinables(boolean asientosReclinables) {
		this.asientosReclinables = asientosReclinables;
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	private void setAsientos(int numeroAsientos) {
		for(int i=1;i<=numeroAsientos;i++) {
			Asiento a = new Asiento(i);
			this.asientos.add(a);
		}
	}

	@Override
	public String toString() {
		String cadena = "";
		String caracteristicas = "";
		cadena = "Autobus " + numAutobus + ":\nTipo " + tipo + ", " + numeroAsientos + " asientos";
		cadena += "\n" + asientos;
		cadena += "\n";
//		centroCarga, baños, asientosReclinables, aireAcondicionado, tv, wifi;
		if(centroCarga) {
			if(!caracteristicas.isEmpty()) {
				caracteristicas += ", ";
			}
			caracteristicas += "Centro de carga";
		}
		if(baños) {
			if(!caracteristicas.isEmpty()) {
				caracteristicas += ", ";
			}
			caracteristicas += "Baños";
		}
		if(asientosReclinables) {
			if(!caracteristicas.isEmpty()) {
				caracteristicas += ", ";
			}
			caracteristicas += "Asientos reclinables";
		}
		if(aireAcondicionado) {
			if(!caracteristicas.isEmpty()) {
				caracteristicas += ", ";
			}
			caracteristicas += "Aire acondicionado";
		}
		if(tv) {
			if(!caracteristicas.isEmpty()) {
				caracteristicas += ", ";
			}
			caracteristicas += "TV";
		}
		if(wifi) {
			if(!caracteristicas.isEmpty()) {
				caracteristicas += ", ";
			}
			caracteristicas += "Wifi";
		}
		cadena += caracteristicas;
		return cadena;
	}
	
}
