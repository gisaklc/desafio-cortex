package com.desafio.service;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

import com.desafio.dominio.Candidato;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;


@Service
public class UploadService {

	public void uploadFile(String path) {
		try {

			String json = String.join(" ", Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8));

			System.out.println("Imprimindo JSON..." + json + "Json Impresso");
			System.out.println("Imprimindo JSON..." );
			Type type = new TypeToken<Candidato>(){}.getType();
			Candidato c = new Gson().fromJson(json, type);
			
			System.out.println(c);
			
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}

}
