package com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.dominio.CandidatoMunicipio;

@Repository
public interface CandidatoMunicipioRepository extends JpaRepository<CandidatoMunicipio, Integer> {

}
