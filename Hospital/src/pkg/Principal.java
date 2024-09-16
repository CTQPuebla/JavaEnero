package pkg;

import java.util.HashMap;

public class Principal {
	public static void main(String[] args) {
		
		HashMap<String, Cita> agenda = new HashMap<String, Cita>();
		
		Hospital h1 = new Hospital("IMSS", "Gabriel Mancera");
		
		Carnet car1 = new Carnet("Mario Diaz", "3456", "Av. de la luz 7", "5598238734", "Esposa: 46355768");
		Carnet car2 = new Carnet("Magdalena Flores", "0345", "Ferrocarriles 47", "7773704481", "Esposo: 4509237676");
		Carnet car3 = new Carnet("Juan Rivas", "1003", "valle del sol 66", "2229767801", "Padre: 2228564534");
		Carnet car4 = new Carnet("Macarena Reyes", "3456", "Av. de la luz 7", "5598238734", "Esposa: 46355768");
		Carnet car5 = new Carnet("Maria Perez", "0", "Av. verde 69", "5509658744", "Esposo: 46355768");
		
		Cita cita1 = (Cita) h1.crearCita(car1);
		Cita cita2 = (Cita) h1.crearCita(car2);
		Cita cita3 = (Cita) h1.crearCita(car3);
		Cita cita4 = (Cita) h1.crearCita(car4);
	//	Cita cita5 = (Cita) h1.crearCita(car5);
		
		try {
			Cita cita5 = (Cita) h1.crearCita(car5);
		} catch(Exception e) {
			String error = (String) h1.crearCita(car5);
			System.out.println(error);
		}
		
		
		
		agenda.put(cita1.getNombrePaciente(), cita1);
		agenda.put(cita2.getNombrePaciente(), cita2);
		agenda.put(cita3.getNombrePaciente(), cita3);
		agenda.put(cita4.getNombrePaciente(), cita4);
//		agenda.put(cita5.getNombrePaciente(), cita5);
		
		//imprimir unicamente agenda
//		System.out.println(agenda.toString());
		
		//imprimir citas
		System.out.println(agenda.get("Mario Diaz"));
		System.out.println(agenda.get("Magdalena Flores"));
		System.out.println(agenda.get("Juan Rivas"));
		System.out.println(agenda.get("Macarena Reyes"));
		if(agenda.containsKey("Maria Perez")) {
			System.out.println(agenda.get("Maria Perez"));
		} else {
			System.out.println("No se encontro carnet");
		}
	}

}
