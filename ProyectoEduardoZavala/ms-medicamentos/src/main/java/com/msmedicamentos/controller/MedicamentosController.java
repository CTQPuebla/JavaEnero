package com.msmedicamentos.controller;

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

import com.msmedicamentos.service.MedicamentosService;
import com.persistence.entity.Medicamentos;
import com.persistence.request.MedicamentosRequest;



@RestController
@RequestMapping("medicamentos/")
public class MedicamentosController {
	
	@Autowired
	MedicamentosService service;
	
	
	@GetMapping("mostrar-todos")
	public List<Medicamentos> mostrarTodos() {

		return service.mostrar();
	}
	
	@PostMapping("guardar-medicamento")
	public Medicamentos guardar(@RequestBody MedicamentosRequest request) {
		
		return service.guardar(request);
	}
	
	@PutMapping("actualizar-medicamento")
	public Medicamentos actualizar(@RequestBody MedicamentosRequest request) {

		return service.actualizar(request);
	}
	
	
	@GetMapping("buscar-por-id/{id}")
	public Medicamentos buscar(@PathVariable int id) {

		return service.buscar(id);
	}
	
	@DeleteMapping("eliminar/{id}")
	public String borrar(@PathVariable int id) {

		return service.eliminar(id);
	}
	
	@GetMapping("buscar-por-nombre/{name}")
	public Medicamentos findByName(@PathVariable String name) {

		return service.buscarPorNombre(name);
	}
	
}
