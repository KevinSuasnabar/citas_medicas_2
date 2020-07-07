package com.kev.suas.pscmo.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class CitaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idCita;
	private Date fechaAtencion;
	private String horaAtencion;
	private String estadoGeneral;
	private String estadoCita;
	private Date fechaRegistro;
	private String idMedico;
	private String nombreMedico;
	private String apellidoMedico;
	private String idPaciente;
	private String nombrePaciente;
	private String apellidoPaciente;

	public String getIdCita() {
		return idCita;
	}

	public void setIdCita(String idCita) {
		this.idCita = idCita;
	}

	public Date getFechaAtencion() {
		return fechaAtencion;
	}

	public void setFechaAtencion(Date fechaAtencion) {
		this.fechaAtencion = fechaAtencion;
	}

	public String getHoraAtencion() {
		return horaAtencion;
	}

	public void setHoraAtencion(String horaAtencion) {
		this.horaAtencion = horaAtencion;
	}

	public String getEstadoGeneral() {
		return estadoGeneral;
	}

	public void setEstadoGeneral(String estadoGeneral) {
		this.estadoGeneral = estadoGeneral;
	}

	public String getEstadoCita() {
		return estadoCita;
	}

	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(String idMedico) {
		this.idMedico = idMedico;
	}

	public String getNombreMedico() {
		return nombreMedico;
	}

	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}

	public String getApellidoMedico() {
		return apellidoMedico;
	}

	public void setApellidoMedico(String apellidoMedico) {
		this.apellidoMedico = apellidoMedico;
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

	@Override
	public String toString() {
		return "CitaDTO [idCita=" + idCita + ", fechaAtencion=" + fechaAtencion + ", horaAtencion=" + horaAtencion
				+ ", estadoGeneral=" + estadoGeneral + ", estadoCita=" + estadoCita + ", fechaRegistro=" + fechaRegistro
				+ ", idMedico=" + idMedico + ", nombreMedico=" + nombreMedico + ", apellidoMedico=" + apellidoMedico
				+ ", idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", apellidoPaciente="
				+ apellidoPaciente + "]";
	}

}
