package com.mspacientes.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mspacientes.service.PacientesService;
import com.persistence.entity.Pacientes;
import com.persistence.request.PacientesRequest;

@RestController
@RequestMapping("pacientes/")
@CrossOrigin(origins="*")
public class PacientesController {

	@Autowired
	PacientesService service;
	
	
	@GetMapping("mostrar-todos")
	public List<Pacientes> mostrarTodos() {

		return service.mostrar();
	}
	
	@PostMapping("guardar-paciente")
	public Pacientes guardar(@RequestBody PacientesRequest request) {
		
		return service.guardar(request);
	}
	
	@PutMapping("actualizar-paciente")
	public Pacientes actualizar(@RequestBody PacientesRequest request) {

		return service.actualizar(request);
	}
	
	
	@GetMapping("buscar-por-id/{id}")
	public Pacientes buscar(@PathVariable int id) {

		return service.buscar(id);
	}
	
	@DeleteMapping("eliminar/{id}")
	public String borrar(@PathVariable int id) {

		return service.eliminar(id);
	}
	
	@GetMapping("buscar-por-nombre/{name}")
	public Pacientes findByName(@PathVariable String name) {

		return service.buscarPorNombre(name);
	}
}
