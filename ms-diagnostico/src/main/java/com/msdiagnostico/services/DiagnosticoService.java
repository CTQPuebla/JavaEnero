package com.msdiagnostico.services;

import java.util.List;

import com.persistence.entity.Diagnostico;
import com.persistence.request.DiagnosticoRequest;

public interface DiagnosticoService {
	Diagnostico guardar(DiagnosticoRequest request);
	Diagnostico actualizar(DiagnosticoRequest request);
	Diagnostico buscar(int id);
	String eliminar(int id);
	List<Diagnostico> mostrar();
}
