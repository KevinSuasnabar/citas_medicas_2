package com.kev.suas.pscmo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kev.suas.pscmo.models.entity.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, String>{

}
