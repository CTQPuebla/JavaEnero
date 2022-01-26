package com;

import java.util.Arrays;

public class Principal {
	
	public static void main (String[] args) {
		
	String dia = "";
	String mes = "";
	String anuo = "";
	String [] array  =  {"25092022","25032022","04032022","12122022","21062022","16072022","18022022",
			"22042022","28112022","23092022","09092022","08082022","11052022","06122022","31122022"};
	/* ****************************** */
	System.out.println("FECHA:");
		for (int i = 0; i < array.length; i++)
		{
			dia= array[i].substring(0, 2);
			mes= array[i].substring(2, 4);
			anuo= array[i].substring(4, array[i].length());
			 
			
			System.out.println(dia);
					switch (mes){
				case "01":
					System.out.println( "Enero");
					break;
				case "02":
					System.out.println("Febrero");
					break;
				case "03":
					System.out.println("Marzo");
					break;
				case "04":
					System.out.println("Abril");
					break;
				case "05":
					System.out.println("Mayo");
					break;
				case "06":
					System.out.println("Junio");
					break;
				case "07":
					System.out.println("Julio");
					break;
				case "08":
					System.out.println("Agosto");
					break;
				case "09":
					System.out.println("Septiembre");
					break;
				case "10":
					System.out.println("Octubre");
					break;
				case "11":
					System.out.println("Noviembre");
					break;
				case "12":
					System.out.println("Diciembre");
					break;			
				default:
					System.out.println("No existe el mes");
					break;	
					}
		}
		
/* **************************************************************************************** */	
		String dia = "";
		String mes = "";
		String anuo = "";
		String [] array  =  {"25092022","25032022","04032022","12122022","21062022","16072022","18022022",
				"22042022","28112022","23092022","09092022","08082022","11052022","06122022","31122022"};
		/* ****************************** */
		System.out.println("FECHA:");
			for (int i = 0; i < array.length; i++)
			{
				dia= array[i].substring(0, 2);
				mes= array[i].substring(2, 4);
				anuo= array[i].substring(4, array[i].length());
			
				String [] dias  = {};
				String [] meses = {};
				
			}
				 
		
	}
}
