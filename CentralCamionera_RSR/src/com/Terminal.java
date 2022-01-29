package com;

import java.text.*;
import java.util.*;

public class Terminal {
	
	private String empresa;
	private List<Integer>asientos = new ArrayList<>();
	private List<String>estados = new ArrayList<>();
	
	public Terminal(String empresa) {
		this.empresa = empresa;
	}
	
	public void llenarEstados() {
		
		estados.add("Puebla");
		estados.add("Veracruz");
		estados.add("Oaxaca");
		estados.add("Moterrey");
		estados.add("Tlaxcala");
		estados.add("Tabasco");
		
	}
	
	public void setEstados(String estado) {
		this.estados.add(estado);
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public List<String> getEstados(){
		return estados;
	}
	
	public List<Integer> getAsientos(){
		return asientos;
	}
	
	@Override
	public String toString() {
		return "Terminal [empresa=" + empresa + ", asientos=" + asientos + ", estados=" + estados + "]";
	}
	

}
