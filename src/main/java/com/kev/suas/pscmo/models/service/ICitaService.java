package com.kev.suas.pscmo.models.service;

import java.util.List;

import com.kev.suas.pscmo.models.entity.Cita;
import com.kev.suas.pscmo.models.entity.dto.CitaDTO;

public interface ICitaService {
	
	public List<CitaDTO> getAllCitas();
	
	public CitaDTO getOneCita(String idCita);
	
	public CitaDTO saveCita(Cita cita);
	
	public Cita findOneEntityCita(String idCita);
	
	
	

}
