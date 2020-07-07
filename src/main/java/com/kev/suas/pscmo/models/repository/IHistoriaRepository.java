package com.kev.suas.pscmo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kev.suas.pscmo.models.entity.Historia;

public interface IHistoriaRepository extends JpaRepository<Historia, String> {

}
