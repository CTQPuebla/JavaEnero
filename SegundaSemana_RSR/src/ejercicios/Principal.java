package ejercicios;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Estado estado = new Estado();
		estado.setNombre("Nuevo leon");
		estado.setCapital("Monterrey");
		estado.setClave("clave");
		estado.setExtensionKm2(1234567);
		estado.setNumeroHabitantes(10);
		estado.setZona("Norte");
		
		System.out.println(estado);
		System.out.println(estado.toString());
		
		
		
		Smartphone smartphone = new Smartphone("Galaxy A51", "Samsung", 128, "CentOS 8", 2022);
		System.out.println(smartphone.toString());
		
		List<String> l = new ArrayList<>();
		
		l.add("cualquier cosa");
		l.add(new String("mientras sea un String"));
		l.add(";");
		
		
		System.out.println(l.get(2));
		System.out.println(l.remove(1));
		
		System.out.println("tamaño " + l.size());
		System.out.println(l);
		
		
		List<Integer> n = new ArrayList<>();
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		
		n.remove(5);
		n.remove(new Integer(5));
		
		n.remove(n.indexOf(4));
		System.out.println(n);
		
		*/
		
		Scanner sn = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner scan4 = new Scanner(System.in);
		Scanner scan5 = new Scanner(System.in);
		Scanner scan6 = new Scanner(System.in);
		Scanner scan7 = new Scanner(System.in);
		
		Scanner scan8 = new Scanner(System.in);
		Scanner scan9 = new Scanner(System.in);
		Scanner scan10 = new Scanner(System.in);
		Scanner scan11 = new Scanner(System.in);
		Scanner scan12 = new Scanner(System.in);
		Scanner scan13 = new Scanner(System.in);
		Scanner scan14 = new Scanner(System.in);
		Scanner scan15 = new Scanner(System.in);
		
		List <Smartphone> smartphones = new ArrayList<>();
		String modelo = "";
		String marca = "";
		int almacenamiento = 0;
		String sistemaOperativo = "";
		int anioModelo = 0;
	       boolean salir = false;
	       int opcion = 0;
	       int opcionIndiceModelo = 0;
	       int opcionEdicion = 0;
	       int eliminado = 0;
	       int opcionEliminar = 0;
	       int mostrado = 0;
	       String opcionAtributo = "";
	       String busquedaModelo = "";
	       
	       
	       Smartphone smartphone = new Smartphone();
	       
	       while(!salir){
	    	   //System.out.println("tamaño de la lista: " + smartphones.size());
	    	   //System.out.println(smartphones);
	           System.out.println("1. Crear Objeto");
	           System.out.println("2. Editar Objeto");
	           System.out.println("3. Eliminar Objeto");
	           System.out.println("4. Mostrar Objeto");
	           System.out.println("5. Salir");
	            
	           opcion = sn.nextInt();
	           
	           switch(opcion) {
	           
	           case 1:
	        	   
	        	   System.out.println("CREACION DE OBJETO");
	        	   
	        	   System.out.println("Escribe el modelo: ");
	        	   modelo = scan1.nextLine();
		           
		           System.out.println("Escribe la marca: ");
	        	   marca = scan2.nextLine();
		           
		           System.out.println("Escribe la capacidad de almacenamiento: ");
	        	   almacenamiento = scan3.nextInt();
		           
		           System.out.println("Escribe el sistema operativo: ");
	        	   sistemaOperativo = scan4.nextLine();
		           
		           System.out.println("Escribe el año del modelo: ");
	        	   anioModelo = scan5.nextInt();
		           
		           
		           smartphone.setModelo(modelo);
		           smartphone.setMarca(marca);
		           smartphone.setCapacidadAlmacenamiento(almacenamiento);
		           smartphone.setSistemaOperativo(sistemaOperativo);
		           smartphone.setAnioModelo(anioModelo);
		           
		           System.out.println("Objeto creado y agregado a la lista ...");
		           
		           smartphones.add(smartphone);
	        	   break;
	           case 2:
	        	   System.out.println("EDICION DE OBJETO");
	        	   
	        	   System.out.println("1.- Eitar especificando el indice");
	        	   System.out.println("2.- Eitar especificando el modelo");
	        	   opcionIndiceModelo = scan13.nextInt();
	        	   
	        	   if(opcionIndiceModelo == 1) {
	        		   System.out.println("¿Cual objeto quieres cambiar de la lista?");
		        	   opcionEdicion = scan5.nextInt();
		        	   
		        	   Smartphone editado = new Smartphone();
		        	   editado = smartphones.get(opcionEdicion - 1); //indice empieza en 0 
		        	   
		        	   //System.out.println("obj editado: " + editado + " tamaño: " + smartphones.size());
		        	   
		        	   System.out.println("Escoge la caracteristica que quieres cambiar");
		        	   System.out.println("1. modelo");
			           System.out.println("2. marca");
			           System.out.println("3. capacidad de almacenamiento");
			           System.out.println("4. sistema operativo");
			           System.out.println("5. año del modelo");
			           opcionAtributo = scan7.nextLine();
			           		
			           switch(opcionAtributo) {
			           		case "1":
			           			//System.out.println("entro: ");
			           			System.out.println("Escribe el modelo");
			           			modelo = scan8.nextLine();
			           			editado.setModelo(modelo);
			           			
			           			smartphones.remove(opcionEdicion - 1);
			           			System.out.println("lista cont: " + smartphones);
			           			
			           			smartphones.add(opcionEdicion -1, editado);
			           			break;
			           			
			           		case "2":
			           			System.out.println("Escribe la marca");
			           			marca = scan9.nextLine();
			           			editado.setMarca(marca);
			           			smartphones.add(opcionEdicion - 1, editado);
			           			break;
			           			
			           		case "3":
			           			System.out.println("Escribe la capacidad de almacenamiento");
			           			almacenamiento = scan10.nextInt();
			           			editado.setCapacidadAlmacenamiento(almacenamiento);
			           			smartphones.add(opcionEdicion - 1, editado);
			           			break;
			           			
			           		case "4":
			           			System.out.println("Escribe el sistema operativo");
			           			sistemaOperativo = scan11.nextLine();
			           			editado.setModelo(sistemaOperativo);
			           			smartphones.add(opcionEdicion - 1, editado);
			           			break;
			           			
			           		case "5":
			           			System.out.println("Escribe el año del modelo");
			           			anioModelo = scan12.nextInt();
			           			editado.setAnioModelo(anioModelo);
			           			smartphones.add(opcionEdicion - 1, editado);
			           			break;
			           		}
		        	   
	        	   }else if(opcionIndiceModelo == 2){
	        		   
	        		   System.out.println("Escribe el modelo para buscarlo");
		        	   busquedaModelo = scan14.nextLine();
		        	   
		        	   for(int i = 0;i < smartphones.size();i++) {
		        		   
		        		   if(smartphones.get(i).getModelo().equals(busquedaModelo)) {
		        			   System.out.println("encontrado");
		        			   System.out.println("Escribe el nuevo modelo: ");
		        			   modelo = scan15.nextLine();
		        			   
		        			   smartphones.get(i).setModelo(modelo);
		        			   //smartphones.remove(i);
		        			   //auxiliar.setModelo(modelo);
		        			   //smartphones.add(i, auxiliar);
		        			   System.out.println(smartphones);
		        		   }else {
		        			   System.out.println("no encontrado");
		        		   }
		        		   
		        	   }
		        	   
	        	   }
	           
	        	   break;
	        	   
	           case 3:
	        	   
	        	   
	        	   System.out.println("ELIMINAR OBJETO");
	        	   System.out.println("1.-Eliminar un objeto indicando el indice");
	        	   System.out.println("2.-Eliminar un objeto indicando el modelo");
	        	   opcionEliminar = scan1.nextInt();
	        	   
	        	   if(opcionEliminar == 1) {
	        		   System.out.println("¿Cual objeto quieres eliminar de la lista?");
		        	   eliminado = scan1.nextInt();
		        	   smartphones.remove(eliminado - 1);
	        	   }else if(opcionEliminar == 2) {
	        		   
	        		   System.out.println("Escribe el modelo para buscarlo");
		        	   busquedaModelo = scan14.nextLine();
		        	   
		        	   for(int i = 0;i < smartphones.size();i++) {
		        		   
		        		   if(smartphones.get(i).getModelo().equals(busquedaModelo)) {
		        			   System.out.println("Eliminado ...");
		        			   
		        			   smartphones.remove(i);
		        		   }else {
		        			   System.out.println("no encontrado");
		        		   }
		        		   
		        	   }
		        	   
	        	   }
	        	   break;
	        	   
	           case 4:
	        	   System.out.println("MOSTRAR OBJETO");
	        	   System.out.println("Tamaño de la lista: " + smartphones.size());
	        	   System.out.println("¿Cual objeto quieres que se muestre de la lista?");
	        	   mostrado = scan1.nextInt();
	        	   smartphones.get(mostrado - 1).toString();
	        	   break;
	           case 5:
	        	   System.out.println("Autodestruccion");
	        	   salir = true;
	        	   break;
	           default:
	        	   System.out.println("Esa opcion no esta disponible");
	        	   break;
	           }
	            
	       }
	        
	    }
}

