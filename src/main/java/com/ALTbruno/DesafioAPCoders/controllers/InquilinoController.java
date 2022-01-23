package com.ALTbruno.DesafioAPCoders.controllers;

import com.ALTbruno.DesafioAPCoders.entities.Inquilino;
import com.ALTbruno.DesafioAPCoders.entities.Unidade;
import com.ALTbruno.DesafioAPCoders.repositories.InquilinoRepository;
import com.ALTbruno.DesafioAPCoders.repositories.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inquilinos")
public class InquilinoController {

	@Autowired
	private InquilinoRepository inquilinoRepository;

	@Autowired
	private UnidadeRepository unidadeRepository;

	@PostMapping
	public ResponseEntity<Inquilino> cadastrar(@RequestBody Inquilino inquilino) {
		inquilino.setIdade(Period.between(inquilino.getDataNascimento(), LocalDate.now()).getYears());
		return ResponseEntity.status(HttpStatus.CREATED).body(inquilinoRepository.save(inquilino));
	}

	@GetMapping
	public ResponseEntity<List<Inquilino>> listar() {
		return ResponseEntity.ok(inquilinoRepository.findAll());
	}
}
