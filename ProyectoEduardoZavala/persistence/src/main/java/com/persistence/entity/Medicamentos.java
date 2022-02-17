package com.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "MEDICAMENTOS")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@medicamentoId" , scope =Medicamentos.class)
public class Medicamentos implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Medicamentos() {}
	public Medicamentos(int id) {
		this.medicamentoId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mid_auto")
	@SequenceGenerator(name="mid_auto", sequenceName="MEDICAMENTOS_SEQ", allocationSize=1)
	@Column(name="MEDICAMENTO_ID", columnDefinition="NUMBER")
	private int medicamentoId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	private String nombre;
	
	@Column(name="PATENTE", columnDefinition="CHAR(1)")
	private Character patente;
	
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	private Date fechaCad;
	
	@Column(name="INGREDIENTE_ACT", columnDefinition="NVARCHAR2(25)")
	private String ingredienteAct;
	
	@Column(name="MARCA", columnDefinition="NVARCHAR2(15)")
	private String marca;

	public int getMedicamentoId() {
		return medicamentoId;
	}
	public void setMedicamentoId(int medicamentoId) {
		this.medicamentoId = medicamentoId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Character getPatente() {
		return patente;
	}
	public void setPatente(Character patente) {
		this.patente = patente;
	}
	public Date getFechaCad() {
		return fechaCad;
	}
	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}
	public String getIngredienteAct() {
		return ingredienteAct;
	}
	public void setIngredienteAct(String ingredienteAct) {
		this.ingredienteAct = ingredienteAct;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Medicamentos [medicamentoId=" + medicamentoId + ", nombre=" + nombre + ", patente=" + patente
				+ ", fechaCad=" + fechaCad + ", ingredienteAct=" + ingredienteAct + ", marca=" + marca + "]";
	}
	
	
	
}
