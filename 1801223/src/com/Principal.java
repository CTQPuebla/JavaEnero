package com;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String vocales = "", consonantes = "", texto = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur";
		int letras = 0, longitud = texto.length()-1, numVocales = 0, numConsonantes = 0;
		char caracter;
		
		System.out.println(texto+"\n");
		
		for(int x = 0; x<=longitud ; x++) {
			caracter = texto.charAt(x);
			//if (!String.valueOf(caracter).equals(" ") && Character.isAlphabetic(caracter)) {
			if (Character.isAlphabetic(caracter)) {
				switch(caracter) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					vocales += String.valueOf(caracter);
					numVocales++;
					letras++;
					break;
				default:
					consonantes += String.valueOf(caracter);
					numConsonantes++;
					letras++;
					break;
				}
			}
		}
		System.out.println(numVocales+" vocales: "+vocales);
		System.out.println(numConsonantes+" consonantes: "+consonantes);
		System.out.println("=\n"+letras+" letras");
		
		sc.close();
	}
}