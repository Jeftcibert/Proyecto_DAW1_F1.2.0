package org.veterinaria.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cobro")
public class Cobro {

	@Id
	@Column(name = "id_cobro")
	private String idCobro;

	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "cliente")
	private Integer cliente;

	@Column(name = "valor_total")
	private double valorTotal;

	@Column(name = "estado")
	private Boolean estado;

//    @Column(name = "usuario")
//    private Integer usuario;

	@Column(name = "observaciones")
	private String observaciones;

	@Column(name = "descuento")
	private double descuento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario", referencedColumnName = "id")
	private Usuario usuarioCobro;

	public String getIdCobro() {
		return idCobro;
	}

	public void setIdCobro(String idCobro) {
		this.idCobro = idCobro;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public Usuario getUsuarioCobro() {
		return usuarioCobro;
	}

	public void setUsuarioCobro(Usuario usuarioCobro) {
		this.usuarioCobro = usuarioCobro;
	}

	public Cobro() {
		super();
	}

}