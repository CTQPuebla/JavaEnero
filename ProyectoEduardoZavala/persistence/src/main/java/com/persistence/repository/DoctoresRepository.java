package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Doctores;


@Repository
public interface DoctoresRepository extends JpaRepository<Doctores, Integer> {
	
	@Query("SELECT d FROM Doctores d WHERE d.nombre =:nombre")//Lenguaje JPQL Se hace referencia a la entidad no a la tabla
	Doctores findByName (@Param("nombre") String nombre);

}
