package com.kev.suas.pscmo.models.service;

import java.util.List;

import com.kev.suas.pscmo.models.entity.Medico;
import com.kev.suas.pscmo.models.entity.dto.MedicoDTO;

public interface IMedicoService {
	
	public List<MedicoDTO> getAllMedicos();
	
	public MedicoDTO getOneMedico(String idMedico);
	
	public MedicoDTO saveMedico(Medico medico);
	
	public Medico getOneEntityMedico(String idMedico);

}
