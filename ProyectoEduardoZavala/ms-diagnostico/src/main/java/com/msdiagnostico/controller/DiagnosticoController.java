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

import com.msdiagnostico.service.DiagnosticoService;
import com.persistence.entity.Diagnostico;
import com.persistence.request.DiagnosticoRequest;



@RestController
@RequestMapping("diagnostico/")
public class DiagnosticoController {
	
	@Autowired
	DiagnosticoService service;

	@GetMapping("mostrar-todos")
	public List<Diagnostico> mostrarTodos() {

		return service.mostrar();
	}

	@PostMapping("guardar-diagnostico")
	public Diagnostico guardar(@RequestBody DiagnosticoRequest request) {

		return service.guardar(request);
	}

	@PutMapping("actualizar-diagnostico")
	public Diagnostico actualizar(@RequestBody DiagnosticoRequest request) {

		return service.actualizar(request);
	}

	@GetMapping("buscar-por-id/{id}")
	public Diagnostico buscar(@PathVariable int id) {

		return service.buscar(id);
	}

	@DeleteMapping("eliminar/{id}")
	public String borrar(@PathVariable int id) {

		return service.eliminar(id);
	}

	
}
