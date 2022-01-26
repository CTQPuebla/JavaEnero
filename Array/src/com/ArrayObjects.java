package com;

public class ArrayObjects {
	
	public static void main(String[] args) {
		Object[] arrayObjeto = new Object[11];
int suma=0;
String cadena="";
		arrayObjeto[0] = "5";
		arrayObjeto[1] = "n";
		arrayObjeto[2] = 3;
		arrayObjeto[3] ='p';
		arrayObjeto[4] = '6';
		arrayObjeto[5] = true;
		arrayObjeto[6] = " ";
		arrayObjeto[7] = 1;
		arrayObjeto[8] = "hola";
		arrayObjeto[9] = "n";
		arrayObjeto[10] = "n";
		for (int i = 0; i < arrayObjeto.length; i++) {
		try {
			String let=arrayObjeto[i].toString();
			int num=Integer.parseInt(let);
			suma=suma+num;
		}catch(Exception ex) {
			cadena=cadena+arrayObjeto[i];
		}}
		System.out.println(suma);
		System.out.println(cadena);
	}

}
