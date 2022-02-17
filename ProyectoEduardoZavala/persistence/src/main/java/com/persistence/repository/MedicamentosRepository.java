package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Medicamentos;

@Repository
public interface MedicamentosRepository extends JpaRepository<Medicamentos, Integer>{
	
	@Query("SELECT m FROM Medicamentos m WHERE m.nombre =:nombre")//Lenguaje JPQL Se hace referencia a la entidad no a la tabla
	Medicamentos findByName (@Param("nombre") String nombre);

}
