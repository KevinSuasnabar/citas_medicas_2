package com.kev.suas.pscmo.models.service;

import java.util.List;

import com.kev.suas.pscmo.models.entity.Historia;
import com.kev.suas.pscmo.models.entity.dto.HistoriaDTO;

public interface IHistoriaService {
	
	public List<HistoriaDTO> getAllHistorias();
	
	public HistoriaDTO getOneHistoria(String idHistoria);
	
	public HistoriaDTO saveHistoria(Historia historia);
	
	public Historia findOneEntityHistoria(String idHistoria);
	
	public HistoriaDTO findOneHistoriaByPacienteId(String idPaciente);

}
