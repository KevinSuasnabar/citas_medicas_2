package com.kev.suas.pscmo.models.service;

import java.util.List;

import com.kev.suas.pscmo.models.entity.Consulta;
import com.kev.suas.pscmo.models.entity.dto.ConsultaDTO;

public interface IConsultaService {
	
	public List<ConsultaDTO> getAllConsultas();
	
	public ConsultaDTO getOneConsulta(String idConsulta);
	
	public ConsultaDTO saveConsulta(Consulta consulta);
	
	public Consulta findOneEntityConsulta(String idConsulta);

}
