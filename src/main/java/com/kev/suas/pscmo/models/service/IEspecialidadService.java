package com.kev.suas.pscmo.models.service;

import java.util.List;

import com.kev.suas.pscmo.models.entity.Especialidad;
import com.kev.suas.pscmo.models.entity.dto.EspecialidadDTO;

public interface IEspecialidadService {
	
	public List<EspecialidadDTO> getAllEspecialidades();
	
	public EspecialidadDTO getOneEspecialidad(String idEspecialidad);
	
	public EspecialidadDTO saveEspecialidad(Especialidad especialidad);
	
	public Especialidad findOneEntityEspecialidad(String idEspecialidad);

}
