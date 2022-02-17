package com.msdiagnosticos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.persistence.entity.Diagnostico;
import com.persistence.request.DiagnosticoRequest;

@Service
public interface DiagnosticoService {
	
	Diagnostico guardar(DiagnosticoRequest request);
	Diagnostico actualizar(DiagnosticoRequest request);
	Diagnostico buscar(int id);
	Diagnostico buscarPorNombre(String nombre);
	String eliminar(int id);
	List<Diagnostico> mostrar();

}
