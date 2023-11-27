package org.veterinaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_especie")
public class Especie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idEspecie;

	@Column(name = "descr_espe", nullable = false)
	private String descripcion;

	@Column(name = "estado")
	private Boolean estado;

	public Integer getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(Integer idEspecie) {
		this.idEspecie = idEspecie;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
