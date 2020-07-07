package com.kev.suas.pscmo.models.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name = "CM_CITAS")
public class Cita {

	@Id
	@Column(name = "cita_id", length = 25, nullable = false, unique = true)
	private String cita_id;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_atencion", nullable = false)
	private Date cita_featencion;// fecha de atencion que se dara la cita

	@Column(name = "horario", nullable = false, length = 20)
	private String hora_atencion;

	@Column(name = "cita_estado_general", nullable = false, length = 20)
	private String cita_estado_general;

	@Column(name = "estado", nullable = false)
	private Boolean cita_estado;

	@Column(name = "fecha_registro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "medico_id", nullable = false)
	private Medico medico;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "paciente_id", nullable = false)
	private Paciente paciente;

	public Cita() {

	}

	public String getCita_id() {
		return cita_id;
	}

	public void setCita_id(String cita_id) {
		this.cita_id = cita_id;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Boolean getCita_estado() {
		return cita_estado;
	}

	public void setCita_estado(Boolean cita_estado) {
		this.cita_estado = cita_estado;
	}

	@JsonIgnoreProperties({ "hibernateLazyInitializer" })
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getCita_estado_general() {
		return cita_estado_general;
	}

	public void setCita_estado_general(String cita_estado_general) {
		this.cita_estado_general = cita_estado_general;
	}

	@JsonIgnoreProperties({ "hibernateLazyInitializer" })
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Date getCita_featencion() {
		return cita_featencion;
	}

	public void setCita_featencion(Date cita_featencion) {
		this.cita_featencion = cita_featencion;
	}

	public String getHora_atencion() {
		return hora_atencion;
	}

	public void setHora_atencion(String hora_atencion) {
		this.hora_atencion = hora_atencion;
	}
}
