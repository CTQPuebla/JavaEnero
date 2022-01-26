package com;
import java.util.Scanner;

public class IfElseSwitch {
	public static void main(String[] args) {
		//If Else
		String o = "Hola";
		 if (o.length()<5) {
			 System.out.println("Tiene 4 letras o menos");
		 }
		 else if (o.length()>=5 ) {
			 System.out.println("Tiene 5 letras o más");
		 }
		 
		 //Comparación de cadenas
		 //.equals se usa para cadena de palabras, objetos de
		 // de otra manera java no hara bien la comparación
		 // == se usa para comparaciones numericas
		 
		 String i ="abcd";
		 String h ="dcbag";
		  if (i.equals(h)) {
			  System.out.println("Las palabras son iguales");
		  }
		  else ;{
		  System.out.println("Las palabras no son iguales");
		  }
		  
		  // OR ||
		  if (i.equals("otro") || i.length()==4){
			  System.out.println("Son iguales");
		  }
		  
		  
		  //Ejercicio If and Else , Switch
		  
		  //If and Else
		  
		  int  myFirstNumber = 500;
		  int mySecondNumber = 10;
		  int mySum = myFirstNumber + mySecondNumber;
		  System.out.println("Mi primer número es " + myFirstNumber);
		  System.out.println("Mi segundo número es " + mySecondNumber);
		  System.out.println("La suma es igual a " + mySum);
		  
		  if(mySum<=100) {
			  System.out.println("La suma es menor o igual a 100");
		  } 
		  else if(mySum>100||mySum<=500) {
			  System.out.println("La suma es mayor a 100 "
			  		+ "pero menor o igual a 500");
		  }
		  else {
			  System.out.println("El número es mayor a 500");
		  }
		  
		  //Ejercicio switch elige un numero de la semana 
		  //considera que la semana tiene 7 dias(Lunes a Domingo)
		  Scanner lectura = new Scanner(System.in);
		  System.out.println("Ingresa un numero del 1 al 7 para "
		  		+ "conocer el día de la semana que corresponde");
		  int myDayOfTheWeek = lectura.nextInt();
		  String dayOfTheWeek = null;
		   switch(myDayOfTheWeek) {
		   case 1:
			    dayOfTheWeek = "Lunes";
			    System.out.println(dayOfTheWeek);
			   break;
		   case 2:
			   System.out.println("Martes");
			   break;
		   case 3:
			   System.out.println("Miércoles");
			   break;
		   case 4:
			   System.out.println("Jueves");
			   break;
		   case 5:
			   System.out.println("Viernes");
			   break;
		   case 6:
			   System.out.println("Sábado");
			   break;
		   case 7:
			   System.out.println("Domingo");
			   break;
		  default:
			  System.out.println("Solo hay 7 dias en la semana");
			  
			  lectura.close();
			  }
		  
	}
		  
}
