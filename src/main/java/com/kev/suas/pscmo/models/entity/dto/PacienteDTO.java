package com.kev.suas.pscmo.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class PacienteDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idPaciente;
	private String nombrePaciente;
	private String apellidoPaciente;
	private String direccion;
	private String telefono;
	private String sexo;
	private Date fechaNacimiento;
	private String numDocumento;
	private String estadoPaciente;
	private Date fechaRegistro;
	private String idHistoria;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getEstadoPaciente() {
		return estadoPaciente;
	}

	public void setEstadoPaciente(String estadoPaciente) {
		this.estadoPaciente = estadoPaciente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getIdHistoria() {
		return idHistoria;
	}

	public void setIdHistoria(String idHistoria) {
		this.idHistoria = idHistoria;
	}

	@Override
	public String toString() {
		return "PacienteDTO [idPaciente=" + idPaciente + ", nombrePaciente=" + nombrePaciente + ", apellidoPaciente="
				+ apellidoPaciente + ", direccion=" + direccion + ", telefono=" + telefono + ", sexo=" + sexo
				+ ", fechaNacimiento=" + fechaNacimiento + ", numDocumento=" + numDocumento + ", estadoPaciente="
				+ estadoPaciente + ", fechaRegistro=" + fechaRegistro + ", idHistoria=" + idHistoria + "]";
	}

}
