package org.veterinaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_historial_vacuna")
public class HistorialVacuna {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idHistorialVacuna;

//    @Column(name = "historia_clinica")
//    private Integer historiaClinica;

//    @Column(name = "vacuna")
//    private Integer vacuna;

	@Column(name = "obsevacion")
	private String observacion;

	@Column(name = "estado")
	private Boolean estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vacuna", referencedColumnName = "id")
	private TipoVacuna tipoVacuna;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "historia_clinica", referencedColumnName = "id")
	private HistorialClinica historialClinica;

	public Integer getIdHistorialVacuna() {
		return idHistorialVacuna;
	}

	public void setIdHistorialVacuna(Integer idHistorialVacuna) {
		this.idHistorialVacuna = idHistorialVacuna;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public TipoVacuna getTipoVacuna() {
		return tipoVacuna;
	}

	public void setTipoVacuna(TipoVacuna tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}

	public HistorialClinica getHistorialClinica() {
		return historialClinica;
	}

	public void setHistorialClinica(HistorialClinica historialClinica) {
		this.historialClinica = historialClinica;
	}

	public HistorialVacuna() {
		super();
	}

}
