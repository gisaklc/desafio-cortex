package com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.dominio.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Integer> {

}
