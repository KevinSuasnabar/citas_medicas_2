package com.kev.suas.pscmo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kev.suas.pscmo.models.entity.Cita;

public interface ICitaRepository extends JpaRepository<Cita, String> {

}
