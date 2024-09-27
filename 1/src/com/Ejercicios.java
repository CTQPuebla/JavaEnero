package com;

public class Ejercicios {

	/* Ejercicio
	/*
	* verificar en el texto:
	*
	* Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium
	* doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
	* veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim
	* ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia
	* consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque
	* porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
	* adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et
	* dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis
	* nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex
	* ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea
	* voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem
	* eum fugiat quo voluptas nulla pariatur
	*
	* Cuantas vocales y cuantas consonantes hay
	*
	* Imprimir un string que contenga solo las vocales
	* Imprimr un string con solo las consonantes
	* Realizar el conteo general de las letras, omitiendo espacios
	*
	*
	* charAt
	* AND OR
	* .equals
	* ciclo
	* if
	* switch
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vocales="";
		String consonantes="",caracteres="";
		String  texto="Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium" + 
				"doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore" + 
				"veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim" + 
				"ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia" + 
				"consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque" + 
				"porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur," + 
				"adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et" + 
				"dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis" + 
				"nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex" + 
				"ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea" + 
				"voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem" + 
				"eum fugiat quo voluptas nulla pariatur";
		for(int i=0;i<texto.length();i++) {
			String  tex=Character.toString(texto.charAt(i));
			if(tex.equals("a")||tex.equals("e")||tex.equals("i")||tex.equals("o")||tex.equals("u")||tex.equals("A")||tex.equals("E")||tex.equals("I")||tex.equals("O")||tex.equals("U")){
				vocales=vocales+tex;
			}else if (tex.equals(".")||tex.equals(",")||tex.equals(" ")||tex.equals("?")||tex.equals("¿")) {
				caracteres=caracteres+tex;
			}else {consonantes=consonantes+tex;
			}}
		System.out.println("las vocales del texto son: "+vocales);
		System.out.println("las consonantes son: "+consonantes);
		System.out.println("la cantidad de vocales son: "+vocales.length());
		System.out.println("la acantidad de consonantes son: "+consonantes.length());
		System.out.println("la cantidad total de letras son: "+(vocales.length()+consonantes.length()));
		
		
		//substring clase 
		String s= "hoLA" ;    
		System.out.println(s.substring( 1,3 ));
		System.out.println(s.substring( 1 ));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//!= distinto
	}
	}


