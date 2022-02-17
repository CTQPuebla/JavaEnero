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

import com.msdoctores.services.DoctorService;
import com.persistence.entity.Doctor;
import com.persistence.request.DoctorRequest;

@RestController
@RequestMapping("doctores/")
public class DoctorController {
	@Autowired
	DoctorService service;
	
	@GetMapping("mostrar-todos")
	public List<Doctor> mostrarTodo(){
		return service.mostrar();
	}
	
	@PostMapping("guardar")
	public Doctor save(@RequestBody DoctorRequest request) {
		return service.guardar(request);
	}
	
	@PutMapping("actualizar")
	public Doctor update(@RequestBody DoctorRequest request) {
		return service.actualizar(request);
	}
	
	@GetMapping("buscar-por-id/{id}")
	public Doctor find(@PathVariable int id){
		return service.buscar(id);
	}
	
	@DeleteMapping("eliminar/{id}")
	public String delete(@PathVariable int id){
		return service.eliminar(id);
	}
	
	@GetMapping("buscar-por-cedula/{cedula}")
	public Doctor findByCed(@PathVariable String cedula){
		return service.buscarPorCedula(cedula);
	}
}
