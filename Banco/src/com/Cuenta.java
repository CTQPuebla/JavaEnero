package com;

import java.util.Date;

public class Cuenta {

	private String numcuenta;
	private String nip;
	private Date fechaapertura;
	private boolean status;
	private double saldodisponible;
	private Cliente cliente;
	
	private double max;
	private double min;
	

	
	public Cuenta(String numcuenta, String nip, Date fechaapertura, boolean status, double saldodisponible,
			Cliente cliente, double max, double min) {
		super();
		this.numcuenta = numcuenta;
		this.nip = nip;
		this.fechaapertura = fechaapertura;
		this.status = status;
		this.saldodisponible = saldodisponible;
		this.cliente = cliente;
		this.max = max;
		this.min = min;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public Date getFechaapertura() {
		return fechaapertura;
	}
	public void setFechaapertura(Date fechaapertura) {
		this.fechaapertura = fechaapertura;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getSaldodisponible() {
		return saldodisponible;
	}
	public void setSaldodisponible(double saldodisponible) {
		this.saldodisponible = saldodisponible;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public String getNumcuenta() {
		return numcuenta;
	}
	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numcuenta + ", nip=" + nip + ", fechaapertura=" + fechaapertura + ", status="
				+ status + ", saldodisponible=" + saldodisponible + ", cliente=" + cliente + "]";
	}
	
	
	public Object retirar(Cuenta origen, double monto)
	{
		if(origen.getSaldodisponible() > 0)
		{
			if((origen.getSaldodisponible() - monto) < origen.getMin())
			{
				return "El retiro dejaria sin saldo suficiente a la cuenta";
			}
			else {
				origen.setSaldodisponible(origen.getSaldodisponible() - monto);
				return new Comprobante(new Date(), origen.getNumcuenta(), monto, 0);
			}

		}
		else {
			return "El saldo es insuficiente";
		}
		
		
	}
	
	
	public Object depositar(Cuenta destino, double monto)
	{
		//status, monto que no sea cero, que no sea mayor al maximo por si solo
		//que  el monto + saldodisonible no sea mayor
		
		if(destino.isStatus() && (destino.getSaldodisponible() + monto) <= destino.getMax())
		{
			destino.setSaldodisponible(destino.getSaldodisponible()+monto);
			return new Comprobante(new Date(), destino.getNumcuenta(), monto, 0);
			
		}
		
		else {
			return "La cuenta esta inactiva o el deposito excede el maximo permitido en la cuenta";
		}		
	}

	public Object transferir(Cuenta origen, Cuenta destino, double monto)
	{
		
		if(this.status && destino.isStatus())
		{
			if((this.saldodisponible = monto) < this.min)
			{
				return "La transeferencia dejara sin saldo a la cuenta";
				
			}
			else if(destino.getMax()<monto || (destino.getSaldodisponible() + monto) > destino.getMax())
			{
				return "La transferencia excede el maximo permitodo en la cuenta";
			}
			else {
				this.setSaldodisponible(this.getSaldodisponible() - monto);
				destino.setSaldodisponible(destino.getSaldodisponible()+monto);
				return new Comprobante(new Date(), this.numcuenta, monto, 0);
			}
		}
		
		return null;
	}
	
	
	
	
}
