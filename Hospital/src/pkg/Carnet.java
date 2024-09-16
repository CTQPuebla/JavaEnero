package pkg;


public class Carnet {
	
	String nombrePaciente, numCarnet, direccionPaciente, telefonoPaciente, contactoEmergencia;

	public Carnet(String nombrePaciente, String numCarnet, String direccionPaciente, String telefonoPaciente,
			String contactoEmergencia) {
		super();
		this.nombrePaciente = nombrePaciente;
		this.numCarnet = numCarnet;
		this.direccionPaciente = direccionPaciente;
		this.telefonoPaciente = telefonoPaciente;
		this.contactoEmergencia = contactoEmergencia;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getNumCarnet() {
		return numCarnet;
	}

	public void setNumCarnet(String numCarnet) {
		this.numCarnet = numCarnet;
	}

	public String getDireccionPaciente() {
		return direccionPaciente;
	}

	public void setDireccionPaciente(String direccionPaciente) {
		this.direccionPaciente = direccionPaciente;
	}

	public String getTelefonoPaciente() {
		return telefonoPaciente;
	}

	public void setTelefonoPaciente(String telefonoPaciente) {
		this.telefonoPaciente = telefonoPaciente;
	}

	public String getContactoEmergencia() {
		return contactoEmergencia;
	}

	public void setContactoEmergencia(String contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}
	
	@Override
	public String toString() {
		return "\n [Nombre del paciente: " + nombrePaciente + ", # de carnet: " + numCarnet + ", domicilio: " + direccionPaciente + ", telefono del paciente: "
				+ telefonoPaciente + ", Contacto en caso de emergencia: " + contactoEmergencia + "]";

	
	
	}
	
	
	
		
	
	


}
