package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Diagnostico;


@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Integer> {
	
}
