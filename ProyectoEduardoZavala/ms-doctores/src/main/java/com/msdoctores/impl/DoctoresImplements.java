package com.msdoctores.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msdoctores.service.DoctoresService;
import com.persistence.entity.Doctores;
import com.persistence.repository.DoctoresRepository;
import com.persistence.request.DoctoresRequest;

@Service
public class DoctoresImplements implements DoctoresService {

	// Inyeccion de la interface de acceso de datos
	@Autowired
	DoctoresRepository repo;

	@Override
	public Doctores guardar(DoctoresRequest request) {
		System.out.println(request);

		Doctores d = new Doctores();

		d.setNombre(request.getNombre());
		d.setEspecialidad(request.getEspecialidad());
		d.setCedula(request.getCedula());
		d.setFechaNac(request.getFechaNac());
		d.setSexo(request.getSexo());

		repo.save(d);

		return d;
	}

	@Override
	public Doctores actualizar(DoctoresRequest request) {
		Doctores d = repo.findById(request.getDoctorId()).get();
		// repo.getOne(id); no se usa deprecated

		d.setNombre(request.getNombre());
		d.setEspecialidad(request.getEspecialidad());
		d.setCedula(request.getCedula());
		d.setFechaNac(request.getFechaNac());
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
