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
@Table(name = "tb_historial_clinica")
public class HistorialClinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idHistorialClinica;

//    @Column(name = "mascota")
//    private Integer mascota;

	@Column(name = "medico")
	private Integer medico;

	@Column(name = "motivo_consul")
	private String motivoConsul;

	@Column(name = "peso")
	private String peso;

	@Column(name = "diagnostico")
	private String diagnostico;

	@Column(name = "prescripcion")
	private String prescripcion;

	@Column(name = "fech_ingreso")
	private Date fechaIngreso;

	@Column(name = "usuario")
	private Integer usuario;

	@Column(name = "estado")
	private Integer estado;

	@Column(name = "cobro_detalle")
	private Integer cobroDetalle;

//    @Column(name = "agenda")
//    private Integer agenda;

	@Column(name = "indicaciones")
	private String indicaciones;

	@Column(name = "proxima_cita")
	private Date proximaCita;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mascota", referencedColumnName = "id")
	private Mascota mascotaHistorial;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agenda", referencedColumnName = "id")
	private Agenda agendaHistorial;

	public Integer getIdHistorialClinica() {
		return idHistorialClinica;
	}

	public void setIdHistorialClinica(Integer idHistorialClinica) {
		this.idHistorialClinica = idHistorialClinica;
	}

	public Integer getMedico() {
		return medico;
	}

	public void setMedico(Integer medico) {
		this.medico = medico;
	}

	public String getMotivoConsul() {
		return motivoConsul;
	}

	public void setMotivoConsul(String motivoConsul) {
		this.motivoConsul = motivoConsul;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getPrescripcion() {
		return prescripcion;
	}

	public void setPrescripcion(String prescripcion) {
		this.prescripcion = prescripcion;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getCobroDetalle() {
		return cobroDetalle;
	}

	public void setCobroDetalle(Integer cobroDetalle) {
		this.cobroDetalle = cobroDetalle;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public Date getProximaCita() {
		return proximaCita;
	}

	public void setProximaCita(Date proximaCita) {
		this.proximaCita = proximaCita;
	}

	public Mascota getMascotaHistorial() {
		return mascotaHistorial;
	}

	public void setMascotaHistorial(Mascota mascotaHistorial) {
		this.mascotaHistorial = mascotaHistorial;
	}

	public Agenda getAgendaHistorial() {
		return agendaHistorial;
	}

	public void setAgendaHistorial(Agenda agendaHistorial) {
		this.agendaHistorial = agendaHistorial;
	}

	public HistorialClinica() {
		super();
	}

}
