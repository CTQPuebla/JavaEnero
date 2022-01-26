package com;
import java.util.Scanner;

public class EstructurasCiclicas {
public static void main(String[] args) {
//	System.out.println("Instrucciones: Adivina un número del 1 al 10,"
//			+ "solo tienes 3 intentos");
//	Scanner numero = new Scanner(System.in);
//	int numIntentos = 3;
//	int numOculto = 7;
//	for (int x = 0; x<numIntentos; x++){
//		System.out.println("Escribe tu número aquí");
//		int yourNumber = numero.nextInt(); 
//	 if (numOculto==yourNumber) {
//		 System.out.println("Felicidades adivinaste el numero oculto : 7 ");
//		 break;
//		 
//	 }
//	 else if(numOculto!=yourNumber && x!=numIntentos-1){
//		 System.out.println("Numero equivocado u.u, "
//		 		+ "intenta otra ves");
//	 }
//	 
//	 else {
//			System.out.println("Se te acabron los intentos"
//					+ "el numero era 7");
//		}
//	}
	
	


	
	/*leer 15 numeros desde el teclado
	 * verifica cuales son par y contar cuantos son
	 * sumar los impares
	 */
	System.out.println("Instrucciones: Leer 15 numeros desde el teclado "
			+ "cuenta cuantos son pares y suma los impares ");
	Scanner numero1 = new Scanner(System.in);
	String name = numero1.nextLine();
	
	int numPar = 0;
	int sumImpares= 0;
	
   for(int a=0; a<=14; a++) {
	   System.out.println("Ingresa el numero");
	   int numIngresa = numero1.nextInt();
	   if(numIngresa%2==0) {
		   System.out.println("Tu numero es par");
		   numPar++;
	   }else {
		   System.out.println("Tu numero es impar");
		   sumImpares+= numIngresa ;
	   }
   }
   
   System.out.println("La cantidad de numero impares es " + numPar);
   System.out.println("La suma de los numeros impares es " + sumImpares);
}

}

