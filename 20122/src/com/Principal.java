package com;
import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Object[] arregloObjeto = new Object[6];
		
		String valor = "", cadena = "";
		int i = 0, c = 0, numEnt = 0;
		double numeros = 0.0, numD = 0.0;
		boolean valBool = false;
		
		for(i = 0 ; i < arregloObjeto.length ; i++) {
			System.out.println("Ingrese el valor "+(i+1));
			valor = entrada.next();
			switch(valor) {
			case "true":
			case "false":
				valBool = Boolean.parseBoolean(valor);
				System.out.println("Boolean: "+valBool);
				arregloObjeto[i] = valBool;
				break;
			default:
				try {
					numEnt = Integer.parseInt(valor);
					System.out.println("Entero: "+numEnt);
					arregloObjeto[i] = numEnt;
					numeros += numEnt;
				} catch(Exception exe2) {
					try {
						numD = Double.parseDouble(valor);
						System.out.println("Double "+numD);
						arregloObjeto[i] = numD;
						numeros += numD;
					} catch(Exception exe3) {
						System.out.println("Cadena: "+valor);
						arregloObjeto[i] = valor;
						cadena += valor;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(arregloObjeto));
		System.out.println("Numeros sumados:"+numeros);
		System.out.println("Cadena concatenada :"+cadena);
		
		entrada.close();
	}

}
