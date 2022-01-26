package com;

public class SubStringMethod {
 public static void main(String[] args) {
//	A substring is a contiguous sequence of characters within a string. 
//	 For instance, “the best of” is a substring of “It was the best of times”.
//	 Parameters:
//	 beginIndex - the beginning index, inclusive.
//	 endIndex - the ending index, exclusive.
//	 Returns:
//	 the specified substring.
//	 IndexOutOfBoundsException - if the beginIndex is negative or larger
	String texto = "Hola Mundo";
	String test = texto.substring(1);
	System.out.println(test);
	
	String test2 = texto.substring(5,8);
	System.out.println(test2);
	
	
	
}
}
