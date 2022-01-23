package com.ALTbruno.DesafioAPCoders.repositories;

import com.ALTbruno.DesafioAPCoders.entities.Unidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
}
