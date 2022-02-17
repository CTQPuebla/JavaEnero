package com.persistence.entity;

import java.io.Serializable;



import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


//import com.entity.CitasProgramadas;

@Entity
@Table(name = "PACIENTES")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@pacieteId" , scope =Pacientes.class)
public class Pacientes implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	public Pacientes() {

	}

	public Pacientes(int id) {
		this.pacienteId = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pid_auto")
	@SequenceGenerator(name = "pid_auto", sequenceName = "PAC_SEQ", allocationSize = 1)
	@Column(name = "PACIENTE_ID", columnDefinition = "NUMBER")
	private int pacienteId;

	@Column(name = "NOMBRE", columnDefinition = "VARCHAR2(15)")
	private String nombre;

	@Column(name = "APP", columnDefinition = "VARCHAR2(15)")
	private String app;

	@Column(name = "APM", columnDefinition = "VARCHAR2(15)")
	private String apm;

	@Column(name = "CURP", columnDefinition = "VARCHAR2(20)")
	private String curp;

	@Column(name = "FECHA_NAC", columnDefinition = "DATE")
	private Date fechaNac;

	@Column(name = "NSS", columnDefinition = "VARCHAR2(10)")
	private String nss;

	@Column(name = "SEXO", columnDefinition = "VARCHAR2(1)")
	private String sexo;

	@Column(name = "TIPO_SANGRE", columnDefinition = "VARCHAR2(3)")
	private String tipoSangre;

	// Atributo relacional
	// crear getters y setters
//	@OneToMany(mappedBy = "paciente")
//	private List <CitasProgramadas> citasProgramadas;
	
	@OneToMany(mappedBy = "paciente")
	private List <Diagnostico> diagnostico;

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
