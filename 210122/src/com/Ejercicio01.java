package com;
import java.io.*;

public class Ejercicio01 {
	public static void main(String[] args) {
		String linea = "";
		try {
			File f = new File("C:\\temporal\\archivo.txt");
			FileReader fr = new FileReader(f);
			BufferedReader bf = new BufferedReader(fr);
			System.out.println("Contenido:\n");
			while((linea = bf.readLine())!= null) {
				System.out.println(linea);
			}
			System.out.println("\nFin del contenido");
		} catch(Exception ex) {
			System.out.println("Ocurrió un problema para leer el archivo");
		}
	}
}
