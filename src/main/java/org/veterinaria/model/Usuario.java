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
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nom_usu")
	private String nomUsu;

	@Column(name = "ape_usu")
	private String apeUsu;

	@Column(name = "username_usu")
	private String usernameUsu;

	@Column(name = "password_usu")
	private String passwordUsu;

	@Column(name = "fechRegis_usu")
	private Date fechRegisUsu;

	@Column(name = "cod_rol")
	private int codRol;

	@Column(name = "email_usu")
	private String emailUsu;

	@Column(name = "Tip_usua")
	private int tipUsua;

	@ManyToOne
	@JoinColumn(name = "Tip_usua", insertable = false, updatable = false)
	private TipoUsuario tipoUsuario;

	@ManyToOne
	@JoinColumn(name = "cod_rol", insertable = false, updatable = false)
	private Rol rol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomUsu() {
		return nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	public String getApeUsu() {
		return apeUsu;
	}

	public void setApeUsu(String apeUsu) {
		this.apeUsu = apeUsu;
	}

	public String getUsernameUsu() {
		return usernameUsu;
	}

	public void setUsernameUsu(String usernameUsu) {
		this.usernameUsu = usernameUsu;
	}

	public String getPasswordUsu() {
		return passwordUsu;
	}

	public void setPasswordUsu(String passwordUsu) {
		this.passwordUsu = passwordUsu;
	}

	public Date getFechRegisUsu() {
		return fechRegisUsu;
	}

	public void setFechRegisUsu(Date fechRegisUsu) {
		this.fechRegisUsu = fechRegisUsu;
	}

	public int getCodRol() {
		return codRol;
	}

	public void setCodRol(int codRol) {
		this.codRol = codRol;
	}

	public String getEmailUsu() {
		return emailUsu;
	}

	public void setEmailUsu(String emailUsu) {
		this.emailUsu = emailUsu;
	}

	public int getTipUsua() {
		return tipUsua;
	}

	public void setTipUsua(int tipUsua) {
		this.tipUsua = tipUsua;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}