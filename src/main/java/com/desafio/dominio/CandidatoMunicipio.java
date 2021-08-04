package com.desafio.dominio;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CandidatoMunicipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// contem a chave composta
	@JsonIgnore
	@EmbeddedId
	private CandidatoMunicipioPk id = new CandidatoMunicipioPk();

	private Integer qntDeVotos;

	public CandidatoMunicipio() {
		// TODO Auto-generated constructor stub
	}

	public CandidatoMunicipio(Candidato candidato, Municipio municipio, Integer qntDeVotos) {
		super();

		id.setCandidato(candidato);
		id.setMunicipio(municipio);
		this.qntDeVotos = qntDeVotos;
	}

	public CandidatoMunicipioPk getId() {
		return id;
	}

	public void setId(CandidatoMunicipioPk id) {
		this.id = id;
	}

	public Integer getQntDeVotos() {
		return qntDeVotos;
	}

	public void setQntDeVotos(Integer qntDeVotos) {
		this.qntDeVotos = qntDeVotos;
	}

}
