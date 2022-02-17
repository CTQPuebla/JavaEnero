package com.msmedicamentos.service;

import java.util.List;

import com.persistence.entity.Medicamentos;
import com.persistence.request.MedicamentosRequest;


public interface MedicamentosService {
	
	Medicamentos guardar (MedicamentosRequest request);
	Medicamentos actualizar (MedicamentosRequest request);
	Medicamentos buscar (int id);
	Medicamentos buscarPorNombre(String nombre);
	String eliminar (int id);
	List<Medicamentos> mostrar ();
}
