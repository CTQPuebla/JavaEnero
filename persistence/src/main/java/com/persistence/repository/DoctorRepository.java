package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

	@Query("SELECT d FROM Doctor d WHERE d.cedula = :cedula")
	Doctor findByCed(@Param("cedula")String cedula);
}
