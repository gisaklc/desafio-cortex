package com.desafio.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Candidato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;

	@ManyToOne
	@JoinColumn(name = "partido_id")
	private Partido partido;

	@JsonIgnore // referencia ciclica nao pode ser serializado
	@OneToMany(mappedBy = "id.candidato")
	private Set<CandidatoMunicipio> candidatosMunicipios = new HashSet<>();;

	public Candidato() {

	}

	public Candidato(Integer id, String nome, Partido partido) {
		super();
		this.id = id;
		this.nome = nome;
		this.partido = partido;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<CandidatoMunicipio> getCandidatosMunicipios() {
		return candidatosMunicipios;
	}

	public void setCandidatosMunicipios(Set<CandidatoMunicipio> candidatosMunicipios) {
		this.candidatosMunicipios = candidatosMunicipios;
	}

}
