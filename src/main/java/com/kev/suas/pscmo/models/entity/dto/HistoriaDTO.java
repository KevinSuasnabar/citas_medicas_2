package com.kev.suas.pscmo.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class HistoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idHistoria;
	private Date fechaRegistro;
	private String idPaciente;
	private String nombrePaciente;
	private String apellidoPaciente;
	private String idConsulta;

	public String getIdHistoria() {
		return idHistoria;
	}

	public void setIdHistoria(String idHistoria) {
		this.idHistoria = idHistoria;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getApellidoPaciente() {
		return apellidoPaciente;
	}

	public void setApellidoPaciente(String apellidoPaciente) {
		this.apellidoPaciente = apellidoPaciente;
	}

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	@Override
	public String toString() {
		return "HistoriaDTO [idHistoria=" + idHistoria + ", fechaRegistro=" + fechaRegistro + ", idPaciente="
				+ idPaciente + ", nombrePaciente=" + nombrePaciente + ", apellidoPaciente=" + apellidoPaciente
				+ ", idConsulta=" + idConsulta + "]";
	}

}
