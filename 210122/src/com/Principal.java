package com;
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		String[] fechas = {"01051994", //1
				"20112000", //2
				"06072010", //3
				"01012001", //4
				"27031991", //5
				"31122020", //6
				"17051961", //7
				"08041988", //8
				"24122021", //9
				"05052005", //10
				"02022002", //11
				"15091995", //12
				"08092011", //13
				"20061985", //14
				"09082007"};  //15
		String[] dias = {"Primero", "Dos", "Tres", "Cuatro", "Cinco","Seis","Siete","Ocho","Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciséis","Diecisiete","Dieciocho","Diecinueve","Veinte","Veintiuno","Veintidos","Veintidos","Veintitres","Veinticuatro","Veinticinco","Veintiseis","Veintisiete","Veintiocho","Veintinueve","Treinta","Treina y uno"};
		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		
		String fecha = "", diaTexto = "", mesTexto = "", anioTexto = "", fechaFormat = "";
		
		System.out.println("Fechas sin formato:");
		for(int i=0;i<fechas.length;i++) {
			System.out.println(fechas[i]);
		}
		System.out.println("\nImpresión de fechas en texto:");
		
		for(int j=0;j<fechas.length;j++) {
			fecha = fechas[j];
			fechaFormat = fecha.substring(0, 2)+"/"+fecha.substring(2, 4)+"/"+fecha.substring(4);
			anioTexto = fecha.substring(4);
			
			diaTexto = dias[Integer.parseInt(fecha.substring(0, 2))-1];
			mesTexto = meses[Integer.parseInt(fecha.substring(2, 4))-1];
			
			System.out.println(fechaFormat+": "+diaTexto+" de "+mesTexto+" de "+anioTexto);
		}
	}
}
