package org.veterinaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipUsuario")
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nomTip_usua", nullable = false)
	private String nombre;

	public TipoUsuario() {
	}

	public TipoUsuario(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public TipoUsuario(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}