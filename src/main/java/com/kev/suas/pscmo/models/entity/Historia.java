package com.kev.suas.pscmo.models.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "CM_HISTORIAS")
public class Historia {

	@Id
	@Column(name = "historia_id", length = 25, nullable = false, unique = true)
	private String historia_id;

	@Column(name = "fecha_registro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente paciente;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "historia")
	private List<Consulta> consultas;

	public Historia() {
	}

	@JsonIgnoreProperties({ "historia", "hibernateLazyInitializer" })
	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> fuas) {
		this.consultas = fuas;
	}

	public String getHistoria_id() {
		return historia_id;
	}

	public void setHistoria_id(String historia_id) {
		this.historia_id = historia_id;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	@JsonIgnoreProperties({ "hibernateLazyInitializer" })
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
