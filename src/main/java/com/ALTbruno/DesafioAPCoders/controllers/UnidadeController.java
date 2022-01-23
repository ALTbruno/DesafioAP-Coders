package com.ALTbruno.DesafioAPCoders.controllers;

import com.ALTbruno.DesafioAPCoders.entities.Unidade;
import com.ALTbruno.DesafioAPCoders.repositories.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidades")
public class UnidadeController {

	@Autowired
	private UnidadeRepository unidadeRepository;

	@PostMapping
	public ResponseEntity<Unidade> cadastrar(@RequestBody Unidade unidade) {
		return ResponseEntity.status(HttpStatus.CREATED).body(unidadeRepository.save(unidade));
	}

	@GetMapping
	public ResponseEntity<List<Unidade>> listar() {
		return ResponseEntity.ok(unidadeRepository.findAll());
	}
}
