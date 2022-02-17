package com.msdiagnostico.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.msdiagnostico.service.DiagnosticoService;
import com.persistence.entity.Diagnostico;
import com.persistence.entity.Doctores;
import com.persistence.entity.Pacientes;
import com.persistence.repository.DiagnosticoRepository;
import com.persistence.repository.DoctoresRepository;
import com.persistence.repository.PacientesRepository;
import com.persistence.request.DiagnosticoRequest;

@Service
public class DiagnosticoImplements implements DiagnosticoService{
	
	// Inyeccion de la interface de acceso de datos
	@Autowired
	DiagnosticoRepository repo;
	@Autowired
	PacientesRepository repoPac;
	@Autowired
	DoctoresRepository repoDoc;

//	RestTemplate plantilla = new RestTemplate();
	
	@Override
	public Diagnostico guardar(DiagnosticoRequest request) {
		
		Diagnostico di = new Diagnostico();
		//Busco la entidad con el id que recibo en el request
		Pacientes p = repoPac.findById(request.getPaciente().getPacienteId()).get();
		Doctores d = repoDoc.findById(request.getDoctor().getDoctorId()).get();
		
		//Busco la entidad con el id que recibo en el request mediante RestTemplate
//		int pId = request.getPaciente().getPacienteId();
//		int dId = request.getDoctor().getDoctorId();
//		Pacientes po = plantilla.getForObject("http://localhost:8090/pacientes/buscar-por-id/" + pId, Pacientes.class);
//		Doctores dic = plantilla.getForObject("http://localhost:8091/doctores/buscar-por-id/" + dId, Doctores.class);
		
		di.setDoctor(d);
		di.setPaciente(p);
		di.setFecha(request.getFecha());
		di.setDetalle(request.getDetalle());

		repo.save(di);

		return di;
	}

	@Override
	public Diagnostico actualizar(DiagnosticoRequest request) {
		
		Diagnostico di = repo.findById(request.getDiagnosticoId()).get();
		Pacientes p = repoPac.findById(request.getPaciente().getPacienteId()).get();
		Doctores d = repoDoc.findById(request.getDoctor().getDoctorId()).get();
		
		di.setDoctor(d);
		di.setPaciente(p);
		di.setDetalle(request.getDetalle());
		di.setFecha(request.getFecha());

		repo.save(di);

		return di;
	}

	@Override
	public Diagnostico buscar(int id) {
		return repo.findById(id).get();
	}


	@Override
	public String eliminar(int id) {
		
		repo.deleteById(id);

		return "Eliminado";
	}

	@Override
	public List<Diagnostico> mostrar() {
		return repo.findAll();
	}

}
