package org.veterinaria.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "doc_ident")
	private String docIdent;

	@Column(name = "nomb_clie")
	private String nomClie;

	@Column(name = "apel_clie")
	private String apelClie;

	@Column(name = "fech_naci")
	private Date fechNaci;

	@Column(name = "esta_clie")
	private Boolean estaClie;

	@Column(name = "direc_clie")
	private String direcClie;

	@Column(name = "telef_cli")
	private String telefCli;

	@Column(name = "correo_clie")
	private String correoClie;

	@Column(name = "genero_clie")
	private String generoClie;

	@Column(name = "fech_ingre")

	private Date fechIngre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocIdent() {
		return docIdent;
	}

	public void setDocIdent(String docIdent) {
		this.docIdent = docIdent;
	}

	public String getNomClie() {
		return nomClie;
	}

	public void setNomClie(String nomClie) {
		this.nomClie = nomClie;
	}

	public String getApelClie() {
		return apelClie;
	}

	public void setApelClie(String apelClie) {
		this.apelClie = apelClie;
	}

	public Date getFechNaci() {
		return fechNaci;
	}

	public void setFechNaci(Date fechNaci) {
		this.fechNaci = fechNaci;
	}

	public Boolean getEstaClie() {
		return estaClie;
	}

	public void setEstaClie(Boolean estaClie) {
		this.estaClie = estaClie;
	}

	public String getDirecClie() {
		return direcClie;
	}

	public void setDirecClie(String direcClie) {
		this.direcClie = direcClie;
	}

	public String getTelefCli() {
		return telefCli;
	}

	public void setTelefCli(String telefCli) {
		this.telefCli = telefCli;
	}

	public String getCorreoClie() {
		return correoClie;
	}

	public void setCorreoClie(String correoClie) {
		this.correoClie = correoClie;
	}

	public String getGeneroClie() {
		return generoClie;
	}

	public void setGeneroClie(String generoClie) {
		this.generoClie = generoClie;
	}

	public Date getFechIngre() {
		return fechIngre;
	}

	public void setFechIngre(Date fechIngre) {
		this.fechIngre = fechIngre;
	}

	public Cliente() {
		super();
	}

	// Constructor, getters y setters, y otros métodos según sea necesario

}