package org.veterinaria.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_raza")
public class Raza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idRaza;

	@ManyToOne
	@JoinColumn(name = "especie")
	private Especie especieRaza;

	@Column(name = "descr_raza")
	private String descripcion;

	@Column(name = "fech_ingreso")
	private Date fechaIngreso;

	public Integer getIdRaza() {
		return idRaza;
	}

	public void setIdRaza(Integer idRaza) {
		this.idRaza = idRaza;
	}

	public Especie getEspecieRaza() {
		return especieRaza;
	}

	public void setEspecieRaza(Especie especieRaza) {
		this.especieRaza = especieRaza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Raza() {
		super();
	}

}
