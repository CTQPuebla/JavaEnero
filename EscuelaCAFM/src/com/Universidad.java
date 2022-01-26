package com;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
	private int numPlanEstudios;
	private String nombre, domicilio;
	private List<PlanEstudios> planEstudios;
	
	public Universidad(String nombre, String domicilio) {
		super();
		this.numPlanEstudios = 0;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.planEstudios = new ArrayList<>();
	}

	public int getNumPlanEstudios() {
		return numPlanEstudios;
	}

	public void setNumPlanEstudios(int numPlanEstudios) {
		this.numPlanEstudios = numPlanEstudios;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public List<PlanEstudios> getPlanEstudios() {
		return planEstudios;
	}

	@Override
	public String toString() {
		if(numPlanEstudios == 0) {
			return "Universidad [nombre=" + nombre + ", domicilio=" + domicilio + ", numPlanEstudios=" + numPlanEstudios + "]";
		} else {
			return "Universidad [nombre=" + nombre + ", domicilio=" + domicilio + ", numPlanEstudios=" + numPlanEstudios
					+ ", planEstudios=\n " + planEstudios + "]";
		}
	}

	public void agregarPlanEstudios(PlanEstudios planEst) {
		this.planEstudios.add(planEst);
		this.setNumPlanEstudios(this.getPlanEstudios().size());
	}
	
}
