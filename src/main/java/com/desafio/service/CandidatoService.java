package com.desafio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.dominio.Candidato;
import com.desafio.repository.CandidatoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CandidatoService {
	@Autowired
	private CandidatoRepository repositorio;

	public List<Candidato> findAll() { 
		List<Candidato> lista = repositorio.findAll();
		return lista;
	}

	public Candidato find(Integer id) throws ObjectNotFoundException {
		Optional<Candidato> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Candidato.class.getName()));
	}

	public Candidato insert(Candidato candidato) {
		candidato.setId(null); // para nao ser update
		return repositorio.save(candidato);
	}

}
