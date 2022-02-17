package com.mspacientes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mspacientes.services.PacienteService;
import com.persistence.entity.Paciente;
import com.persistence.repository.PacienteRepository;
import com.persistence.request.PacienteRequest;

@Service
public class PacienteImplements implements PacienteService{
	
	//Inyección de la interface de acceso a datos
	@Autowired
	PacienteRepository repo;
	
	@Override
	public Paciente guardar(PacienteRequest request) {
		Paciente p = new Paciente();
		p.setNombre(request.getNombre());
		p.setApp(request.getApp());
		p.setApm(request.getApm());
		p.setCurp(request.getCurp());
		p.setFechaNac(request.getFechaNac());
		p.setNss(request.getNss());
		p.setSexo(request.getSexo());
		p.setTipoSangre(request.getTipoSangre());
		repo.save(p);
		return p;
	}

	@Override
	public Paciente actualizar(PacienteRequest request) {
		Paciente p = repo.findById(request.getPacienteId()).get();
		
		p.setNombre(request.getNombre());
		p.setApp(request.getApp());
		p.setApm(request.getApm());
		p.setCurp(request.getCurp());
		p.setFechaNac(request.getFechaNac());
		p.setNss(request.getNss());
		p.setSexo(request.getSexo());
		p.setTipoSangre(request.getTipoSangre());
		repo.save(p);
		return p;
	}

	@Override
	public Paciente buscar(int id) {
		Paciente p = repo.findById(id).get();
		return p;
	}

	@Override
	public Paciente buscarPorNombre(String nombre) {
		return repo.findByName(nombre);
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List<Paciente> mostrar() {
		return repo.findAll();
	}
	
}
