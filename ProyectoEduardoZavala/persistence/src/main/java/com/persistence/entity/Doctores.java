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



@Entity
@Table(name="DOCTORES")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@dcotorId" , scope =Doctores.class)
public class Doctores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Doctores() {}
	public Doctores(int id) {
		this.doctorId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="did_auto")
	@SequenceGenerator(name="did_auto", sequenceName="DOC_SEQ", allocationSize = 1)
	@Column(name="DOCTOR_ID", columnDefinition="NUMBER")
	private int doctorId;
	
	@Column(name="NOMBRE", columnDefinition="VARCHAR2(15)")
	private String nombre;
	
	@Column(name="ESPECIALIDAD", columnDefinition="VARCHAR2(15)")
	private String especialidad;
	
	@Column(name="CEDULA", columnDefinition="VARCHAR2(15)")
	private String cedula;
	
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	private Date fechaNac;
	
	@Column(name="SEXO", columnDefinition="VARCHAR2(1)")
	private String sexo;
	
	@OneToMany(mappedBy = "doctor")
	private List <Diagnostico> diagnostico;
	

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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Doctores [doctorId=" + doctorId + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cedula="
				+ cedula + ", fechaNac=" + fechaNac + ", sexo=" + sexo + "]";
	}
	

}
