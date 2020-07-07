package com.kev.suas.pscmo.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kev.suas.pscmo.models.entity.Cita;
import com.kev.suas.pscmo.models.entity.dto.CitaDTO;
import com.kev.suas.pscmo.models.repository.ICitaRepository;
import com.kev.suas.pscmo.models.service.ICitaService;

public class CitaServiceImpl implements ICitaService{
	
	@Autowired
	private ICitaRepository citaRepository;

	@Override
	public List<CitaDTO> getAllCitas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CitaDTO getOneCita(String idCita) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CitaDTO saveCita(Cita cita) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cita findOneEntityCita(String idCita) {
		// TODO Auto-generated method stub
		return null;
	}

}
