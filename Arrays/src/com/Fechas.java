package com;

import java.util.*;

public class Fechas {
	public static void main(String[] args) {
		String[] fecha=new String[15];
		String cadena="",aux;
		
		fecha[0]="09082022";
		fecha[1]="19121994";
		fecha[2]="30092004";
		fecha[3]="24071967";
		fecha[4]="08121977";
		fecha[5]="04121992";
		fecha[6]="30121995";
		fecha[7]="13071999";
		fecha[8]="21012016";
		fecha[9]="21012022";
		fecha[10]="07031950";
		fecha[11]="18061947";
		fecha[12]="24081973";
		fecha[13]="01112021";
		fecha[14]="02011972";
		
//		int i=0;
//		cadena=fecha[i].substring(i,2);
//		System.out.println(cadena);

		for(int i=0;i<fecha.length;i++) {
			if(fecha[i].substring(0,2).equals("01")) {
				cadena=cadena+"Primero de ";
			}else if(fecha[i].substring(0,2).equals("02")) {
				cadena=cadena+"Dos de ";
			}else if(fecha[i].substring(0,2).equals("03")) {
				cadena=cadena+"Tres de ";
			}else if(fecha[i].substring(0,2).equals("04")) {
				cadena=cadena+"Cuatro de ";
			}else if(fecha[i].substring(0,2).equals("05")) {
				cadena=cadena+"Cinco de ";
			}else if(fecha[i].substring(0,2).equals("06")) {
				cadena=cadena+"Seis de ";
			}else if(fecha[i].substring(0,2).equals("07")) {
				cadena=cadena+"Siete de ";
			}else if(fecha[i].substring(0,2).equals("08")) {
				cadena=cadena+"Ocho de ";
			}else if(fecha[i].substring(0,2).equals("09")) {
				cadena=cadena+"Nueve de ";
			}else if(fecha[i].substring(0,2).equals("10")) {
				cadena=cadena+"Diez de ";
			}else if(fecha[i].substring(0,2).equals("11")) {
				cadena=cadena+"Once de ";
			}else if(fecha[i].substring(0,2).equals("12")) {
				cadena=cadena+"Doce de ";
			}else if(fecha[i].substring(0,2).equals("13")) {
				cadena=cadena+"Trece de ";
			}else if(fecha[i].substring(0,2).equals("14")) {
				cadena=cadena+"Catorce de ";
			}else if(fecha[i].substring(0,2).equals("15")) {
				cadena=cadena+"Quince de ";
			}else if(fecha[i].substring(0,2).equals("16")) {
				cadena=cadena+"Dieciseis de ";
			}else if(fecha[i].substring(0,2).equals("17")) {
				cadena=cadena+"Diecisite de ";
			}else if(fecha[i].substring(0,2).equals("18")) {
				cadena=cadena+"Dieciocho de ";
			}else if(fecha[i].substring(0,2).equals("19")) {
				cadena=cadena+"Diecinueve de ";
			}else if(fecha[i].substring(0,2).equals("20")) {
				cadena=cadena+"Veinte de ";
			}else if(fecha[i].substring(0,2).equals("21")) {
				cadena=cadena+"Veintiuno de ";
			}else if(fecha[i].substring(0,2).equals("22")) {
				cadena=cadena+"Veintidos de ";
			}else if(fecha[i].substring(0,2).equals("23")) {
				cadena=cadena+"Veintitres de ";
			}else if(fecha[i].substring(0,2).equals("24")) {
				cadena=cadena+"Veinticuatro de ";
			}else if(fecha[i].substring(0,2).equals("25")) {
				cadena=cadena+"Veinticinco de ";
			}else if(fecha[i].substring(0,2).equals("26")) {
				cadena=cadena+"Veintiseis de ";
			}else if(fecha[i].substring(0,2).equals("27")) {
				cadena=cadena+"Veintisiete de ";
			}else if(fecha[i].substring(0,2).equals("28")) {
				cadena=cadena+"Veintiocho de ";
			}else if(fecha[i].substring(0,2).equals("29")) {
				cadena=cadena+"Veintinueve de ";
			}else if(fecha[i].substring(0,2).equals("30")) {
				cadena=cadena+"Treinta de ";
			}else if(fecha[i].substring(0,2).equals("31")) {
				cadena=cadena+"Treinta y uno de ";
			}
			
			if(fecha[i].substring(2,4).equals("01")) {
				cadena=cadena+"Enero de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("02")) {
				cadena=cadena+"Febrero de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("03")) {
				cadena=cadena+"Marzo de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("04")) {
				cadena=cadena+"Abril de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("05")) {
				cadena=cadena+"Mayo de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("06")) {
				cadena=cadena+"Junio de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("07")) {
				cadena=cadena+"Julio de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("08")) {
				cadena=cadena+"Agosto de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("09")) {
				cadena=cadena+"Septiembre de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("10")) {
				cadena=cadena+"Octubre de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("11")) {
				cadena=cadena+"Noviembre de "+fecha[i].substring(4,8)+"\n";
			}else if(fecha[i].substring(2,4).equals("12")) {
				cadena=cadena+"Diciembre de "+fecha[i].substring(4,8)+"\n";
			}
		}
		System.out.println(Arrays.toString(fecha)); 
		System.out.println(cadena+"\n");

	}
}
