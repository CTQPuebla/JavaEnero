package com.mspacientes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mspacientes.service.PacientesService;
import com.persistence.entity.Pacientes;
import com.persistence.repository.PacientesRepository;
import com.persistence.request.PacientesRequest;


@Service
public class PacientesImplements implements PacientesService {
	
	//Inyeccion de la interface de acceso de datos
	@Autowired
	PacientesRepository repo;
	
	
	
	@Override
	public Pacientes guardar(PacientesRequest request) {
		
		Pacientes p = new Pacientes();
		
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
	public Pacientes actualizar(PacientesRequest request) {
		
		Pacientes p = repo.findById(request.getPacienteId()).get();
		//repo.getOne(id); no se usa deprecated
		
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
	public Pacientes buscar(int id) {
		
		Pacientes p = repo.findById(id).get();
		
		return p;
	}

	@Override
	public Pacientes buscarPorNombre(String nombre) {
		
		return repo.findByName(nombre);
	}

	@Override
	public String eliminar(int id) {
		
		repo.deleteById(id);
		
		return "Eliminado";
	}

	@Override
	public List<Pacientes> mostrar() {
		return repo.findAll();
	}

}
