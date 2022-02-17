package com.msmedicamentos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msmedicamentos.service.MedicamentosService;
import com.persistence.entity.Medicamentos;
import com.persistence.repository.MedicamentosRepository;
import com.persistence.request.MedicamentosRequest;

@Service
public class MedicamentosImplements implements MedicamentosService {

	// Inyeccion de la interface de acceso de datos
	@Autowired
	MedicamentosRepository repo;

	@Override
	public Medicamentos guardar(MedicamentosRequest request) {

		Medicamentos m = new Medicamentos();

		m.setNombre(request.getNombre());
		m.setPatente(request.getPatente());
		m.setFechaCad(request.getFechaCad());
		m.setIngredienteAct(request.getIngredienteAct());
		m.setMarca(request.getMarca());

		repo.save(m);

		return m;
	}

	@Override
	public Medicamentos actualizar(MedicamentosRequest request) {

		Medicamentos m = repo.findById(request.getMedicamentoId()).get();

		m.setNombre(request.getNombre());
		m.setPatente(request.getPatente());
		m.setFechaCad(request.getFechaCad());
		m.setIngredienteAct(request.getIngredienteAct());
		m.setMarca(request.getMarca());

		repo.save(m);

		return m;
	}

	@Override
	public Medicamentos buscar(int id) {

		Medicamentos m = repo.findById(id).get();

		return m;
	}

	@Override
	public Medicamentos buscarPorNombre(String nombre) {

		return repo.findByName(nombre);
	}

	@Override
	public String eliminar(int id) {
		
		repo.deleteById(id);

		return "Eliminado";
	}

	@Override
	public List<Medicamentos> mostrar() {
		
		return repo.findAll();

	}

}
