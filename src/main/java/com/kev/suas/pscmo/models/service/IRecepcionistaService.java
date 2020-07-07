package com.kev.suas.pscmo.models.service;

import java.util.List;

import com.kev.suas.pscmo.models.entity.Recepcionista;
import com.kev.suas.pscmo.models.entity.dto.RecepcionistaDTO;

public interface IRecepcionistaService {

	public List<RecepcionistaDTO> getAllRecepcionistas();
	
	public RecepcionistaDTO getOneRecepcionista(String idRecepcionista);
	
	public RecepcionistaDTO saveRecepcionista(Recepcionista recepcionista);
	
	public Recepcionista getOneEntityRecepcionista(String idRecepcionista);
 }