class Estado{
	
	private String nombre;
	private String clave;
	private int numeroHabitantes;
	private double extensionKm2;
	private String capital;
	private String zona;
	
	public Estado() {
		
	}
	
	public Estado(String nombre, String clave, int numeroHabitantes, double extensionKm2, String capital, String zona) {
		this.nombre = nombre;
		this.clave = clave;
		this.numeroHabitantes = numeroHabitantes;
		this.extensionKm2 = extensionKm2;
		this.zona = zona;
	}
	
	
	//getters
	public String getNombre() {
		return nombre;
	}
	
	public String getClave() {
		return clave;
	}
	
	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}
	
	public double getExtensionKm2() {
		return extensionKm2;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public String getZona(String zona) {
		return zona;
	}
	
	
	public String toString() {
		return "nombre: " + nombre + " clave: " + clave + " numero de habitantes: " + numeroHabitantes + " extension en Km2: " 
	+ extensionKm2 + " capital: " + capital;
	}
	
	
	//setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	
	public void setExtensionKm2(double extensionKm2) {
		this.extensionKm2 = extensionKm2;
	}
	
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public void setZona(String zona) {
		this.zona = zona;
	}
}


class Smartphone{
	
	private String modelo;
	private String marca;
	private int capacidadAlmacenamiento;
	private String sistemaOperativo;
	private int anioModelo;
	
	public Smartphone() {
		
	}
	
	public Smartphone(String modelo, String marca, int capacidadAlmacenamiento, String sistemaOperativo, int anioModelo) {
		this.modelo = modelo;
		this.marca = marca;
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
		this.sistemaOperativo = sistemaOperativo;
		this.anioModelo = anioModelo;
		
	}
	
	//getters
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getCapacidadAlmacenamiento() {
		return capacidadAlmacenamiento;
	}
	
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	public int getAnioModelo() {
		return anioModelo;
	}
	
	public String toString() {
		return "modelo: " + modelo + " marca: " + marca + " capacidad de almacenamiento: " + capacidadAlmacenamiento + "GB" +
			" sistema operativo: " + sistemaOperativo + " año del modelo: " + anioModelo;
	}
	
	//setters

	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}
	
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public void setAnioModelo(int anioModelo) {
		this.anioModelo = anioModelo;
	}
	
	
	
	
	
}











