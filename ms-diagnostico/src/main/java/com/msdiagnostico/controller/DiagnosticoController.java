package com.msdiagnostico.controller;

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

import com.msdiagnostico.services.DiagnosticoService;
import com.persistence.entity.Diagnostico;
import com.persistence.request.DiagnosticoRequest;

@RestController
@RequestMapping("diagnostico/")
public class DiagnosticoController {
	@Autowired
	DiagnosticoService service;
	
	@GetMapping("mostrar-todos")
	public List<Diagnostico> mostrarTodo(){
		return service.mostrar();
	}
	
	@PostMapping("guardar")
	public Diagnostico save(@RequestBody DiagnosticoRequest request) {
		return service.guardar(request);
	}
	
	@PutMapping("actualizar")
	public Diagnostico update(@RequestBody DiagnosticoRequest request) {
		return service.actualizar(request);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public Diagnostico find(@PathVariable int id){
		return service.buscar(id);
	}
	
	@DeleteMapping("eliminar/{id}")
	public String delete(@PathVariable int id){
		return service.eliminar(id);
	}
}
