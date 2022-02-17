package com.persistence.entity;

import java.io.Serializable;
import java.util.Calendar;
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
@Table(name="DOCTORES")
public class Doctor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="did_auto")
	@SequenceGenerator(name="did_auto", sequenceName="DOC_SEQ",allocationSize=1)
	@Column(name="DOCTOR_ID", columnDefinition="NUMBER")
	int doctorId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	String nombre;
	
	@Column(name="ESPECIALIDAD", columnDefinition="NVARCHAR2(15)")
	String especialidad;
	
	@Column(name="CEDULA", columnDefinition="NVARCHAR2(15)")
	String cedula;
	
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	Calendar fechaNac;
	
	@Column(name="SEXO", columnDefinition="NVARCHAR2(1)")
	String sexo;
	
	//Atributo relacional
	@OneToMany(mappedBy="doc", fetch = FetchType.LAZY)
	List<Diagnostico> diagnostico;

	public Doctor() {
	}

	public Doctor(int id) {
		this.doctorId = id;
	}

	public Doctor(int doctorId, String nombre, String especialidad, String cedula, Calendar fechaNac, String sexo) {
		this.doctorId = doctorId;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
