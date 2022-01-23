package com.ALTbruno.DesafioAPCoders.repositories;

import com.ALTbruno.DesafioAPCoders.entities.Despesa;
import com.ALTbruno.DesafioAPCoders.entities.enums.StatusPagamentoDespesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {

	List<Despesa> findByStatus(StatusPagamentoDespesa statusPagamentoDespesa);
}
