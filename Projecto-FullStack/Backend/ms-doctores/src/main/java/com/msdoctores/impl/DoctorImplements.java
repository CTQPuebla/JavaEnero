package com.msdoctores.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msdoctores.service.DoctorService;
import com.persistence.entity.Doctores;
import com.persistence.entity.Paciente;
import com.persistence.repository.DoctorRepository;
import com.persistence.request.DoctorRequest;



@Service
public class DoctorImplements implements DoctorService{
	
	@Autowired
	DoctorRepository repo;

	@Override
	public Doctores guardar(DoctorRequest request) {
		
		Doctores d = new Doctores();
		
		d.setNombre(request.getNombre());
		d.setEspecialidad(request.getEspecialidad());
		d.setCedula(request.getCedula());
		d.setFechaNacimiento(request.getFechaNacimiento());
		d.setSexo(request.getSexo());
		
		repo.save(d);
		
		//System.out.println("paciente obj r" + request);
		//System.out.println("paciente obj p" + p);
		
		return d;
		
	}

	@Override
	public Doctores actualizar(DoctorRequest request) {
		
		//System.out.println("actualizar: " + request);
		
		Doctores d = repo.findById(request.getDoctorId()).get();
		
		d.setNombre(request.getNombre());
		d.setEspecialidad(request.getEspecialidad());
		d.setCedula(request.getCedula());
		d.setFechaNacimiento(request.getFechaNacimiento());
		d.setSexo(request.getSexo());
		
		repo.save(d);
		
		return d;
		
	}

	@Override
	public Doctores buscar(int id) {
		
		Doctores d = repo.findById(id).get();
		
		return d;
	}

	@Override
	public Doctores buscarPorNombre(String nombre) {
		
		return repo.findByName(nombre);
	}

	@Override
	public String eliminar(int id) {
		
		repo.deleteById(id);
		return "Eliminado";
		
	}

	@Override
	public List<Doctores> mostrar() {
		
		return repo.findAll();
		
	}
	
	

}
