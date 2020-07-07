package com.kev.suas.pscmo.models.service;

import java.util.List;

import com.kev.suas.pscmo.models.entity.Paciente;
import com.kev.suas.pscmo.models.entity.dto.PacienteDTO;

public interface IPacienteService {
	
	public List<PacienteDTO> getAllPacientes();
	
	public PacienteDTO getOnePaciente(String idPaciente);
	
	public PacienteDTO savePaciente(Paciente paciente);
	
	public Paciente findOneEntityPaciente(String idPaciente);
}
