package com.msdoctores.service;

import java.util.List;

import com.persistence.entity.Doctores;
import com.persistence.request.DoctorRequest;

public interface DoctorService {
	
	Doctores guardar(DoctorRequest request);
	Doctores actualizar(DoctorRequest request);
	Doctores buscar(int id);
	Doctores buscarPorNombre(String nombre);
	String eliminar(int id);
	List<Doctores> mostrar();

}
