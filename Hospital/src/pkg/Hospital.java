package pkg;

import java.util.Date;

public class Hospital {
	private String nombreHospital, sucursal;
		
	public Hospital(String nombreHospital, String sucursal) {
		super();
		this.nombreHospital = nombreHospital;
		this.sucursal = sucursal;
	}
	
	public String getNombreHospital() {
		return nombreHospital;
	}

	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	

	@Override
	public String toString() {
		return "Hospital [Nombre del Hospital=" + nombreHospital + ", sucursal=" + sucursal + "]";
	}


// comportamiento propio
	public Object crearCita(Carnet car) {
		int contador = 0001;
		if(car.getNumCarnet() != "0") {	
			return new Cita(car.getNombrePaciente(), car.getNumCarnet(), car.getDireccionPaciente(),
					car.getTelefonoPaciente(), car.getContactoEmergencia(), new Date(), ++contador, ++contador*3, car); 
			} else {
				return "Carnet no existe";
			}
	}
	
}
