package com.mspacientes.services;

import java.util.List;

import com.persistence.entity.Paciente;
import com.persistence.request.PacienteRequest;
//Inyección de independencias

public interface PacienteService {
	Paciente guardar(PacienteRequest request);
	Paciente actualizar(PacienteRequest request);
	Paciente buscar(int id);
	Paciente buscarPorNombre(String nombre);
	String eliminar(int id);
	List<Paciente> mostrar();
	
}
