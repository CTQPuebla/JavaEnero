package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class TrabajadorTerminal extends Persona implements Funciones{
	
	private String curp;
	private String nss;
	private String rfc;
	
	public TrabajadorTerminal(String nombre, int edad, String curp, String nss, String rfc) {
		super(nombre, edad);
		this.curp = curp;
		this.nss = nss;
		this.rfc = rfc;
	}
	public String getCURP() {
		return curp;
	}
	public void setCURP(String curp) {
		this.curp = curp;
	}
	public String getNSS() {
		return nss;
	}
	public void setNSS(String nss) {
		this.nss = nss;
	}
	public String getRFC() {
		return rfc;
	}
	public void setRFC(String rfc) {
		this.rfc = rfc;
	}
	
	
	@Override
	public String toString() {
		return "TrabajadorTerminal [curp=" + curp + ", nss=" + nss + ", rfc=" + rfc + ", nombre=" + getNombre()
				+ ", edad=" + getEdad() + "]";
	}
	
	
	
	
	//metodo de interface - contrato
	@Override
	public void recibirCliente(Terminal terminal, Cliente cliente) {
		
		//asientos.add(1);
				//System.out.println("lista: " + asientos.indexOf(1));
				
				//System.out.println("Destino: " + cliente.getDestino());
				//System.out.println("destino cliente: " + estados.contains(cliente.getDestino()));
				if(terminal.getEstados().contains(cliente.getDestino())) {
					System.out.println("estado disponible");
					
					double total = 0.0;
					double precio = 1000.0;
					String tipo = "";
					
					if(terminal.getAsientos().indexOf(cliente.getAsiento()) == -1) {
						System.out.println("asiento libre");
						
						//System.out.println("edad: " + cliente.getEdad());
						
						if(17 >= cliente.getEdad()) {
							total = precio - (precio * 0.5);//descuento niño
							tipo = "Medio";
						}else {
							
							if(cliente.getIsEstudiante()) {
								total = precio - (precio * 0.2);//descuento estudiante
								tipo = "Entero";
							}else {
								//adulto
								total = precio ;
								tipo = "Entero";
							}
						}
						
						DateFormat formatoFecha = new SimpleDateFormat("yyyy-mm-dd");  
		                String fecha = formatoFecha.format(cliente.getFechaSalida());
		                
		                DateFormat formatoHora = new SimpleDateFormat("hh:mm");  
		                String hora = formatoHora.format(cliente.getFechaSalida());
		                
						
						//String empresa, Date fechaSalida, int asiento, boolean isEstudiante, double precio, String origen,String destino, String tipo, String formaPago
						Boleto boleto = new Boleto(cliente.getNombre(), cliente.getEdad(),terminal.getEmpresa(), fecha, hora, cliente.getAsiento(), cliente.getIsEstudiante(), total, cliente.getOrigen(), cliente.getDestino(), tipo);
						
						System.out.println("total a pagar por el cliente: " + total);
						System.out.println(boleto);
						
						
						//creacion de tabla hash
						
						System.out.println("Tabla hash");
						HashMap<String, Boleto> boletos = new HashMap<String, Boleto>();
						boletos.put(cliente.getNombre(), boleto);
						System.out.println(boletos);
						
						
					}else {
						System.out.println("asiento ocupado");
					}
				}else {
					System.out.println("no hay salidas ha ese estado");
				}
	}

}
