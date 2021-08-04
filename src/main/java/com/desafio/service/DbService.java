package com.desafio.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.dominio.Candidato;
import com.desafio.dominio.CandidatoMunicipio;
import com.desafio.dominio.Estado;
import com.desafio.dominio.Municipio;
import com.desafio.dominio.Partido;
import com.desafio.dominio.Regiao;
import com.desafio.repository.CandidatoMunicipioRepository;
import com.desafio.repository.CandidatoRepository;
import com.desafio.repository.EstadoRepository;
import com.desafio.repository.MunicipioRepository;
import com.desafio.repository.PartidoRepository;
import com.desafio.repository.RegiaoRepository;


@Service
public class DbService {

	@Autowired
	private CandidatoRepository repositoryCandidato;
	
	@Autowired
	private PartidoRepository repositoryPartido;
	
	@Autowired
	private RegiaoRepository repositoryRegiao;
	
	@Autowired
	private MunicipioRepository repositoryMunicipio;
	
	@Autowired
	private EstadoRepository repositoryEstado;
	
	@Autowired
	private CandidatoMunicipioRepository repositoryCandidatoMunicipio;
	
	public void createDb() {
		
		Partido p1 = new Partido(null, "PSB");
		Partido p2 = new Partido(null, "PSDB");
		Partido p3 = new Partido(null, "PT");
		Partido p4 = new Partido(null, "PSC");
		Partido p5 = new Partido(null, "PSOL");
		Partido p6 = new Partido(null, "PRTB");
		
		Regiao r1 = new Regiao(null, "Sudeste");
		Regiao r2 = new Regiao(null, "Norte");
		Regiao r3 = new Regiao(null, "Nordeste");
		Regiao r4 = new Regiao(null, "Centro-Oeste");
		
		Estado e1 = new Estado(null, "GO", "Goiás", r3);
		Estado e2 = new Estado(null, "RJ", "Rio de Janeiro", r1);
		Estado e3 = new Estado(null, "CE", "Ceará", r3);
		Estado e4 = new Estado(null, "RN", "Rio Grande do Norte", r3);
		
		Municipio m1 = new Municipio(null, "Itapuruna", e1);
		Municipio m2 = new Municipio(null, "Assaré", e3);
		Municipio m3 = new Municipio(null, "Duque de Caxias", e2);
		Municipio m4 = new Municipio(null, "Nova Iguaçu", e2);
		Municipio m5 = new Municipio(null, "Guapimirim", e2);
		Municipio m6 = new Municipio(null, "Caraúfabas", e4);
		
		Candidato c1 = new Candidato(null, "Marina Silva", p1);
		Candidato c2 = new Candidato(null, "Dilma", p3);
		Candidato c3 = new Candidato(null, "Luciana Genro", p5);
		
		CandidatoMunicipio cm1 = new CandidatoMunicipio(c1, m2, 9313);
		CandidatoMunicipio cm2 = new CandidatoMunicipio(c2, m2, 1081);
		CandidatoMunicipio cm3 = new CandidatoMunicipio(c3, m2, 27);
		
		CandidatoMunicipio cm4 = new CandidatoMunicipio(c1, m3, 134084);
		CandidatoMunicipio cm5 = new CandidatoMunicipio(c2, m3, 205394);
		CandidatoMunicipio cm6 = new CandidatoMunicipio(c3, m3, 8162);
		
		CandidatoMunicipio cm7 = new CandidatoMunicipio(c1, m6, 1224);
		CandidatoMunicipio cm8 = new CandidatoMunicipio(c2, m6, 9648);
		CandidatoMunicipio cm9 = new CandidatoMunicipio(c3, m6, 53);
	
		c1.getCandidatosMunicipios().addAll(Arrays.asList(cm1, cm4, cm7));
		c2.getCandidatosMunicipios().addAll(Arrays.asList(cm2, cm5, cm8));
		c3.getCandidatosMunicipios().addAll(Arrays.asList(cm3, cm6, cm9));
		
		m2.getCandidatosMunicipios().addAll(Arrays.asList(cm1, cm2, cm3));
		m3.getCandidatosMunicipios().addAll(Arrays.asList(cm4, cm5, cm6));
		m6.getCandidatosMunicipios().addAll(Arrays.asList(cm7, cm8, cm9));
		
		
		repositoryPartido.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6));
		
		repositoryRegiao.saveAll(Arrays.asList(r1, r2, r3, r4));
		
		repositoryEstado.saveAll(Arrays.asList(e1, e2, e3, e4));
		
		repositoryMunicipio.saveAll(Arrays.asList(m1, m2, m3, m4, m5, m6));
		
		repositoryCandidato.saveAll(Arrays.asList(c1, c2, c3));
		
		repositoryCandidatoMunicipio.saveAll(Arrays.asList(cm1, cm2, cm3, cm4, cm5, cm6, cm7,cm8, cm9));
		
	}
	
	
}
