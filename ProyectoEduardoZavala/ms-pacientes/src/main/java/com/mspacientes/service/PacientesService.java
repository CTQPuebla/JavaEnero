package com.mspacientes.service;

import java.util.List;


import com.persistence.entity.Pacientes;
import com.persistence.request.PacientesRequest;

public interface PacientesService {
	
	Pacientes guardar (PacientesRequest request);
	Pacientes actualizar (PacientesRequest request);
	Pacientes buscar (int id);
	Pacientes buscarPorNombre(String nombre);
	String eliminar (int id);
	List<Pacientes> mostrar ();

	
}
