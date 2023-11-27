package org.veterinaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cobro_detalle")
public class CobroDetalle {

	@Id
	@Column(name = "id")
	private Integer idCobroDetalle;

	@Column(name = "cobro")
	private String idCobro;

	@Column(name = "producto_servicio")
	private Integer productoServicio;

	@Column(name = "cantidad")
	private Integer cantidad;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cobro", referencedColumnName = "id_cobro")
	private Cobro cobro;

	public Integer getIdCobroDetalle() {
		return idCobroDetalle;
	}

	public void setIdCobroDetalle(Integer idCobroDetalle) {
		this.idCobroDetalle = idCobroDetalle;
	}

	public String getIdCobro() {
		return idCobro;
	}

	public void setIdCobro(String idCobro) {
		this.idCobro = idCobro;
	}

	public Integer getProductoServicio() {
		return productoServicio;
	}

	public void setProductoServicio(Integer productoServicio) {
		this.productoServicio = productoServicio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Cobro getCobro() {
		return cobro;
	}

	public void setCobro(Cobro cobro) {
		this.cobro = cobro;
	}

	public CobroDetalle() {
		super();
	}

	// getters and setters

}
