package com.kev.suas.pscmo.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CM_RECEPCIONISTAS")
public class Recepcionista {

	@Id
	@Column(name = "recepcionista_id", length = 25, nullable = false, unique = true)
	private Integer recepcionista_id;

	@Column(name = "nombre", length = 20, nullable = false)
	private String recepcionista_nombre;

	@Column(name = "ape_pat", length = 20, nullable = false)
	private String recepcionista_apepat;

	@Column(name = "ape_mat", length = 20, nullable = false)
	private String recepcionista_apemat;

	@Column(name = "movil", length = 15, nullable = true)
	private String recepcionista_movil;

	@Column(length = 1, name = "sexo", nullable = false)
	private String recepcionista_sexo;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_naci", nullable = true)
	private Date recepcionista_fenac;

	@Column(name = "nro_documento", length = 20, nullable = false)
	private String recepcionista_nrdocumento;

	@Column(name = "estado", nullable = false)
	private Boolean recepcionista_estado;

	@Column(name = "fecha_registro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "usuario_id") private Usuario usuario;
	 */

	public Recepcionista() {

	}

	public Integer getRecepcionista_id() {
		return recepcionista_id;
	}

	public void setRecepcionista_id(Integer recepcionista_id) {
		this.recepcionista_id = recepcionista_id;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getRecepcionista_nombre() {
		return recepcionista_nombre;
	}

	public void setRecepcionista_nombre(String recepcionista_nombre) {
		this.recepcionista_nombre = recepcionista_nombre;
	}

	public String getRecepcionista_apepat() {
		return recepcionista_apepat;
	}

	public void setRecepcionista_apepat(String recepcionista_apepat) {
		this.recepcionista_apepat = recepcionista_apepat;
	}

	public String getRecepcionista_apemat() {
		return recepcionista_apemat;
	}

	public void setRecepcionista_apemat(String recepcionista_apemat) {
		this.recepcionista_apemat = recepcionista_apemat;
	}

	public String getRecepcionista_movil() {
		return recepcionista_movil;
	}

	public void setRecepcionista_movil(String recepcionista_movil) {
		this.recepcionista_movil = recepcionista_movil;
	}

	public String getRecepcionista_sexo() {
		return recepcionista_sexo;
	}

	public void setRecepcionista_sexo(String recepcionista_sexo) {
		this.recepcionista_sexo = recepcionista_sexo;
	}

	public Date getRecepcionista_fenac() {
		return recepcionista_fenac;
	}

	public void setRecepcionista_fenac(Date recepcionista_fenac) {
		this.recepcionista_fenac = recepcionista_fenac;
	}

	public String getRecepcionista_nrdocumento() {
		return recepcionista_nrdocumento;
	}

	public void setRecepcionista_nrdocumento(String recepcionista_nrdocumento) {
		this.recepcionista_nrdocumento = recepcionista_nrdocumento;
	}

	public Boolean getRecepcionista_estado() {
		return recepcionista_estado;
	}

	public void setRecepcionista_estado(Boolean recepcionista_estado) {
		this.recepcionista_estado = recepcionista_estado;
	}

}
