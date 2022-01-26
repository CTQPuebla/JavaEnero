package com;


public class VerificarClase {
public static void main(String[] args) {
	// Ejercicio
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
	*
	*/
	
	String texto = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium" + 
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
	String textoSinEspacios= texto
			.replace(" ","")
			.replace(",", "")
			.replace(".", "")
			.replace("?","")
			;
	int numVocales = 0;
	int numConsonantes = 0;
	String todasVocales="";
	String todasConsonantes="";
	for(int x = 0;x<textoSinEspacios.length(); x++) {
		if((textoSinEspacios.charAt(x)=='a')||(textoSinEspacios.charAt(x)=='e')
				||(textoSinEspacios.charAt(x)=='i')||(textoSinEspacios.charAt(x)=='o')
				||(textoSinEspacios.charAt(x)=='u')||(textoSinEspacios.charAt(x)=='A')
		||(textoSinEspacios.charAt(x)=='E')||(textoSinEspacios.charAt(x)=='I')
		||(textoSinEspacios.charAt(x)=='O')||(textoSinEspacios.charAt(x)=='U')) {
			numVocales++;
			todasVocales += textoSinEspacios.charAt(x) ;
		} 
		else {
			numConsonantes++;
			todasConsonantes += textoSinEspacios.charAt(x);
	}
	
}
	System.out.println("Numero total de vocales " + numVocales);
	System.out.println("Numero total de consonantes " + numConsonantes);
	System.out.println("Las vocales son " + todasVocales);
	System.out.println("Las vocales son " + todasConsonantes);
	System.out.println(numVocales+numConsonantes);
}
}