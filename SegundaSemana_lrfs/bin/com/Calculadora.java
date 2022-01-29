package com;

class Calculadora {
	private double a=0;
	private double b=0;
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double getSum() {
		return a + b;
	}
	
	public double getSustract() {
		return a - b;
	}
	
	public double getMult() {
		return a * b;
	}
	
	public double getDivision() {
		return a / b;
	}
	
}
