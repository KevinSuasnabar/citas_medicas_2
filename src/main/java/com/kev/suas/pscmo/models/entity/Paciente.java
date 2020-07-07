package com.kev.suas.pscmo.models.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CM_PACIENTES")
public class Paciente {

	@Id
	@Column(name = "paciente_id", length = 25, nullable = false, unique = true)
	private Integer paciente_id;

	@Column(name = "nombre", length = 20, nullable = false)
	private String paciente_nombre;

	@Column(name = "ape_pat", length = 20, nullable = false)
	private String paciente_apepat;

	@Column(name = "ape_mat", length = 20, nullable = false)
	private String paciente_apemat;

	@Column(name = "direccion", length = 50, nullable = true)
	private String paciente_direccion;

	@Column(name = "movil", length = 15, nullable = true)
	private String paciente_movil;

	@Column(length = 1, name = "sexo", nullable = false)
	private String paciente_sexo;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_naci", nullable = false)
	private Date paciente_fenac;

	@Column(name = "nro_documento", length = 20, nullable = false)
	private String paciente_nrdocumento;

	@Column(name = "estado", nullable = false)
	private Boolean paciente_estado;

	@Column(name = "fecha_registro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;

	@OneToOne(mappedBy = "paciente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Historia historiaClinica;

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "usuario_id") private Usuario usuario;
	 */

	public Paciente() {

	}

	public String getPaciente_nrdocumento() {
		return paciente_nrdocumento;
	}

	public void setPaciente_nrdocumento(String paciente_nrdocumento) {
		this.paciente_nrdocumento = paciente_nrdocumento;
	}
	/*
	 * @JsonIgnoreProperties({"hibernateLazyInitializer" }) public Usuario
	 * getUsuario() { return usuario; }
	 * 
	 * public void setUsuario(Usuario usuario) { this.usuario = usuario; }
	 */

	@JsonIgnoreProperties({ "paciente", "fuas", "hibernateLazyInitializer" })
	public Historia getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(Historia historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Integer getPaciente_id() {
		return paciente_id;
	}

	public void setPaciente_id(Integer paciente_id) {
		this.paciente_id = paciente_id;
	}

	public String getPaciente_nombre() {
		return paciente_nombre;
	}

	public void setPaciente_nombre(String paciente_nombre) {
		this.paciente_nombre = paciente_nombre;
	}

	public String getPaciente_apepat() {
		return paciente_apepat;
	}

	public void setPaciente_apepat(String paciente_apepat) {
		this.paciente_apepat = paciente_apepat;
	}

	public String getPaciente_apemat() {
		return paciente_apemat;
	}

	public void setPaciente_apemat(String paciente_apemat) {
		this.paciente_apemat = paciente_apemat;
	}

	public String getPaciente_direccion() {
		return paciente_direccion;
	}

	public void setPaciente_direccion(String paciente_direccion) {
		this.paciente_direccion = paciente_direccion;
	}

	public String getPaciente_movil() {
		return paciente_movil;
	}

	public void setPaciente_movil(String paciente_movil) {
		this.paciente_movil = paciente_movil;
	}

	public String getPaciente_sexo() {
		return paciente_sexo;
	}

	public void setPaciente_sexo(String paciente_sexo) {
		this.paciente_sexo = paciente_sexo;
	}

	public Date getPaciente_fenac() {
		return paciente_fenac;
	}

	public void setPaciente_fenac(Date paciente_fenac) {
		this.paciente_fenac = paciente_fenac;
	}

	public Boolean getPaciente_estado() {
		return paciente_estado;
	}

	public void setPaciente_estado(Boolean paciente_estado) {
		this.paciente_estado = paciente_estado;
	}
}
