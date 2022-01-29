package evaluacion;

public class Expediente {
	final private String paciente;
	private String antecedentes, medicoAsignado, diagnostico, areaActual;
	private int cama;
	final private int ID;
	public static int lastId = 0;

	public Expediente(Paciente paciente, String antecedentes, Medico medicoAsignado, String diagnostico, String areaActual, int cama) {
		this.paciente = paciente.getNombre();
		this.antecedentes = antecedentes;
		this.medicoAsignado = medicoAsignado.getNombre();
		this.diagnostico = diagnostico;
		this.areaActual = areaActual;
		this.cama = cama;
		this.ID = lastId + (int)Math.floor(Math.random()*10);
		lastId += this.ID;
	}
	public String getPaciente() {
		return paciente;
	}
	public String getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}
	public String getMedicoAsignado() {
		return medicoAsignado;
	}
	public void setMedicoAsignado(String medicoAsignado) {
		this.medicoAsignado = medicoAsignado;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getAreaActual() {
		return areaActual;
	}
	public void setAreaActual(String areaActual) {
		this.areaActual = areaActual;
	}
	public int getCama() {
		return cama;
	}
	public void setCama(int cama) {
		this.cama = cama;
	}
	public int getID() {
		return new Integer(ID);
	}
	@Override
	public String toString() {
		return "Expediente [paciente=" + paciente + ", antecedentes=" + antecedentes + ", medicoAsignado="
				+ medicoAsignado + ", diagnostico=" + diagnostico + ", areaActual=" + areaActual + ", cama=" + cama
				+ ", ID=" + ID + "]";
	}
	
}
