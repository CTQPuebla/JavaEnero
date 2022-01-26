package com;
import java.util.*;
import com.Empleado;

public class Principal2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0, opcionNumEmp = 0, numEmp = 0, tamanio=0;
		double sueldo = 0,sueldoOriginal=0;
		List<Empleado> empleados = new ArrayList<>();
		String numEmpleado = "", nombreCompleto = "",opcionLetra="";
		
		do {  
			System.out.println("********** MENÚ **********");
			System.out.println("1. Agregar empleado");
			System.out.println("2. Aumentar sueldo");
			System.out.println("3. Eliminar");
			System.out.println("4. Filtrar empleado por area");
			System.out.println("5. Mostrar todos");
			System.out.println("6. Salir");
			System.out.println("Ingresa el número de la opción deseada");
			opcionLetra = sc.nextLine();
			try {
				opcion = Integer.parseInt(opcionLetra);
				switch(opcion) {
				case 1:
					Empleado emp1 = new Empleado();
					String dato = "";
					numEmp++;
					emp1.setNumEmpleado(Integer.toString(numEmp));
					System.out.println("Nombre:");
					dato = sc.nextLine();
					emp1.setNombre(dato.toUpperCase());
					System.out.println("Apellido paterno:");
					dato = sc.nextLine();
					emp1.setApellidoPaterno(dato.toUpperCase());
					System.out.println("Apellido materno:");
					dato = sc.nextLine();
					emp1.setApellidoMaterno(dato.toUpperCase());
					System.out.println("RFC:");
					dato = sc.nextLine();
					emp1.setRfc(dato.toUpperCase());
					System.out.println("Área:");
					dato = sc.nextLine();
					emp1.setArea(dato.toUpperCase());
					empleados.add(emp1);
					System.out.println("\n");
					break;
				case 2:
					if(empleados.size() >0){
						boolean encontroEmp = false,aumentoCorrecto=false;
						do {
							System.out.println("Seleccione un empleado");
							for(int i = 0; i<empleados.size() ; i++) {
								System.out.println(empleados.get(i).getNumEmpleado()+"\t"+empleados.get(i).getNombreCompleto()+" ($"+empleados.get(i).getSueldo()+")");
							}
							
							opcionNumEmp = sc.nextInt();
							for(int i = 0; i<empleados.size() ; i++) {
								if(empleados.get(i).getNumEmpleado().equals(Integer.toString(opcionNumEmp))) {
									sueldoOriginal = empleados.get(i).getSueldo();
									do {
										System.out.println("Ingrese el porcentaje (%) de aumento de sueldo para "+empleados.get(i).getNombreCompleto()+":");
										sueldo = sc.nextDouble();
										if(sueldo>0 && sueldo<=100) {
											sueldoOriginal *= 1+(sueldo/100);
											empleados.get(i).setSueldo(sueldoOriginal);
											encontroEmp = true;
											aumentoCorrecto = true;
										}else {
											System.out.println("Porcentaje de aumento incorrecto, intente de nuevo.");
										}
										
									} while(!aumentoCorrecto);
								}
							}
							if(encontroEmp) {
								System.out.println(empleados.get(opcionNumEmp-1).getNombreCompleto()+": $"+empleados.get(opcionNumEmp-1).getSueldo());
							} else {
								System.out.println("Número de empleado incorrecto.");
							}
						} while(!encontroEmp);
						System.out.println("\n");
					} else {
						System.out.println("No hay empleados registrados.\n");
					}
					break;
				case 3:
					if(empleados.size() >0){
						boolean encontroEmp2 = false;
						do {
							System.out.println("Ingrese el número de empleado");
							for(int i = 0; i<empleados.size() ; i++) {
								System.out.println(empleados.get(i).getNumEmpleado()+"\t"+empleados.get(i).getNombreCompleto());
							}
							
							opcionNumEmp = sc.nextInt();
							for(int i = 0; i<empleados.size() ; i++) {
								if(empleados.get(i).getNumEmpleado().equals(Integer.toString(opcionNumEmp))) {
									nombreCompleto = empleados.get(i).getNombreCompleto();
									numEmpleado = empleados.get(i).getNumEmpleado();							
									empleados.remove(i);
									encontroEmp2 = true;
								}
							}
							if(encontroEmp2) {
								System.out.println("Se borró al empleado #"+numEmpleado+" "+nombreCompleto);
							} else {
								System.out.println("Número de empleado incorrecto.");
							}
						} while(!encontroEmp2);
						System.out.println("\n");
					} else {
						System.out.println("No hay empleados registrados.\n");
					}
					break;
				case 4:
					if(empleados.size() >0){
						List<Empleado> empleados2 = new ArrayList<>();
						boolean encontroEmp3=false;
						do {
							System.out.println("¿Qué área está buscando?");
							String area = sc.nextLine();
							area = area.toUpperCase();
							for(int i = 0; i<empleados.size() ; i++) {
								if(empleados.get(i).getArea().equals(area)) {
									empleados2.add(empleados.get(i));
									encontroEmp3 = true;
								}
							}
							if(encontroEmp3) {
								for(int i = 0; i<empleados2.size() ; i++) {
									System.out.println(empleados2.get(i));
									}
							} else {
								System.out.println("No se encontró ningún empleado del área "+area);
							}
						} while(!encontroEmp3);
						System.out.println("\n");
					} else {
						System.out.println("No hay empleados registrados.\n");
					}
					break;
				case 5:
					if(empleados.size() >0){
						for(int i = 0; i<empleados.size() ; i++) {
							System.out.println(empleados.get(i));
						}
						System.out.println("\n");
					} else {
						System.out.println("No hay empleados registrados.\n");
					}
					break;
				}
			} catch(Exception ex) {
				System.out.println("Opcion inválida, intente de nuevo.\n");
			}
		} while(opcion < 6);
		System.out.println("ADIOS..........");
	}

}
