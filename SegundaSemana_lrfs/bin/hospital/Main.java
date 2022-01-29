package evaluacion;

public class Main {

	public static void main(String[] args) {
		System.out.println("Creando el objeto de tipo \"Hospital\":");
		Hospital imss = new Hospital("IMSS", "calle IMSS #123");
		System.out.println(imss.toString());
		
		System.out.println("\nAsignando especialidades al hospital:");
		imss.addEspecialidades("Urgencias");
		imss.addEspecialidades("Medicina Familiar");
		imss.addEspecialidades("Cirugia general");
		imss.addEspecialidades("Imagenologia");
		imss.addEspecialidades("Endocrinologia");
		System.out.println(imss.toString());
		
		System.out.println("\nAsignando medicos al hospital:");
		Medico medicoUrgenciologo = new Medico("Medico Urgenciologo", 48, "calle Medico Urgenciologo #123", "Urgencias");
		imss.addMedico(medicoUrgenciologo);
		Medico medicoFamiliar = new Medico("Medico Familiar", 35, "calle Medico Familiar", "Medicina Familiar");
		imss.addMedico(medicoFamiliar);
		Medico medicoCirujanoGeneral = new Medico("Medico Cirujano General", 41, "calle Cirujano General", "Cirugia General");
		imss.addMedico(medicoCirujanoGeneral);
		Medico medicoImagenologo = new Medico("Medico Imagenologo", 35, "Calle Imagenologo", "Imagenologia");
		imss.addMedico(medicoImagenologo);
		Medico medicoEndocrinologo = new Medico("Medico Endocrinologo", 53, "Calle Endocrinologo", "Endocrinologia");
		imss.addMedico(medicoEndocrinologo);
		System.out.println(imss.toString());
		
		System.out.println("\nUtilizando el metodo abtracto \"showResponsabilities\" en clase abstracta \"TrabajadorDeHospital\" desde objeto de clase \"Medico\"");
		medicoEndocrinologo.showResponsabilities();
		
		System.out.println("\nAgregando pacientes al hospital:");
		Paciente paciente1 = new Paciente("Paciente 1", "calle Paciente 1", "Mexicano", 36);
		imss.addPaciente(paciente1);
		Paciente paciente2 = new Paciente("Paciente 2", "calle Paciente 2", "Mexicano", 15);
		imss.addPaciente(paciente2);
		Paciente paciente3 = new Paciente("Paciente 3", "calle Paciente 3", "Mexicano", 27);
		imss.addPaciente(paciente3);
		Paciente paciente4 = new Paciente("Paciente 4", "calle Paciente 4", "Mexicano", 90);
		imss.addPaciente(paciente4);
		Paciente paciente5 = new Paciente("Paciente 5", "calle Paciente 5", "Mexicano", 11);
		imss.addPaciente(paciente5);
		System.out.println(imss.toString());
		
		System.out.println("\nAsignando pacientes a medicos:");
		medicoUrgenciologo.addPacienteAsignado(paciente1);
		System.out.println(medicoUrgenciologo.toString());
		medicoFamiliar.addPacienteAsignado(paciente2);
		System.out.println(medicoFamiliar.toString());
		medicoFamiliar.addPacienteAsignado(paciente3);
		System.out.println(medicoFamiliar.toString());
		medicoImagenologo.addPacienteAsignado(paciente1);
		System.out.println(medicoImagenologo.toString());
		medicoEndocrinologo.addPacienteAsignado(paciente4);
		System.out.println(medicoEndocrinologo.toString());
		
		System.out.println("\nCreando expediente de urgencias para paciente1:");
		paciente1.createExpediente(medicoUrgenciologo, "antecedentes paciente 1", "diagnostico de medicoUrgenciologo", "Urgencias", 15);
		System.out.println(paciente1.getExpedientes());
		System.out.println("\nCreando expediente de cirugia general para paciente1:");
		paciente1.createExpediente(medicoCirujanoGeneral, "antecedentes paciente 1", "diagnostico de medicoCirujanoGeneral", "Cirugia general", 2);
		System.out.println(paciente1.getExpedientes());
		
		System.out.println("\nEstado actual del hospital:");
		System.out.println(imss.toString());
	}
}
