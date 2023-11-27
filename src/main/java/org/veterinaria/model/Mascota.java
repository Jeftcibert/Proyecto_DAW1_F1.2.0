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
@Table(name = "tb_mascota")
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idMascota;

//    @Column(name = "raza")
//    private Integer raza;

//    @Column(name = "cliente")
//    private Integer cliente;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "fecha_nac")
	private Date fechaNacimiento;

	@Column(name = "sexo")
	private String sexo;

//    @Column(name = "color")
//    private Integer color;

	@Column(name = "estado")
	private Boolean estado;

	@Column(name = "fech_ingre")
	private Date fechaIngreso;

	@Column(name = "foto")
	private Long foto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente", referencedColumnName = "id")
	private Cliente clienteMascota;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "raza", referencedColumnName = "id")
	private Raza razaMascota;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "color", referencedColumnName = "id")
	private Color colorMascota;

	public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Long getFoto() {
		return foto;
	}

	public void setFoto(Long foto) {
		this.foto = foto;
	}

	public Cliente getClienteMascota() {
		return clienteMascota;
	}

	public void setClienteMascota(Cliente clienteMascota) {
		this.clienteMascota = clienteMascota;
	}

	public Raza getRazaMascota() {
		return razaMascota;
	}

	public void setRazaMascota(Raza razaMascota) {
		this.razaMascota = razaMascota;
	}

	public Color getColorMascota() {
		return colorMascota;
	}

	public void setColorMascota(Color colorMascota) {
		this.colorMascota = colorMascota;
	}

	public Mascota() {
		super();
	}

}
