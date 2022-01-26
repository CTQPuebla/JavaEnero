package pkg;


public class Remitente {
	String nombreRemitente , direccionRemitente ; 
	int fechaEnvio;
	Paquete folioEnvio;
	public Remitente(String nombreRemitente, String direccionRemitente, int fechaEnvio, Paquete folioEnvio) {
		super();
		this.nombreRemitente = nombreRemitente;
		this.direccionRemitente = direccionRemitente;
		this.fechaEnvio = fechaEnvio;
		this.folioEnvio = folioEnvio;
	}
	public String getNombreRemitente() {
		return nombreRemitente;
	}
	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = nombreRemitente;
	}
	public String getDireccionRemitente() {
		return direccionRemitente;
	}
	public void setDireccionRemitente(String direccionRemitente) {
		this.direccionRemitente = direccionRemitente;
	}
	public int getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(int fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public Paquete getFolioEnvio() {
		return folioEnvio;
	}
	public void setFolioEnvio(Paquete folioEnvio) {
		this.folioEnvio = folioEnvio;
	}
	@Override
	public String toString() {
		return "Remitente [nombreRemitente=" + nombreRemitente + ", direccionRemitente=" + direccionRemitente
				+ ", fechaEnvio=" + fechaEnvio + ", folioEnvio=" + folioEnvio + "]";
	} 
	
	
}
