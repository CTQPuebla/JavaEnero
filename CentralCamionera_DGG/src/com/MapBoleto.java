package com;

public class MapBoleto {
	
	
	Object num1,num2,num3,num4,num5;

	public MapBoleto(Object num1, Object num2, Object num3, Object num4, Object num5) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
	}

	public Object getNum1() {
		return num1;
	}

	public void setNum1(Object num1) {
		this.num1 = num1;
	}

	public Object getNum2() {
		return num2;
	}

	public void setNum2(Object num2) {
		this.num2 = num2;
	}

	public Object getNum3() {
		return num3;
	}

	public void setNum3(Object num3) {
		this.num3 = num3;
	}

	public Object getNum4() {
		return num4;
	}

	public void setNum4(Object num4) {
		this.num4 = num4;
	}

	public Object getNum5() {
		return num5;
	}

	public void setNum5(Object num5) {
		this.num5 = num5;
	}

	@Override
	public String toString() {
		return "MapBoleto [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5
				+ "]";
	}

	
}
