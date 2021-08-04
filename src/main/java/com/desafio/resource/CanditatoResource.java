package com.desafio.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.desafio.dominio.Candidato;
import com.desafio.service.CandidatoService;

@RestController
@RequestMapping(value = "/candidatos")
public class CanditatoResource {

	@Autowired
	private CandidatoService service;

	@GetMapping("/")
	public String homepage() {
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Candidato>> findAll() {
		List<Candidato> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Candidato obj) {
		Candidato candidato = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(candidato.getId())
				.toUri();
		return ResponseEntity.created(uri).build();

	}

}