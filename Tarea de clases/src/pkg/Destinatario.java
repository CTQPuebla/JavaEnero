package pkg;


public class Destinatario {

	String nombreDestinatario , direccionDestinatario ;
	int fechaEnvio;
	Paquete folioEnvio;
	public Destinatario(String nombreDestinatario, String direccionDestinatario, Date fechaEnvio, Paquete folioEnvio) {
		super();
		this.nombreDestinatario = nombreDestinatario;
		this.direccionDestinatario = direccionDestinatario;
		this.fechaEnvio = fechaEnvio;
		this.folioEnvio = folioEnvio;
	}
	public String getNombreDestinatario() {
		return nombreDestinatario;
	}
	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = nombreDestinatario;
	}
	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}
	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
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
		return "Destinatario [nombreDestinatario=" + nombreDestinatario + ", direccionDestinatario="
				+ direccionDestinatario + ", fechaEnvio=" + fechaEnvio + ", folioEnvio=" + folioEnvio + "]";
	}
	
	
	
	
	
}
