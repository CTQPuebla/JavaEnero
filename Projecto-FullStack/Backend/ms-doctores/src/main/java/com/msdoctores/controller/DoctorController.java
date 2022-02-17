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

import com.msdoctores.service.DoctorService;
import com.persistence.entity.Doctores;
import com.persistence.request.DoctorRequest;

@RestController
@RequestMapping("doctores/")
public class DoctorController {
	
	@Autowired
	DoctorService service;
	
	@GetMapping("mostrar-todos")
	public List<Doctores> mostrarTodos(){
		return service.mostrar();
	}
	
	@PostMapping("guardar-doctor")
	public Doctores save(@RequestBody DoctorRequest request) {
		return service.guardar(request);
	}
	
	@PutMapping("actualizar-doctor")
	public Doctores update(@RequestBody DoctorRequest request) {
		return service.actualizar(request);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public Doctores find(@PathVariable int id) {
		return service.buscar(id);
	}
	
	@DeleteMapping("eliminar/{id}")
	public String delete(@PathVariable int id) {
		return service.eliminar(id);
	}
	
	@GetMapping("buscar-por-nombre/{name}")
	public Doctores findByName(@PathVariable String name) {
		return service.buscarPorNombre(name);
	}


}
