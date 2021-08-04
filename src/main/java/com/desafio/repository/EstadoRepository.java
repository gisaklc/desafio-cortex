package com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
