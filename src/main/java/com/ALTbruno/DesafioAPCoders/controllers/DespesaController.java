package com.ALTbruno.DesafioAPCoders.controllers;

import com.ALTbruno.DesafioAPCoders.entities.Despesa;
import com.ALTbruno.DesafioAPCoders.entities.enums.StatusPagamentoDespesa;
import com.ALTbruno.DesafioAPCoders.repositories.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

	@Autowired
	private DespesaRepository despesaRepository;

	@PostMapping
	public ResponseEntity<Despesa> cadastrar(@RequestBody Despesa despesa) {
		return ResponseEntity.status(HttpStatus.CREATED).body(despesaRepository.save(despesa));
	}

	@GetMapping
	public ResponseEntity<List<Despesa>> listar() {
		return ResponseEntity.ok(despesaRepository.findAll());
	}

	@PatchMapping("/{id}")
	public @ResponseBody void atualizar(@PathVariable Long id, @RequestBody Despesa despesa) {
		if (despesaRepository.findById(id).isPresent()) {
			despesa.setId(id);
			despesaRepository.save(despesa);
		} else {
			ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@GetMapping("/status/{statusPagamentoDespesa}")
	public ResponseEntity<List<Despesa>> filtrarPeloStatus(@PathVariable StatusPagamentoDespesa statusPagamentoDespesa) {
		return ResponseEntity.ok(despesaRepository.findByStatus(statusPagamentoDespesa));
	}
}
