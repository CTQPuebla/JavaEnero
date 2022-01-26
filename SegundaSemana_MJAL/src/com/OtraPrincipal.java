package com;

import java.util.*;

public class OtraPrincipal {
	public static void main(String[] args) {
		
		int opc;
		boolean salir=false;
		String nom;
		String mat;
		int e,grad;
		String gru;
		String t;
		
		List<Alumno> alumnos= new ArrayList<>();
		List<Alumno> matriculas= new ArrayList<>();
		Alumno a=null;
		Scanner sc = null;
		//try {
		do {
			System.out.println("1. Agregar alumno");
			System.out.println("2. Editar alumno");
			System.out.println("3. Eliminar alumno");
			System.out.println("4. Muestra un alumno por matricula");
			System.out.println("5. Mostrar todos los alumnos");
			System.out.println("6. Salir");
			
			System.out.println("Ingrese el numero de opcion:");
			sc=new Scanner(System.in);
			opc=sc.nextInt();
			
			switch(opc) {
				case 1:
					System.out.println("-----Agregar Alumno-----");
					System.out.print("Nombre:");
					sc=new Scanner(System.in);
					nom=sc.nextLine();
					
					System.out.print("Matricula:");
					sc=new Scanner(System.in);
					mat=sc.nextLine();
					
					System.out.print("Edad:");
					sc=new Scanner(System.in);
					e=sc.nextInt();
					
					System.out.print("Grado:");
					sc=new Scanner(System.in);
					grad=sc.nextInt();
					
					System.out.print("Grupo:");
					sc=new Scanner(System.in);
					gru=sc.nextLine();
					
					System.out.print("Turno:");
					sc=new Scanner(System.in);
					t=sc.nextLine();
					
					a=new Alumno(nom,mat,e,grad,gru,t);
					alumnos.add(a);

					break;
				case 2:
					System.out.println("-----Editar Alumno-----");
					System.out.print("Ingrese la matricula del alumno:");
					sc=new Scanner(System.in);
					mat=sc.nextLine();
					
					for(int i=0;i<alumnos.size();i++) {
						if(alumnos.get(i).getMatricula().equals(mat)) {
							System.out.print("Nombre:");
							sc=new Scanner(System.in);
							nom=sc.nextLine();
							
							System.out.print("Edad:");
							sc=new Scanner(System.in);
							e=sc.nextInt();
							
							System.out.print("Grado:");
							sc=new Scanner(System.in);
							grad=sc.nextInt();
							
							System.out.print("Grupo:");
							sc=new Scanner(System.in);
							gru=sc.nextLine();
							
							System.out.print("Turno:");
							sc=new Scanner(System.in);
							t=sc.nextLine();
							
							alumnos.get(i).setNombre(nom);
							alumnos.get(i).setEdad(e);
							alumnos.get(i).setGrado(grad);
							alumnos.get(i).setGrupo(gru);
							alumnos.get(i).setTurno(t);
						}
					}
			
					break;
				case 3:
					System.out.println("-----Eliminar Alumno-----");
					System.out.println("Ingrese la matricula del alumno:");
					sc=new Scanner(System.in);
					mat=sc.nextLine();
					
					for(int j=0;j<alumnos.size();j++) {
						if(alumnos.get(j).getMatricula().equals(mat)) {
							alumnos.remove(j);
						}
					}
					break;
				case 4:
					System.out.println("-----Mostrar un Alumno-----");
					System.out.println("Ingrese la matricula del alumno:");
					sc=new Scanner(System.in);
					mat=sc.nextLine();
					
					for(int k=0;k<alumnos.size();k++) {
						if(alumnos.get(k).getMatricula().equals(mat)) {
							System.out.println(k);
						}
					}
					break;
				case 5:
					System.out.println("-----Lista de todos los Alumnos-----");
					System.out.println(a);
					break;
				case 6:
					salir=true;
					break;
				default: 
					System.out.println("Ingrese solo numeros del 1 al 5 o 0 para salir");
			}
		}while(!salir);
		//}catch(Exception ex){}
	}
}
