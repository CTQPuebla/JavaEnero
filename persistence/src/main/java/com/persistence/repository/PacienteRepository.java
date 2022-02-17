package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
	
	@Query("SELECT p FROM Paciente p WHERE p.nombre = :name")
	Paciente findByName(@Param("name")String name);
}
