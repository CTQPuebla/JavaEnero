package com.msdoctores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msdoctores.service.DoctoresService;
import com.persistence.entity.Doctores;
import com.persistence.request.DoctoresRequest;

@RestController
@RequestMapping("doctores/")
public class DoctoresController {

	@Autowired
	DoctoresService service;

	@GetMapping("mostrar-todos")
	public List<Doctores> mostrarTodos() {

		return service.mostrar();
	}

	@PostMapping("guardar-doctor")
	public Doctores guardar(@RequestBody DoctoresRequest request) {

		return service.guardar(request);
	}

	@PutMapping("actualizar-doctor")
	public Doctores actualizar(@RequestBody DoctoresRequest request) {

		return service.actualizar(request);
	}

	@GetMapping("buscar-por-id/{id}")
	public Doctores buscar(@PathVariable int id) {

		return service.buscar(id);
	}

	@DeleteMapping("eliminar/{id}")
	public String borrar(@PathVariable int id) {

		return service.eliminar(id);
	}

	@GetMapping("buscar-por-nombre/{nombre}")
	public Doctores findByName(@PathVariable String nombre) {

		return service.buscarPorNombre(nombre);
	}
}
