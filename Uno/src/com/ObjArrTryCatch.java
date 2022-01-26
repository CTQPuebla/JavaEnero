package com;

public class ObjArrTryCatch {

	public static void main(String[] args) {
		Object[] arrayObject = new Object[20];
	     arrayObject[0] = "2.0";
	     arrayObject[1] = new String("Z");
	     arrayObject[2] = "45.6";
	     arrayObject[3] = "A";
	     arrayObject[4] = "a";
	     arrayObject[5] = "B";
	     arrayObject[6] = "b";
	     arrayObject[7] = "20";
	     arrayObject[8] = "30.1";
	     arrayObject[9] = 20.1;
	     arrayObject[10] = "C";
	     arrayObject[11] = "c";
	     arrayObject[12] = "1";
	     arrayObject[13] = 2;
	     arrayObject[14] = "3";
	     arrayObject[15] = "4";
	     arrayObject[16] = "D";
	     arrayObject[17] = "'d'";
	     arrayObject[18] = "false";
	     arrayObject[19] = true;

String texto="";
int suma=0;

//for(Object arrayObj : arrayObject) {
for(int i=0;i<arrayObject.length; i++) {
	if (arrayObject[i] instanceof String){
		if(arrayObject[i].equals("true") || arrayObject[i].equals("false")) {
			System.out.println("Es Boolean(deString) en la posicion " + i + 
			 " y el valor es: " + arrayObject[i] );
		} 
//		else if (Float.valueOf((String)arrayObject[i]) instanceof Float){
//			System.out.println("Es Decimal(deString) en la posicion " + i + 
//			 " y el valor es: " + Float.valueOf((String)arrayObject[i]) );
//		}
		try {
			System.out.println("Es Decimal(deString) en la posicion " + i + 
			 " y el valor es: " + Float.valueOf((String)arrayObject[i]) );
		} catch(NumberFormatException error) {
		}
		try {
			System.out.println("Es Decimal(deString) en la posicion " + i + 
			 " y el valor es: " + Float.valueOf((String)arrayObject[i]) );
		} catch(NumberFormatException error) {
		}
//		

//		
//		System.out.println("Es Character(deString) en la posicion " + i + 
//				 " y el valor es: " + (String.valueOf(arrayObject[i])) );
//		
//		System.out.println("Es String en la posicion " + i + 
//				 " y el valor es: " + arrayObject[i] );
	} //else if (arrayObject[i] instanceof Integer){
//		System.out.println("Es Integer en la posicion " + i +
//				 " y el valor es: " + arrayObject[i] );
//		System.out.println(arrayObject[i] instanceof Integer) ;
//
//	} else if (arrayObject[i] instanceof Boolean){
//		System.out.println("Es Boolean en la posicion " + i + 
//				 " y el valor es: " + arrayObject[i] );
//		System.out.println(arrayObject[i] instanceof Boolean) ;
//	} else if (arrayObject[i] instanceof Character){
//		System.out.println("Es Character en la posicion " + i + 
//				 " y el valor es: " + arrayObject[i] );
//		System.out.println(arrayObject[i] instanceof Character) ;
//	} else if (arrayObject[i] instanceof Float){
//		System.out.println("Es Decimal en la posicion " + i + 
//				 " y el valor es: " + arrayObject[i] );
//		System.out.println(arrayObject[i] instanceof Float) ;
//	}
}//for 	



	}

}
