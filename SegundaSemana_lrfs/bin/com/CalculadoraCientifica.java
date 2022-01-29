package com;

import java.util.InputMismatchException;
import java.util.Scanner;

class CalculadoraCientifica extends Calculadora {
	public double getPow() {
		return Math.pow(super.getA(), super.getB());
	}
	
	public double getRoot() {
		return Math.pow(super.getA(), 1/super.getB());
	}
	
	public double getSen() {
		double arg = getA() * Math.PI / 180;
		return Math.sin(arg);
	}
	
	public double getCos() {
		double arg = getA() * Math.PI / 180;
		return Math.cos(arg);
	}
	
	public double getTan() {
		double arg = getA() * Math.PI / 180;
		return Math.tan(arg);
	}
	
	public double getSec() {
		double arg = getA() * Math.PI / 180;
		return 1 / Math.sin(arg);
	}
	
	public double getCsc() {
		double arg = getA() * Math.PI / 180;
		return 1 / Math.cos(arg);
	}
	
	public double getCot() {
		double arg = getA() * Math.PI / 180;
		return 1 / Math.tan(arg);
	}
	
	public static void main(String[] args) {
		CalculadoraCientifica calc = new CalculadoraCientifica();
		int input=0, calcChosen=0;
		double booleanInt=0, aHolder, bHolder;
		boolean startOver = true;
		while(startOver) {
			Scanner entry= new Scanner(System.in);
			do {
				try {
					System.out.println(
							"Seleccione su calculadora\n"
							+ "1: basica "
							+ "2: cientifica "
							);
					calcChosen = entry.nextInt();
					if(calcChosen>=3 || calcChosen<=0) {
						System.out.println("Por favor seleccione una opcion valida");
					}
				} catch(InputMismatchException err) {
					System.out.println("Por favor seleccione una opcion valida");
					entry = new Scanner(System.in);
				}
			} while(calcChosen>=3 || calcChosen<=0);
			switch(calcChosen) {
			case 1:
				System.out.println(
						"Seleccione su operacion\n"
						+ "1: sumar "
						+ "2: restar "
						+ "3: multiplicar "
						+ "4: dividir"
						);
				input = entry.nextInt();
				while(input>=5 || input<=0) {
					System.out.println("La opcion seleccionada no es valida, seleccione una apropiada");
					input = entry.nextInt();
				};
				System.out.println("Introdusca el primer valor");
				aHolder = entry.nextDouble();
				calc.setA(aHolder);
				System.out.println("Introdusca el segundo valor");
				bHolder = entry.nextDouble();
				calc.setB(bHolder);
				switch(input) {
				case 1:
					System.out.println("Seleccionó la suma de los valores");
					System.out.println("El resultado es: " + calc.getSum());
					break;
				case 2:
					System.out.println("Seleccionó la resta de los valores");
					System.out.println("El resultado es: " + calc.getSustract());
					break;
				case 3:
					System.out.println("Seleccionó la multiplicación de los valores");
					System.out.println("El resultado es: " + calc.getMult());
					break;
				case 4:
					System.out.println("Seleccionó la division de los valores");
					while(calc.getB()==0) {
						System.out.println("Por favor seleccione otro valor para su divisor");
						bHolder = entry.nextDouble();
						calc.setB(bHolder);
					}
					System.out.println("El resultado es: " + calc.getDivision());
					break;
				default:
					System.out.println("La operacion seleccionada no es valida");
				}
			break;
				
			case 2:
				System.out.println(
						"Seleccione su operacion\n"
						+ "1: potencia "
						+ "2: raiz "
						+ "3: sen(a) "
						+ "4: cos(a) "
						+ "5: tan(a) "
						+ "6: cot(a) "
						+ "7: csc(a) "
						+ "8: sec(a) "
						);
				input = entry.nextInt();
				while(input>=9 || input<=0) {
					System.out.println("La opcion seleccionada no es valida, seleccione una apropiada");
					input = entry.nextInt();
				};
				switch(input) {
				case 1:
					System.out.println("Seleccionó elevar un numero a una potencia");
					System.out.println("Introdusca la base");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("Introdusca la potencia");
					bHolder = entry.nextDouble();
					calc.setB(bHolder);
					System.out.println("El resultado es: " + calc.getPow());
					break;
				case 2:
					System.out.println("Seleccionó obtener la raiz n de un numero");
					System.out.println("Introdusca la base");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("Introdusca la raiz enesima");
					bHolder = entry.nextDouble();
					calc.setB(bHolder);
					System.out.println("El resultado es: " + calc.getRoot());
					break;
				case 3:
					System.out.println("Seleccionó obtener el seno de un numero");
					System.out.println("Introdusca el argumento");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("El resultado es: " + calc.getSen());
					break;
				case 4:
					System.out.println("Seleccionó obtener el coseno de un numero");
					System.out.println("Introdusca el argumento");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("El resultado es: " + calc.getCos());
					break;
				case 5:
					System.out.println("Seleccionó obtener la tangente de un numero");
					System.out.println("Introdusca el argumento");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("El resultado es: " + calc.getTan());
					break;
				case 6:
					System.out.println("Seleccionó obtener la cotangente de un numero");
					System.out.println("Introdusca el argumento");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("El resultado es: " + calc.getCot());
					break;
				case 7:
					System.out.println("Seleccionó obtener la cosecante de un numero");
					System.out.println("Introdusca el argumento");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("El resultado es: " + calc.getCsc());
					break;
				case 8:
					System.out.println("Seleccionó obtener la secante de un numero");
					System.out.println("Introdusca el argumento");
					aHolder = entry.nextDouble();
					calc.setA(aHolder);
					System.out.println("El resultado es: " + calc.getSec());
					break;
				default:
					System.out.println("La operacion seleccionada no es valida");
				}
			break;
			}
			
			System.out.println("¿Desea realizar otra operacion? 1: Si 2: No");
			booleanInt = entry.nextInt();
			while(booleanInt<1 || booleanInt>2) {
				System.out.println("La opcion seleccionada no es valida, seleccione una apropiada");
				booleanInt = entry.nextInt();
			}
			if(booleanInt!=1) {
				startOver = false;
			}
			entry.close();
		}
		System.out.println("Fin de la operacion!");
	}
}