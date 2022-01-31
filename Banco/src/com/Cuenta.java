package com;

import java.util.Date;

public class Cuenta {
private String numCuenta;
private String nip;
private Date fechaApertura;
private boolean status;
private double saldoDisponible;
private Cliente cliente;
private double max,min;




public Cuenta(String numCuenta, String nip, Date fechaApertura, boolean status, double saldoDisponible, Cliente cliente,
		double max, double min) {
	super();
	this.numCuenta = numCuenta;
	this.nip = nip;
	this.fechaApertura = fechaApertura;
	this.status = status;
	this.saldoDisponible = saldoDisponible;
	this.cliente = cliente;
	this.max = max;
	this.min = min;
}

public String getNumCuenta() {
	return numCuenta;
}

public void setNumCuenta(String numCuenta) {
	this.numCuenta = numCuenta;
}

public String getNip() {
	return nip;
}

public void setNip(String nip) {
	this.nip = nip;
}

public Date getFechaApertura() {
	return fechaApertura;
}

public void setFechaApertura(Date fechaApertura) {
	this.fechaApertura = fechaApertura;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}

public double getSaldoDisponible() {
	return saldoDisponible;
}

public void setSaldoDisponible(double saldoDisponible) {
	this.saldoDisponible = saldoDisponible;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
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
	return "Cuenta [numCuenta=" + numCuenta + ", nip=" + nip + ", fechaApertura=" + fechaApertura + ", status=" + status
			+ ", saldoDisponible=" + saldoDisponible + ", cliente=" + cliente + ", max=" + max + ", min=" + min + "]";
}

public Object retirar(Cuenta origen, double monto) {
	
	if(origen.getSaldoDisponible()>0) {
		if((origen.getSaldoDisponible()-monto)<origen.getMin()){
			return "el retiro dejaria sin saldo suficiente a la cuenta";
			
		}else {
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
			return new Comprobante(new Date(),origen.getNumCuenta(), monto,0);
		}
	}else {
		return "sin saldo disponible";
	}
	
}

public Object depositar(Cuenta destino,double monto) {
	if(destino.isStatus()&&(destino.getSaldoDisponible()+monto)<=destino.getMax()) {
	destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
		return new Comprobante(new Date(),destino.getNumCuenta(),monto,0);
	}else {
		return "la cuenta esta inactiva o el deposito excede el maximo permitido";
	}

}

public Object tranferir(Cuenta destino,double monto) {
	if(this.status&& destino.isStatus()) {
		
		if((this.saldoDisponible-monto)<this.min){
			return "la transferencia dejaria sin saldo suficiente a la cuenta";
		
		}else if(destino.getMax()<monto||(destino.getSaldoDisponible()+monto)>destino.getMax()) {
	return "la transferencia excede el maximo permitido en la cuenta";
	
	}else {
		
		this.setSaldoDisponible(this.getSaldoDisponible()-monto);
		destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
		return new Comprobante(new Date(),this.numCuenta,monto,0);
	}}else {
	return "operacion no reslizada. al menos una de las cunetas estan acativas";
}
}

}