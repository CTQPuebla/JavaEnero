package com;

import java.util.*;

public class AObjeto {
	public static void main(String[] args) {
		Object[] arrayObject = new Object[20];
		int suma=0,entero;
		String cad="";
		
		arrayObject[0]='k';
		arrayObject[1]=30;
		arrayObject[2]="t";
		arrayObject[3]=14.3;
		arrayObject[4]=true;
		arrayObject[5]=0.5;
		arrayObject[6]="h";
		arrayObject[7]="hope";
		arrayObject[8]=19;
		arrayObject[9]="12";
		arrayObject[10]='7';
		arrayObject[11]="jin";
		arrayObject[12]="t";
		arrayObject[13]="2.4";
		arrayObject[14]=26;
		arrayObject[15]='a';
		arrayObject[16]="h";
		arrayObject[17]="27";
		arrayObject[18]="e";
		arrayObject[19]=2;
		
		try {
			for(int i=0;i<arrayObject.length;i++) {
				entero = Integer.parseInt(arrayObject[9].toString());
				System.out.println(entero);
			}
		}catch(Exception ex) {
			System.out.println("Error");
		}
		
		
//		System.out.println(Arrays.toString(arrayObject));
	}
}
