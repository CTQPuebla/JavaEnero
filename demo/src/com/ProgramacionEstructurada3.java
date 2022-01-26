package com;

public class ProgramacionEstructurada3 {

	public static void main(String[] args) {
		int[] intArr = new int[15];
		for(int i = 0; i<15 ; i++) {
			int random = (int)(Math.floor(Math.random()*100));
			intArr[i] = random;
			if(i==14) {
				System.out.print(intArr[i]);
				break;
			}
			System.out.print(intArr[i] + ", ");
		}
		System.out.println();
		
		int oddSum = 0;
		int evenCount = 0;
		for(int n: intArr) {
			if(n%2==1) {
				oddSum += n;
			} else {
				evenCount++;
			}
		}
		System.out.println("La suma de los impares es: " + oddSum);
		System.out.println("Hay un total de " + evenCount + " numeros pares");
	}

}
