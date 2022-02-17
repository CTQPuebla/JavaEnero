package com.msdoctores.service;

import java.util.List;


import com.persistence.entity.Doctores;
import com.persistence.request.DoctoresRequest;


public interface DoctoresService {
	
	Doctores guardar (DoctoresRequest request);
	Doctores actualizar (DoctoresRequest request);
	Doctores buscar (int id);
	Doctores buscarPorNombre(String nombre);
	String eliminar (int id);
	List<Doctores> mostrar ();
	
}
