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

@Entity
public class Municipio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nomeMunicipio;

	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;

	@OneToMany(mappedBy = "id.municipio")
	private Set<CandidatoMunicipio> candidatosMunicipios = new HashSet<>();;

	public Municipio() {

	}

	public Municipio(Integer id, String nomeMunicipio, Estado estado) {
		super();
		this.id = id;
		this.nomeMunicipio = nomeMunicipio;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeMunicipio() {
		return nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Set<CandidatoMunicipio> getCandidatosMunicipios() {
		return candidatosMunicipios;
	}

	public void setCandidatosMunicipios(Set<CandidatoMunicipio> candidatosMunicipios) {
		this.candidatosMunicipios = candidatosMunicipios;
	}

}
