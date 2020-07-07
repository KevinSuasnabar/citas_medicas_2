package com.kev.suas.pscmo.models.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CM_MEDICOS")
public class Medico {

	@Id
	@Column(name = "medico_id", length = 25, nullable = false, unique = true)
	private String medico_id;

	@Column(name = "nombre", length = 20, nullable = false)
	private String medico_nombre;

	@Column(name = "ape_pat", length = 20, nullable = false)
	private String medico_apepat;

	@Column(name = "ape_mat", length = 20, nullable = false)
	private String medico_apemat;

	@Column(name = "direccion", length = 50, nullable = true)
	private String medico_direccion;

	@Column(name = "movil", length = 15, nullable = true)
	private String medico_movil;

	/*
	 * @ElementCollection(fetch = FetchType.LAZY)
	 * 
	 * @CollectionTable(name = "dias_atencion") private List<String> dias_atencion;
	 */

	/*
	 * @ElementCollection(fetch = FetchType.LAZY)
	 * 
	 * @CollectionTable(name = "horarios_atencion") private List<String>
	 * horarios_atencion;
	 */

	@Column(length = 1, name = "sexo", nullable = false)
	private String medico_sexo;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_naci", nullable = false)
	private Date medico_fenac;

	@Column(name = "nro_documento", length = 20, nullable = false)
	private String medico_nrdocumento;

	@Column(name = "nro_colegiatura", length = 50, nullable = false)
	private String medico_colegiatura;

	@Column(name = "descripcion", length = 250, nullable = true)
	private String medico_descripcion;

	@Column(name = "estado", nullable = false)
	private Boolean medico_estado;

	@Column(name = "foto", nullable = true)
	private String foto;

	@Column(name = "fecha_registro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "especialidad_id")
	private Especialidad especialidad;

	/*
	 * @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "usuario_id") private Usuario usuario;
	 */

	public Medico() {

	}

	/*
	 * @JsonIgnoreProperties({"hibernateLazyInitializer" }) public Usuario
	 * getUsuario() { return usuario; }
	 * 
	 * public void setUsuario(Usuario usuario) { this.usuario = usuario; }
	 */

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getMedico_descripcion() {
		return medico_descripcion;
	}

	public void setMedico_descripcion(String medico_descripcion) {
		this.medico_descripcion = medico_descripcion;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public String getMedico_id() {
		return medico_id;
	}

	public void setMedico_id(String medico_id) {
		this.medico_id = medico_id;
	}

	public String getMedico_nombre() {
		return medico_nombre;
	}

	public void setMedico_nombre(String medico_nombre) {
		this.medico_nombre = medico_nombre;
	}

	public String getMedico_apepat() {
		return medico_apepat;
	}

	public void setMedico_apepat(String medico_apepat) {
		this.medico_apepat = medico_apepat;
	}

	public String getMedico_apemat() {
		return medico_apemat;
	}

	public void setMedico_apemat(String medico_apemat) {
		this.medico_apemat = medico_apemat;
	}

	public String getMedico_direccion() {
		return medico_direccion;
	}

	public void setMedico_direccion(String medico_direccion) {
		this.medico_direccion = medico_direccion;
	}

	public String getMedico_movil() {
		return medico_movil;
	}

	public void setMedico_movil(String medico_movil) {
		this.medico_movil = medico_movil;
	}

	public String getMedico_sexo() {
		return medico_sexo;
	}

	public void setMedico_sexo(String medico_sexo) {
		this.medico_sexo = medico_sexo;
	}

	public Date getMedico_fenac() {
		return medico_fenac;
	}

	public void setMedico_fenac(Date medico_fenac) {
		this.medico_fenac = medico_fenac;
	}

	public String getMedico_nrdocumento() {
		return medico_nrdocumento;
	}

	public void setMedico_nrdocumento(String medico_nrdocumento) {
		this.medico_nrdocumento = medico_nrdocumento;
	}

	public String getMedico_colegiatura() {
		return medico_colegiatura;
	}

	public void setMedico_colegiatura(String medico_colegiatura) {
		this.medico_colegiatura = medico_colegiatura;
	}

	public Boolean getMedico_estado() {
		return medico_estado;
	}

	public void setMedico_estado(Boolean medico_estado) {
		this.medico_estado = medico_estado;
	}

	@JsonIgnoreProperties({ "hibernateLazyInitializer" })
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	/*
	 * public List<String> getDias_atencion() { return dias_atencion; }
	 * 
	 * public void setDias_atencion(List<String> dias_atencion) { this.dias_atencion
	 * = dias_atencion; }
	 * 
	 * public List<String> getHorarios_atencion() { return horarios_atencion; }
	 * 
	 * public void setHorarios_atencion(List<String> horarios_atencion) {
	 * this.horarios_atencion = horarios_atencion; }
	 */

}
