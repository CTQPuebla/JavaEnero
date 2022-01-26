package com;

public class Examen {

	public static void main(String args[]) {
		
		String[] fechaString ={"01102022","02112022","02122022","03012022","04022022","05032022","06042022","07052022","08062022","09072022","10082022","11092022","12102022","13112022","14122022"};
	
		String dia,mes;
		String dias[]=new String[15];
		String meses[]=new String[15];
		String año[]=new String[15];
		for(int i=0;i<fechaString.length;i++) {
		dia=fechaString[i].substring(0,2);
		mes=fechaString[i].substring(2,4);
		año[i]=fechaString[i].substring(4);
		
		switch(dia){
		case "01" :dias[i]="uno";
		break;
		case "02" :dias[i]="dos";
		break;
		case "03" :dias[i]="tres";
		break;
		case "04" :dias[i]="cuatro";
		break;
		case "05" :dias[i]="cinco";
		break;
		case "06" :dias[i]="seis";
		break;
		case "07" :dias[i]="siete";
		break;
		case "08" :dias[i]="ocho";
		break;
		case "09" :dias[i]="nueve";
		break;
		case "10" :dias[i]="diez";
		break;
		case "11" :dias[i]="once";
		break;
		case "12" :dias[i]="doce";
		break;
		case "13" :dias[i]="trece";
		break;
		case "14" :dias[i]="catorce";
		break;
		case "15" :dias[i]="quince";
		break;
		case "16" :dias[i]="dieciseis";
		break;
		case "17" :dias[i]="diecisiete";
		break;
		case "18" :dias[i]="dieciocho";
		break;
		case "19" :dias[i]="diecinueve";
		break;
		case "20" :dias[i]="veinte";
		break;
		case "21" :dias[i]="veintiuno";
		break;
		case "22" :dias[i]="veintidos";
		break;
		case "23" :dias[i]="veintitres";
		break;
		case "24" :dias[i]="veinticuatro";
		break;
		case "25" :dias[i]="veinticinco";
		break;
		case "26" :dias[i]="veintiseis";
		break;
		case "27" :dias[i]="veintesiete";
		break;
		case "28" :dias[i]="veintiocho";
		break;
		case "29" :dias[i]="veintinueve";
		break;
		case "30" :dias[i]="treinta";
		break;
		case "31" :dias[i]="treinta y uno";
		break;
		default: System.out.print("dia invalido");
		}
		
		switch(mes){
		case "01" :meses[i]="enero";
		break;
		case "02" :meses[i]="febrero";
		break;
		case "03" :meses[i]="marzo";
		break;
		case "04" :meses[i]="abril";
		break;
		case "05" :meses[i]="mayo";
		break;
		case "06" :meses[i]="junio";
		break;
		case "07" :meses[i]="julio";
		break;
		case "08" :meses[i]="agosto";
		break;
		case "09" :meses[i]="septiembre";
		break;
		case "10" :meses[i]="octubre";
		break;
		case "11" :meses[i]="noviembre";
		break;
		case "12" :meses[i]="diciembre";
		break;
		default:System.out.print("mes invalido");
		}
	}
		for(int i=0;i<15;i++) {
			System.out.println(dias[i]+" de "+meses[i]+" de "+año[i]);
		}
		
		}
	
}
