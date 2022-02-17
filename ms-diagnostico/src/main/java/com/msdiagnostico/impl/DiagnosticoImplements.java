package com.msdiagnostico.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.msdiagnostico.services.DiagnosticoService;
import com.persistence.entity.Diagnostico;
import com.persistence.entity.Doctor;
import com.persistence.entity.Paciente;
import com.persistence.repository.DiagnosticoRepository;
import com.persistence.repository.DoctorRepository;
import com.persistence.repository.PacienteRepository;
import com.persistence.request.DiagnosticoRequest;

@Service
public class DiagnosticoImplements implements DiagnosticoService {
	
	//Inyección de la interface de acceso a datos
	@Autowired
	DiagnosticoRepository repo;
	
	@Autowired
	PacienteRepository paRepo;
	
	@Autowired
	DoctorRepository docRepo;
//	@Autowired
//	RestTemplate plantilla = new RestTemplate();
	
	@Override
	public Diagnostico guardar(DiagnosticoRequest request) {
		Diagnostico d = new Diagnostico();
		
		Paciente pac = paRepo.findById(request.getPac().getPacienteId()).get();
		Doctor doc = docRepo.findById(request.getDoc().getDoctorId()).get();
		
//		int pid = request.getPac().getPacienteId();
//		int did = request.getDoc().getDoctorId();
//		Paciente pac = plantilla.getForObject("http://localhost:8090/pacientes/buscar-por-id/"+pid, Paciente.class);
//		Doctor doc = plantilla.getForObject("http://localhost:8091/doctores/buscar-por-id/"+did, Doctor.class);
		
		d.setFecha(request.getFecha());
		d.setDetalle(request.getDetalle().toUpperCase());
		d.setPac(pac);
		d.setDoc(doc);
		repo.save(d);
		return d;
	}

	@Override
	public Diagnostico actualizar(DiagnosticoRequest request) {
		Diagnostico d = repo.findById(request.getDiagnosticoId()).get();
		
		Paciente pac = paRepo.findById(request.getPac().getPacienteId()).get();
		Doctor doc = docRepo.findById(request.getDoc().getDoctorId()).get();
		
//		int pid = request.getPac().getPacienteId();
//		int did = request.getDoc().getDoctorId();
//		Paciente pac = plantilla.getForObject("http://localhost:8090/pacientes/buscar-por-id/"+pid, Paciente.class);
//		Doctor doc = plantilla.getForObject("http://localhost:8091/doctores/buscar-por-id/"+did, Doctor.class);
		
		d.setFecha(request.getFecha());
		d.setDetalle(request.getDetalle());
		d.setPac(pac);
		d.setDoc(doc);
		repo.save(d);
		return d;
	}

	@Override
	public Diagnostico buscar(int id) {
		Diagnostico d = repo.findById(id).get();
		return d;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Diagnostico> mostrar() {
		return repo.findAll();
	}
	
}
