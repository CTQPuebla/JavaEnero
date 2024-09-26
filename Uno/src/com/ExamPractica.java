package com;
import java.util.Arrays;

public class ExamPractica {

	public static <Fecha> void main(String[] args)  {
		/*Declarar 15 elementos de String ""21012022" 
		 * usarSubstring("inclyente"),("incluyente")("excluyente")
		 * e imprimir Veintiuno de Agosto del 2022
		 */
		 //Array principal donde tenemos las fechas sin formato en String
		 Object[] fecha = new Object[15];
		 fecha[0] = "01012022";
		 fecha[1] = "02012022";
		 fecha[2] = "03012022";
		 fecha[3] = "04012022";
		 fecha[4] = "05012022";
		 fecha[5] = "06012022";
		 fecha[6] = "07012022";
		 fecha[7] = "08012022";
		 fecha[8] = "09012022";
		 fecha[9] = "10012022";
		 fecha[10] = "11012022";
		 fecha[11] = "12012022";
		 fecha[12] = "13012022";
		 fecha[13] = "14012022";
		 fecha[14] = "15012022";
		 
		 Object[] dias= new Object[] {"Primero","Segundo","Tres","Cuatro","Cinco",
		"Seis","Siete","Ocho","Nueve","Diez","Once","Doce","Trece","Catorce",
		"Quince","Dieciséis","Diecisiete","Dieciocho","Diecinueve","Veinte","Veintiuno",
		"Veintidós","Veintitrés","Veinticuatro","Veinticinco","Veintiseis","Veintisiete",
		"Veintiocho","Veintinueve ","Treinta","Treinta y uno"};
		 Object[] meses= new Object[] {"Enero","Febrero","Marzo","Abril","Mayo",
				  "Junio","Julio","Agosto","Septiembre","Octubre",
				  "Noviembre","Diciembre"};
		 /*Variable donde se almacenara el valor de String
		  * en la posicion que deseamos*/
		 String dia="";
		 String mes="";
		 String año="";
		 String res="";
		 /*Variable donde se almacenara el valor de Integer
		  * de la posicion seleccionada*/
		 int a,m,d;

		 for( int i=0; i<fecha.length; i++) {
			 if(fecha[i] instanceof String) {
//.substring nos da el valor del array en esa posicio*empieza de cero*
				 dia=((String) fecha[i]).substring(0,2);
				 mes=((String) fecha[i]).substring(2,4);
				 año=((String) fecha[i]).substring(4,(((String) fecha[i]).length()));
//Imprime				 
				 System.out.println(dia + "/" + mes + "/" + año);

				 d= Integer.valueOf(dia);
				 m=Integer.valueOf(mes);
			     a=Integer.valueOf(año);
			     
			     res= dias[d-1] + " de " + meses[m-1] + " del " + a;
			     
			     System.out.println(res);
				 
//				 fecha[i] = (((String) fecha[i]).substring(0,2) + "/" + 
//						 ((String) fecha[i]).substring(2,4) + "/" 
//				 + ((String) fecha[i]).substring(4,((String) fecha[i]).length()));
//				 System.out.println(fecha[i]);


			 }
			 
		 }

	}

}
