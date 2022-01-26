package com;

import java.util.Date;

public class Cuenta {
	private String numCuenta, nip;
	private Date fechaApertura;
	private boolean status;
	private double saldoDisponible,minimo, maximo;
	private Cliente cliente;

	public Cuenta(String numCuenta, String nip, Date fechaApertura, boolean status, double saldoDisponible,
			double minimo, double maximo, Cliente cliente) {
		super();
		this.numCuenta = numCuenta;
		this.nip = nip;
		this.fechaApertura = fechaApertura;
		this.status = status;
		this.saldoDisponible = saldoDisponible;
		this.minimo = minimo;
		this.maximo = maximo;
		this.cliente = cliente;
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

	public double getMinimo() {
		return minimo;
	}

	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}

	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", nip=" + nip + ", fechaApertura=" + fechaApertura + ", status="
				+ status + ", saldoDisponible=" + saldoDisponible + ", cliente=" + cliente + "]";
	}
	 /* Retirar
	  * Depositar
	  * Transferir
	  */
	
	public Object retirar(Cuenta origen, double monto) {
		//Revisar status
		if(origen.isStatus()) {
			//mínimo, máximo y saldo disponible
			if(origen.getSaldoDisponible() > 0) {
				if((origen.getSaldoDisponible()-monto)<origen.getMinimo()) {
					return "Monto mayor al mínimo permitido en la cuenta";
				} else {
					origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
					return new Comprobante(new Date(), origen.getNumCuenta(), monto, 0);
				}
			} else {
				return "Saldo insuficiente";
			}
		} else {
			return "La cuenta no está activa";
		}
	}
	
	public Object depositar(Cuenta destino, double monto) {
		//status, monto que sea mayor a 0 y menor o igual al maximo, y monto mas saldo menor o igual al máximo
		if(destino.isStatus()) {
			if(monto>0) {
				if((destino.getSaldoDisponible()+monto) > destino.getMaximo()) {
					return "El saldo final no puede ser mayor al máximo permitido por la cuenta";
				} else {
					destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
					return new Comprobante(new Date(), destino.getNumCuenta(), monto, 0);
				}
			} else {
				return "El monto debe ser mayor a $0";
			}
		} else {
			return "La cuenta no está activa";
		}
	}
	
	public Object trasnferir(Cuenta destino, double monto) {
		if(this.status && destino.isStatus()) {
			if((this.saldoDisponible - monto)<this.minimo) {
				return "El monto excede el saldo mínimo de la cuenta";
			} else if(destino.getMaximo()<monto || (destino.getSaldoDisponible()+monto)>destino.getMaximo()){
				return "La transferencia exccede el saldo máximo permitido en la cuenta";
			} else {
				this.setSaldoDisponible(this.getSaldoDisponible()-monto);
				destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
				return new Comprobante(new Date(), this.numCuenta, monto, 0);
			}
		} else {
			return "Operación no realizada, una o ambas cuentas no están activas";
		}
	}
}
