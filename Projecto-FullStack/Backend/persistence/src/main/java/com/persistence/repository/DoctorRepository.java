package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence.entity.Doctores;

public interface DoctorRepository extends JpaRepository<Doctores, Integer>{
	
	@Query("SELECT d FROM Doctores d WHERE d.nombre =: name")
	Doctores findByName(@Param("name")String name);

}
