package com.kev.suas.pscmo.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class EspecialidadDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idEspecialidad;
	private String nombre;
	private Date fechaRegistro;
	private String estadoEspecialidad;

	public String getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getEstadoEspecialidad() {
		return estadoEspecialidad;
	}

	public void setEstadoEspecialidad(String estadoEspecialidad) {
		this.estadoEspecialidad = estadoEspecialidad;
	}

	@Override
	public String toString() {
		return "EspecialidadDTO [idEspecialidad=" + idEspecialidad + ", nombre=" + nombre + ", fechaRegistro="
				+ fechaRegistro + ", estadoEspecialidad=" + estadoEspecialidad + "]";
	}

}
