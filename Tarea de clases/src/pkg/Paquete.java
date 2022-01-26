package pkg;


public class Paquete {
	
	int folioEnvio ;
	int fechaEnvio ;
	Destinatario desti;
	Remitente remi;
	
	public Paquete(int folioEnvio, int fechaEnvio, Destinatario dest , Remitente remi) {
		super();
		this.folioEnvio = folioEnvio;
		this.fechaEnvio = fechaEnvio;
		this.desti = dest;
		this.remi = remi;
	}
	
	public int getFolioEnvio() {
		return folioEnvio;
	}
	public void setFolioEnvio(int folioEnvio) {
		this.folioEnvio = folioEnvio;
	}
	public int getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(int fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	@Override
	public String toString() {
		return "Paquete [folioEnvio=" + folioEnvio + ", fechaEnvio=" + fechaEnvio + "]";
	}
	
	

}
