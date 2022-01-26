package com;

public class ProgramacionEstructurada2 {

	public static void main(String[] args) {
		String baseString = ("* Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium\r\n" + 
				"* doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore\r\n" + 
				"* veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim\r\n" + 
				"* ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia\r\n" + 
				"* consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque\r\n" + 
				"* porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,\r\n" + 
				"* adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et\r\n" + 
				"* dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis\r\n" + 
				"* nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex\r\n" + 
				"* ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea\r\n" + 
				"* voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem\r\n" + 
				"* eum fugiat quo voluptas nulla pariatur").toLowerCase();
		int totalChars = 0;
		int totalVowels = 0;
		int totalConsonants = 0;
		String vowels = "";
		String consonants = "";
		for(int i = 0; i < baseString.length(); i++) {
			if(baseString.charAt(i) == ' ' || 
			   baseString.charAt(i) == '\n' || 
			   baseString.charAt(i) == '\r' ||
			   baseString.charAt(i) == '*' ||
			   baseString.charAt(i) == '.' ||
			   baseString.charAt(i) == ',' ||
			   baseString.charAt(i) == '?') {
				continue;
			}
			else if(baseString.charAt(i) == 'a' ||
					baseString.charAt(i) == 'e' ||
					baseString.charAt(i) == 'i' ||
					baseString.charAt(i) == 'o' ||
					baseString.charAt(i) == 'u') {
				Character vowelToString = baseString.charAt(i);
				vowels += vowelToString.toString();
				totalVowels++;
			} else {
				Character consonantToString = baseString.charAt(i);
				consonants += consonantToString.toString();
				totalConsonants++;
			}
			totalChars++;
		}
		System.out.println("El numero total de chars sin espacios es: " + totalChars);
		System.out.println("El numero total de vocales es: " + totalVowels);
		System.out.println("La cadena de vocales es: \n" + vowels);
		System.out.println("El numero total de consonantes es: " + totalConsonants);
		System.out.println("La cadena de consonantes es: \n" + consonants);
	}

}
