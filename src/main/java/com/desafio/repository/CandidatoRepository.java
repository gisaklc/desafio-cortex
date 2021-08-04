package com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.dominio.Candidato;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Integer> {

}
