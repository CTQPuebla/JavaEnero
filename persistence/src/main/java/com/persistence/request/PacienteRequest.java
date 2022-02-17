package com.persistence.request;

import java.sql.Date;
import java.util.Calendar;

//POJO
public class PacienteRequest {
	
	int pacienteId;
	String nombre;
	String app;
	String apm;
	String curp;
	Date fechaNac;
	String nss;
	String sexo;
	String tipoSangre;
	
	public PacienteRequest() {
	}
	
	public PacienteRequest(int id) {
		this.pacienteId = id;
	}

	public PacienteRequest(int pacienteId, String nombre, String app, String apm, String curp, Date fechaNac,
			String nss, String sexo, String tipoSangre) {
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
	
}
