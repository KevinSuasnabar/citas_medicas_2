package com.kev.suas.pscmo.models.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class MedicoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String idMedico;
	private String nombreMedico;
	private String apellidoMedico;
	private String direccion;
	private String telefono;
	private String sexo;
	private Date fechaNac;
	private String numDocumento;
	private String colegiatura;
	private String descripcion;
	private String foto;
	private String idEspecialidad;
	private String nombreEspecialidad;
	private Date fechaRegistro;
	private String estadoMedico;

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

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getColegiatura() {
		return colegiatura;
	}

	public void setColegiatura(String colegiatura) {
		this.colegiatura = colegiatura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}

	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getEstadoMedico() {
		return estadoMedico;
	}

	public void setEstadoMedico(String estadoMedico) {
		this.estadoMedico = estadoMedico;
	}

	@Override
	public String toString() {
		return "MedicoDTO [idMedico=" + idMedico + ", nombreMedico=" + nombreMedico + ", apellidoMedico="
				+ apellidoMedico + ", direccion=" + direccion + ", telefono=" + telefono + ", sexo=" + sexo
				+ ", fechaNac=" + fechaNac + ", numDocumento=" + numDocumento + ", colegiatura=" + colegiatura
				+ ", descripcion=" + descripcion + ", foto=" + foto + ", idEspecialidad=" + idEspecialidad
				+ ", nombreEspecialidad=" + nombreEspecialidad + ", fechaRegistro=" + fechaRegistro + ", estadoMedico="
				+ estadoMedico + "]";
	}

}
