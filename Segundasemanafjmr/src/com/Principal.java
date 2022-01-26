package com;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i = 0;
		int x = 0;
		Scanner scan = new Scanner(System.in);
		String a;
		String b;
		String c;
		double d = 0.0d;
		
		List<Generica> l = new ArrayList<>();
	
		
		System.out.println("Eliga lo que quiera hacer: ");
		
		do {
			System.out.println("1. Add");
			System.out.println("2. Editar");
			System.out.println("3. Eliminar");
			System.out.println("4. Mostrar todo");
			System.out.println("5. Mostrar por carrera");
			System.out.println("6. Salir");
			x = scan.nextInt();
				
			switch(x)
			{
			 case 1:
				 if(x == 1)
				 {
					 System.out.println("");
					System.out.println("Introduzca el nombre: ");
					a = scan.next();
					
					System.out.println("Introduzca la matricula: ");
					b = scan.next();
					System.out.println("Introduzca la carrera: ");
					c = scan.next();
					System.out.println("Introduzca su promedio: ");
					d = scan.nextDouble();
					l.add(new Generica(a,b,c,d));
					System.out.println("");
					
				 }
				 break;
			
			 case 2:
				 if(x == 2)
				 {
					System.out.println("Introduzca la matricula de la persona a modificar: ");
					    a = scan.next();
					  for(i = 0; i < l.size();i++)
					   {
					     try {

						    	if(l.get(i).getMatricula().equals(a))
						    	{
						    		
						    		System.out.println("Introduzca el nombre: ");
									a = scan.next();
									
									System.out.println("Introduzca la matricula: ");
									b = scan.next();
									System.out.println("Introduzca la carrera: ");
									c = scan.next();
									System.out.println("Introduzca su promedio: ");
									d = scan.nextDouble();
									
									l.get(i).setNombre(a);
									l.get(i).setMatricula(b);
									l.get(i).setCarrera(c);
									l.get(i).setPromedio(d);
									System.out.println("Insercion exitosa");
						    	}
					     
					     }
					    
					    catch(Exception e)
					    	{
					   			System.out.println("Matricula no encontrada");
					   		}
							 
					    }
				  }
				 
				 break;
			
		     case 3: 
		    	 if(x == 3)
				 {
					System.out.println("Matricula del estudiante a eliminar: ");
					a = scan.next();
				   for(i = 0; i < l.size(); i++)
				   {
						try {
								if(l.get(i).getMatricula().equals(a))
						    	{
									l.remove(i);
						    	}
						}
						catch(Exception e){
						 System.out.println("Matricula no encontrada");	
						}
				   }
				 }
				break;
			
		 	 case 4: 
		 		 if(x == 4)
				 {
					System.out.println(l);
				 }
				break;
			
		 	 case 5: 
		 		 System.out.println("Escriba la carrera para ver sus estudiantes: ");
		 		 a = scan.next();
		 		 for(i = 0; i < l.size();i++)
		 		 {
		 			 if(l.get(i).getCarrera().equals(a))
		 			 {
		 				 System.out.println("Estos son todos los de la carrera: ");
		 				 System.out.print(l.get(i));
		 			 }
		 		 }
		 		 break;
		 	 case 6:
		 		 System.out.println("Adios");
		 		 System.exit(0);
		 		 
			default: System.out.println("Error no es una opcion, intente de nuevo. ");
			}
			
		}while(x > 0 && x < 6);
	
		
	
		
  }	
	
	
}
