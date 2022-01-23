package com.ALTbruno.DesafioAPCoders.repositories;

import com.ALTbruno.DesafioAPCoders.entities.Condominio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondominioRepository extends JpaRepository<Condominio, Long> {
}
