package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Pacientes;

@Repository
public interface PacientesRepository extends JpaRepository<Pacientes, Integer> {
	
	@Query("SELECT p FROM Pacientes p WHERE p.nombre =:name")//Lenguaje JPQL Se hace referencia a la entidad no a la tabla
	Pacientes findByName (@Param("name") String name);
	
	
}
