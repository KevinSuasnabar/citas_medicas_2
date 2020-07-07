package com.kev.suas.pscmo.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class RecepcionistaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idRecepcionista;
	private String nombreRecepcionista;
	private String apellidoRecepcionista;
	private String telefono;
	private String sexo;
	private Date fechaNacimiento;
	private String numDocumento;
	private String estadoRecepcionista;
	private String fechaRegistro;

	public String getIdRecepcionista() {
		return idRecepcionista;
	}

	public void setIdRecepcionista(String idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}

	public String getNombreRecepcionista() {
		return nombreRecepcionista;
	}

	public void setNombreRecepcionista(String nombreRecepcionista) {
		this.nombreRecepcionista = nombreRecepcionista;
	}

	public String getApellidoRecepcionista() {
		return apellidoRecepcionista;
	}

	public void setApellidoRecepcionista(String apellidoRecepcionista) {
		this.apellidoRecepcionista = apellidoRecepcionista;
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

	public String getEstadoRecepcionista() {
		return estadoRecepcionista;
	}

	public void setEstadoRecepcionista(String estadoRecepcionista) {
		this.estadoRecepcionista = estadoRecepcionista;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "RecepcionistaDTO [idRecepcionista=" + idRecepcionista + ", nombreRecepcionista=" + nombreRecepcionista
				+ ", apellidoRecepcionista=" + apellidoRecepcionista + ", telefono=" + telefono + ", sexo=" + sexo
				+ ", fechaNacimiento=" + fechaNacimiento + ", numDocumento=" + numDocumento + ", estadoRecepcionista="
				+ estadoRecepcionista + ", fechaRegistro=" + fechaRegistro + "]";
	}

}
