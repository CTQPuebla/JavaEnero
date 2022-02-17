package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.persistence.entity.Diagnostico;

public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Integer>{
	
	//@Query("SELECT d FROM Diagnostico d WHERE d.diagnostico_id =: id")
	//Diagnostico findByName(@Param("id")String id);

}
