package com.persistence.entity;

import java.io.Serializable;
import java.sql.Date;
//import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTES")
public class Paciente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pid_auto")
	@SequenceGenerator(name="pid_auto", sequenceName="PAC_SEQ",allocationSize=1)
	@Column(name = "PACIENTE_ID", columnDefinition = "NUMBER")
	int pacienteId;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(15)")
	String nombre;
	@Column(name = "APP", columnDefinition = "NVARCHAR2(15)")
	String app;
	@Column(name = "APM", columnDefinition = "NVARCHAR2(15)")
	String apm;
	@Column(name = "CURP", columnDefinition = "NVARCHAR2(20)")
	String curp;
	@Column(name = "FECHA_NAC", columnDefinition = "DATE")
	Date fechaNac;
	@Column(name = "NSS", columnDefinition = "NVARCHAR2(10)")
	String nss;
	@Column(name = "SEXO", columnDefinition = "NVARCHAR2(1)")
	String sexo;
	@Column(name = "TIPO_SANGRE", columnDefinition = "NVARCHAR2(3)")
	String tipoSangre;
	
	@OneToMany(mappedBy = "pac", fetch = FetchType.LAZY)
	List<Diagnostico> diagnostico;

	public Paciente() {
	}

	public Paciente(int id) {
		this.pacienteId = id;
	}

	public Paciente(int pacienteId, String nombre, String app, String apm, String curp, Date fechaNac, String nss,
			String sexo, String tipoSangre) {
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
		return "Pacientes [pacienteId=" + pacienteId + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm
				+ ", curp=" + curp + ", fechaNac=" + fechaNac + ", nss=" + nss + ", sexo=" + sexo + ", tipoSangre="
				+ tipoSangre + "]";
	}
}
