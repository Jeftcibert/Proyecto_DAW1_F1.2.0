package org.veterinaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tip_vacuna")
public class TipoVacuna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idTipoVacuna;

	@Column(name = "descripcion")
	private String descripcion;

	@Column(name = "estado")
	private Boolean estado;

	public Integer getIdTipoVacuna() {
		return idTipoVacuna;
	}

	public void setIdTipoVacuna(Integer idTipoVacuna) {
		this.idTipoVacuna = idTipoVacuna;
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
