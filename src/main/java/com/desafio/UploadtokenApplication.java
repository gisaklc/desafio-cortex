package com.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.service.DbService;

@SpringBootApplication
public class UploadtokenApplication implements CommandLineRunner {

	@Autowired
	private DbService service;

	public static void main(String[] args) {
		SpringApplication.run(UploadtokenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// fileUploadService.uploadFile(UPLOADED_FOLDER);

		service.createDb();

	}

}
