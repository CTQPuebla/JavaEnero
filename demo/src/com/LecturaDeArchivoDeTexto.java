package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaDeArchivoDeTexto {

	public static void main(String[] args) {
		String currentLine = "";
		try {
			File fileToRead = new File("C:\\Users\\rfigu\\Desktop\\curso-ceteq\\ejercicios\\lectura-de-archivos\\archivo-para-leer.txt");
			FileReader fileReader = new FileReader(fileToRead);
			BufferedReader buffer = new BufferedReader(fileReader);
			while((currentLine = buffer.readLine()) != null) {
				System.out.println(currentLine);
			}
			buffer.close();
		}
		catch(IOException err) {
			System.out.println("no hay lectura");
		}
	}

}