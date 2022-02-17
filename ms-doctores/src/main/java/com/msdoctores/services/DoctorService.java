package com.msdoctores.services;

import java.util.List;

import com.persistence.entity.Doctor;
import com.persistence.request.DoctorRequest;

public interface DoctorService {
	Doctor guardar(DoctorRequest request);
	Doctor actualizar(DoctorRequest request);
	Doctor buscar(int id);
	Doctor buscarPorCedula(String cedula);
	String eliminar(int id);
	List<Doctor> mostrar();
}
