package com.mspacientes.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mspacientes.service.PacienteService;
import com.persistence.entity.Paciente;
import com.persistence.repository.PacienteRepository;
import com.persistence.request.PacienteRequest;

@Service
public class PacienteImplements implements PacienteService{

	@Autowired
	PacienteRepository repo;
	@Override
	public Paciente guardar(PacienteRequest request) {
		
		Paciente p = new Paciente();
		
		p.setNombre(request.getNombre());
		p.setApp(request.getApp());
		p.setApm(request.getApm());
		p.setCurp(request.getCurp());
		p.setFechaNacimiento(request.getFechaNacimiento());
		p.setNss(request.getNss());
		p.setSexo(request.getSexo());
		p.setTipoSangre(request.getTipoSangre());
		
		repo.save(p);
		
		System.out.println("paciente obj r" + request);
		System.out.println("paciente obj p" + p);
		
		return p;
	}

	@Override
	public Paciente actualizar(PacienteRequest request) {
		
		System.out.println("actualizar: " + request);
		
		Paciente p = repo.findById(request.getPacienteId()).get();
		
		p.setNombre(request.getNombre());
		p.setApp(request.getApp());
		p.setApm(request.getApm());
		p.setCurp(request.getCurp());
		p.setFechaNacimiento(request.getFechaNacimiento());
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
