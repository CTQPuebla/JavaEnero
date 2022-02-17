package com.msdoctores.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msdoctores.services.DoctorService;
import com.persistence.entity.Doctor;
import com.persistence.repository.DoctorRepository;
import com.persistence.request.DoctorRequest;

@Service
public class DoctorImplements implements DoctorService {
	
	//Inyección de la interface de acceso a datos
	@Autowired
	DoctorRepository repo;
	
	@Override
	public Doctor guardar(DoctorRequest request) {
		Doctor d = new Doctor();
		d.setNombre(request.getNombre());
		d.setEspecialidad(request.getEspecialidad());
		d.setCedula(request.getCedula());
		d.setFechaNac(request.getFechaNac());
		d.setSexo(request.getSexo());
		repo.save(d);
		return d;
	}

	@Override
	public Doctor actualizar(DoctorRequest request) {
		Doctor d = repo.findById(request.getDoctorId()).get();
		d.setNombre(request.getNombre());
		d.setEspecialidad(request.getEspecialidad());
		d.setCedula(request.getCedula());
		d.setFechaNac(request.getFechaNac());
		d.setSexo(request.getSexo());
		repo.save(d);
		return d;
	}

	@Override
	public Doctor buscar(int id) {
		Doctor d = repo.findById(id).get();
		return d;
	}

	@Override
	public Doctor buscarPorCedula(String cedula) {
		return repo.findByCed(cedula);
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List<Doctor> mostrar() {
		return repo.findAll();
	}

}
