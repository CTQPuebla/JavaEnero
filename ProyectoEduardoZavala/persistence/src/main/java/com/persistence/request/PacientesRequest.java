package com.persistence.request;

import java.sql.Date;


public class PacientesRequest {

	private int pacienteId;
	private String nombre;
	private String app;
	private String apm;
	private String curp;
	private Date fechaNac;
	private String nss;
	private String sexo;
	private String tipoSangre;
	
	public PacientesRequest() {
		super();
	}

	public PacientesRequest(int pacienteId, String nombre, String app, String apm, String curp, Date fechaNac,
			String nss, String sexo, String tipoSangre) {
		super();
		this.pacienteId = pacienteId;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.curp = curp;
		this.fechaNac = fechaNac;
		this.nss = nss;
		this.sexo = sexo;
		this.tipoSangre = tipoSangre;
	}

	public int getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(int pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	@Override
	public String toString() {
		return "PacientesRequest [pacienteId=" + pacienteId + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm
				+ ", curp=" + curp + ", fechaNac=" + fechaNac + ", nss=" + nss + ", sexo=" + sexo + ", tipoSangre="
				+ tipoSangre + "]";
	}
	
	
	
	
}
