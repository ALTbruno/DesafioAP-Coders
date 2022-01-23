package com.ALTbruno.DesafioAPCoders.controllers;

import com.ALTbruno.DesafioAPCoders.entities.Condominio;
import com.ALTbruno.DesafioAPCoders.repositories.CondominioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/condominios")
public class CondominioController {

	@Autowired
	private CondominioRepository condominioRepository;

	@PostMapping
	public ResponseEntity<Condominio> cadastrar(@RequestBody Condominio condominio) {
		return ResponseEntity.status(HttpStatus.CREATED).body(condominioRepository.save(condominio));
	}

	@GetMapping
	public ResponseEntity<List<Condominio>> listar() {
		return ResponseEntity.ok(condominioRepository.findAll());
	}
}
