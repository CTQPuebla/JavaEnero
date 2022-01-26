import java.util.Date;

public class Cuenta {
	private String numCuenta;
	private String nip;
	private Date fechaapertura;
	private boolean status;
	private double saldoDisponible;
	private Cliente cliente;	
	
public Cuenta(String numCuenta, String nip, Date fechaapertura, boolean status, double saldoDisponible,
			Cliente cliente, double min, double max) {
		super();
		this.numCuenta = numCuenta;
		this.nip = nip;
		this.fechaapertura = fechaapertura;
		this.status = status;
		this.saldoDisponible = saldoDisponible;
		this.cliente = cliente;
		this.min = min;
		this.max = max;
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

public double getSaldoDisponioble() {
	return saldoDisponible;
}

public void setSaldoDisponioble(double saldoDisponioble) {
	this.saldoDisponible = saldoDisponioble;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

private double min, max;	
	
	public double getSaldoDisponible() {
	return saldoDisponible;
}
public void setSaldoDisponible(double saldoDisponible) {
	this.saldoDisponible = saldoDisponible;
}
public double getMin() {
	return min;
}
public void setMin(double min) {
	this.min = min;
}
public double getMax() {
	return max;
}
public void setMax(double max) {
	this.max = max;
}



	@Override
public String toString() {
	return "Cuenta [numCuenta=" + numCuenta + ", nip=" + nip + ", fechaapertura=" + fechaapertura + ", status=" + status
			+ ", saldoDisponible=" + saldoDisponible + ", cliente=" + cliente + "]";
}
	public Object retirar (Cuenta origen, double monto){
		//minimo, maximo, saldoDisponible
		
		if(origen.isStatus()) {
			if((origen.getSaldoDisponible()-monto)<origen.getMin()) {
				return "El retiro dejaria sin saldo suficiente a la cuenta";
			}else {
				origen.setSaldoDisponible(origen.getSaldoDisponible()- monto);
				return new Comprobante (new Date(),origen.getNumCuenta(),monto,0);
			}			
		}else {
			return "Sin saldo Disponible";
		}		 	
	 }
	public Object depositar(Cuenta destino, double monto) {
		// status, monto que no sea cero, que no sea mayor al maximo por si solo
		//que el monto + saldo disponible no se mayor.
		
		if(destino.isStatus()){
			if (monto>0) {
				if((destino.getSaldoDisponible()+monto) > destino.getMax()) {
					return "El saldo final no puede ser mayor al máximo permitido por la cuenta";
				} else {
					destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
					return new Comprobante(new Date(), destino.getNumCuenta(), monto, 0);
				}
			} else {
				return "El monto debe ser mayor a $0";
			}	
		}else {
			return "La cuenta no está activa";
		}
	}
	public Object transferir(Cuenta destino, double monto) {
		if (this.status && destino.isStatus()) {
			if((this.saldoDisponible - monto ) < this.min) {
				return "la transferencia dejaria sin saldo suficiente a la cuenta";				
			}
			else if (destino.getMax()< monto || (destino.getSaldoDisponioble()+ monto)>  destino.getMax()) {
				return "la transferencia excede el maximo permitido en la cuenta";				
			}else {
				this.setSaldoDisponioble(this.getSaldoDisponioble()- monto);
				destino.setSaldoDisponioble(destino.getSaldoDisponioble()+monto);
				
				return new Comprobante(new Date(), this.numCuenta,monto,0);
			}
		}else {
			return "Operacion no realizada. Al menos una de las cuentas esta inactiva";
		}
	}
}
 