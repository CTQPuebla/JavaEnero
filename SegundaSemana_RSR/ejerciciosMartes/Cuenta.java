package ejerciciosMartes;

import java.util.Date;

public class Cuenta {
	
	private String numeroCuenta;
	private String NIP;
	private Date fechaApertura;
	private boolean status;
	private double saldoDisponible;
	private Cliente cliente;
	private double maximo, minimo;
	
	public Cuenta(String numeroCuenta, String NIP, Date fechaApertura, boolean status, int saldoDisponible, Cliente cliente, double minimo, double maximo) {
		
		this.numeroCuenta = numeroCuenta;
		this.NIP = NIP;
		this.fechaApertura = fechaApertura;
		this.status = status;
		this.saldoDisponible = saldoDisponible;
		this.cliente = cliente;
		this.minimo = minimo;
		this.maximo = maximo;
		
	}
	
	//getters
	
	public double getMaximo() {
		return maximo;
	}
	
	public double getMinimo() {
		return minimo;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public String getNIP() {
		return NIP;
	}
	
	public Date getFechaApertura() {
		return fechaApertura;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public double getSaldoDisponible() {
		return saldoDisponible;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public String toString() {
		return "numero de cuenta: " + numeroCuenta + "NIP: " + NIP + " fecha de apertura: " + fechaApertura + " status: " + status + " saldo disponible: " + saldoDisponible;
	}
	
	//setters
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void setNIP(String NIP) {
		this.NIP = NIP;
	}
	
	public void setFechaApertura(Date fechaApertura) {
		this.fechaApertura = fechaApertura;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	
	
	//methods
	
	public Object retirar(Cuenta origen, double monto) {
		
		if(origen.getSaldoDisponible() > 0) {
			if((origen.getSaldoDisponible() - monto) < origen.getMinimo()) {
				
				return "retiro dejaria sin saldo suficiente a la cuenta";
			}else {
				origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
				return new Comprobante(new Date(), origen.getNumeroCuenta(), monto, 0);
			}
	
		}else {
			return "Sin saldo disponible";
		}
		
	}
	
	public Object depositar(Cuenta destino, double monto) {
		//status, monto que no sea cero, que no sea mayor al maximo por si solo
		//que el monto + saldoDisponible no sea mayor
		
		if(destino.getStatus() && ((destino.getSaldoDisponible() + monto) <= destino.getMaximo())) {
			//deposito
			destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);
			return new Comprobante(new Date(), destino.getNumeroCuenta(), monto, 0);
		}else {
			return "La cuenta inactiva o el deposito excede el maximo permitido en la cuenta";
		}
		
	}
	
	public Object transferir(Cuenta destino, double monto) {
		
		if(this.status && destino.getStatus()) {
			if((this.saldoDisponible - monto) < this.minimo) {
			return "la transferencia dejaria sin saldo suficiente a la cuenta";
		}else if(destino.getMaximo() < monto || (destino.getSaldoDisponible() + monto) > destino.getMaximo()) {
			return "La transferencia excede el maximo permitido en la cienta";
		}else {
			
			this.setSaldoDisponible(this.getSaldoDisponible() - monto);
			destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);
			
			return new Comprobante(new Date(), this.numeroCuenta, monto, 0);
		
	}
	}else {
		return "operacion no realizada. Al menos una de las cuentas esta inactiva";
	}
}
	
	
	
	
	
	
	
	

}
