package com.kev.suas.pscmo.models.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CM_CONSULTAS")
public class Consulta {

	@Id
	@Column(name = "consulta_id", length = 25, nullable = false, unique = true)
	private String consulta_id;

	@Column(name = "descripcion",nullable = true,length = 250)
	private String consulta_descripcion;

	@Column(name = "diagnostico",nullable = false,length = 50)
	private String consulta_diagnostico;

	@Column(name = "fecha_registro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;
	
	@Column(name = "estado", nullable = false)
	private Boolean consulta_estado;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "cita_id",nullable = false)
	private Cita cita;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "historia_id",nullable = false)
	private Historia historia;

	public Consulta() {

	}

	public String getConsulta_id() {
		return consulta_id;
	}

	public void setConsulta_id(String consulta_id) {
		this.consulta_id = consulta_id;
	}

	public String getConsulta_descripcion() {
		return consulta_descripcion;
	}

	public void setConsulta_descripcion(String consulta_descripcion) {
		this.consulta_descripcion = consulta_descripcion;
	}

	public String getConsulta_diagnostico() {
		return consulta_diagnostico;
	}

	public void setConsulta_diagnostico(String consulta_diagnostico) {
		this.consulta_diagnostico = consulta_diagnostico;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Boolean getConsulta_estado() {
		return consulta_estado;
	}

	public void setConsulta_estado(Boolean consulta_estado) {
		this.consulta_estado = consulta_estado;
	}
	
	@JsonIgnoreProperties({ "consultas", "hibernateLazyInitializer" })
	public Historia getHistoria() {
		return historia;
	}

	public void setHistoria(Historia historia) {
		this.historia = historia;
	}

	@JsonIgnoreProperties({ "hibernateLazyInitializer" })
	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}
}
