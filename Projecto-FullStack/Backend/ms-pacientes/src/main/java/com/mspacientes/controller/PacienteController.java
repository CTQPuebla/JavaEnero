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

import com.mspacientes.service.PacienteService;
import com.persistence.entity.Paciente;
import com.persistence.request.PacienteRequest;

@RestController
@RequestMapping("pacientes/")
@CrossOrigin(origins="*")
public class PacienteController {
	
	@Autowired
	PacienteService service;
	
	@GetMapping("mostrar-todos")
	public List<Paciente> mostrarTodos(){
		return service.mostrar();
	}
	
	@PostMapping("guardar-paciente")
	public Paciente save(@RequestBody PacienteRequest request) {
		return service.guardar(request);
	}
	
	@PutMapping("actualizar-paciente")
	public Paciente update(@RequestBody PacienteRequest request) {
		return service.actualizar(request);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public Paciente find(@PathVariable int id) {
		return service.buscar(id);
	}
	
	@DeleteMapping("eliminar/{id}")
	public String delete(@PathVariable int id) {
		return service.eliminar(id);
	}
	
	@GetMapping("buscar-por-nombre/{name}")
	public Paciente findByName(@PathVariable String name) {
		return service.buscarPorNombre(name);
	}
	
}
