package org.veterinaria.model;

import java.util.Date;

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
@Table(name = "tb_agenda")
public class Agenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idAgenda;

	@Column(name = "fecha")
	private Date fecha;

//    @Column(name = "mascota")
//    private Integer mascota;

	@Column(name = "fech_ingre")
	private Date fechaIngreso;

	@Column(name = "estado")
	private Integer estado;

	@Column(name = "medico")
	private Integer medico;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mascota", referencedColumnName = "id")
	private Mascota mascotaAgenda;

	public Integer getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Integer idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getMedico() {
		return medico;
	}

	public void setMedico(Integer medico) {
		this.medico = medico;
	}

	public Mascota getMascotaAgenda() {
		return mascotaAgenda;
	}

	public void setMascotaAgenda(Mascota mascotaAgenda) {
		this.mascotaAgenda = mascotaAgenda;
	}

	public Agenda() {
		super();
	}

}
