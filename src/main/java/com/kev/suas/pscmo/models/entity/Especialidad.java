package com.kev.suas.pscmo.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CM_ESPECIALIDAD")
public class Especialidad {

	@Id
	@Column(name = "especialidad_id", length = 25, nullable = false, unique = true)
	private String especialidad_id;

	@Column(name = "nombre", length = 50, nullable = false)
	private String especialidad_nombre;

	@Column(name = "fecha_registro", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fecha_registro;

	@Column(name = "estado", nullable = false)
	private Boolean especialidad_estado;

	public Especialidad() {
	}

	public String getEspecialidad_id() {
		return especialidad_id;
	}

	public void setEspecialidad_id(String especialidad_id) {
		this.especialidad_id = especialidad_id;
	}

	public String getEspecialidad_nombre() {
		return especialidad_nombre;
	}

	public void setEspecialidad_nombre(String especialidad_nombre) {
		this.especialidad_nombre = especialidad_nombre;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Boolean getEspecialidad_estado() {
		return especialidad_estado;
	}

	public void setEspecialidad_estado(Boolean especialidad_estado) {
		this.especialidad_estado = especialidad_estado;
	}
}
