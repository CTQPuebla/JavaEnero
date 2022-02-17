package com.msdiagnosticos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msdiagnosticos.service.DiagnosticoService;
import com.persistence.entity.Diagnostico;
import com.persistence.request.DiagnosticoRequest;


@RestController
@RequestMapping("diagnosticos/")
public class DiagnosticoController {
	
	@Autowired
	DiagnosticoService service;
	
	@GetMapping("mostrar-todos")
	public List<Diagnostico> mostrarTodos(){
		return service.mostrar();
	}
	
	@PostMapping("guardar-doctor")
	public Diagnostico save(@RequestBody DiagnosticoRequest request) {
		return service.guardar(request);
	}
	
	@PutMapping("actualizar-doctor")
	public Diagnostico update(@RequestBody DiagnosticoRequest request) {
		return service.actualizar(request);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public Diagnostico find(@PathVariable int id) {
		return service.buscar(id);
	}
	
	@DeleteMapping("eliminar/{id}")
	public String delete(@PathVariable int id) {
		return service.eliminar(id);
	}
	
	@GetMapping("buscar-por-nombre/{name}")
	public Diagnostico findByName(@PathVariable String name) {
		return service.buscarPorNombre(name);
	}


}
