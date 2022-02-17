package com.msdiagnosticos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msdiagnosticos.service.DiagnosticoService;
import com.persistence.entity.Diagnostico;
import com.persistence.entity.Doctores;
import com.persistence.entity.Paciente;
import com.persistence.repository.DiagnosticoRepository;
import com.persistence.repository.DoctorRepository;
import com.persistence.repository.PacienteRepository;
import com.persistence.request.DiagnosticoRequest;

@Service("DiagnosticoService")
public class DiagnosticoServiceImpl implements DiagnosticoService{
	
	
	@Autowired
	DiagnosticoRepository repo;
	
	/*
	@Autowired
	PacienteRepository paRepo;
	
	
	@Autowired
	DoctorRepository docRepo;
	*/
	
	
	
	

	@Override
	public Diagnostico guardar(DiagnosticoRequest request) {
		
		RestTemplate plantilla = new RestTemplate();;
		
		Diagnostico d = new Diagnostico();
		
		/*
		Paciente p = paRepo.findById(request.getPaciente().getPacienteId()).get();
		
		Doctores doc = docRepo.findById(request.getDoctor().getDoctorId()).get();
		*/
		
		int pId = request.getPaciente().getPacienteId();
		int dId = request.getDoctor().getDoctorId();
		Paciente p = plantilla.getForObject("http:localhost:8088/pacientes/buscar-por-id/" + pId, Paciente.class);
		
		Doctores doc = plantilla.getForObject("http:localhost:8089/doctores/buscar-por-id/" + pId, Doctores.class);
		
		d.setFecha(request.getFecha());
		d.setDetalle(request.getDetalle());
		d.setPaciente(p);
		d.setDoctor(doc);
		
		repo.save(d);
		
		return d;
	}

	@Override
	public Diagnostico actualizar(DiagnosticoRequest request) {
		
		Diagnostico d = new Diagnostico();
		/*
		Paciente p = paRepo.findById(request.getPaciente().getPacienteId()).get();
		
		Doctores doc = docRepo.findById(request.getDoctor().getDoctorId()).get();
		
		d.setFecha(request.getFecha());
		d.setDetalle(request.getDetalle());
		d.setPaciente(p);
		d.setDoctor(doc);
		*/
		
		repo.save(d);
		
		return d;
		
	}

	@Override
	public Diagnostico buscar(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Diagnostico buscarPorNombre(String nombre) {
		
		return null;
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
