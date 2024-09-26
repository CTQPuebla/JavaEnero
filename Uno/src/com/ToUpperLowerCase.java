package com;
import java.util.Scanner;

public class ToUpperLowerCase {
public static void main(String[] args) {
//	The toUpperCase() method is used to convert a string 
//	to all-uppercase. toUpperCase() iterates through every character 
//	in a string and changes it to an uppercase character.
//	The string toLowerCase() method is 
//	the opposite of the toUpperCase() method. Instead of 
//	converting a string to all-uppercase, the toLowerCase() method 
//	converts a string to all-lowercase.
	
	String textoLc = "hola mundo";
	String textoUc = "HOLA MUNDO";
	
	System.out.println(textoLc.toUpperCase());
	System.out.println(textoUc.toLowerCase());
	
	//Ingresa una oracion sin importar mayusculas o minusculas
	//se modificara automaticamente a mayusculas o minusculas
	Scanner texto = new Scanner(System.in);
	System.out.println("Ingresa una oracion");
	String oracionIngresada= texto.nextLine();
	String oracionModificadaU = oracionIngresada.toUpperCase();
	System.out.println(oracionModificadaU);
	String oracionModificadaL = oracionIngresada.toLowerCase();
	System.out.println(oracionModificadaL);
	//Ignora Mayusculas y las devuelve en minusculas
	System.out.println(oracionIngresada.equalsIgnoreCase(oracionIngresada));
	//
	String nuevoStr = oracionIngresada.substring(0,1).toUpperCase() 
			+ oracionIngresada.substring(1, oracionIngresada.length()).toLowerCase();
	System.out.println(nuevoStr);
}
}
