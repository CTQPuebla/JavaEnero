package com;

public class PrimitivosAObjetos {
	
	public static void main(String[] args) {
		char primitiveChar = 'a';
		Character objectChar = new Character(primitiveChar);
		System.out.println("primitiveChar = " + primitiveChar);
		System.out.println("Character wrapper contiene: " + objectChar);
		
		System.out.println();
		byte primitiveByte = 127;
		Byte objectByte = new Byte(primitiveByte);
		System.out.println("primitiveByte = " + primitiveByte);
		System.out.println("Byte wrapper contiene: " + objectByte);
		
		System.out.println();
		short primitiveShort = 32767;
		Short objectShort = new Short(primitiveShort);
		System.out.println("primitiveShort = " + primitiveShort);
		System.out.println("Short wrapper contiene: " + objectShort);
		
		System.out.println();
		int primitiveInt = (int)(Math.pow(2, 31)+2);
		Integer objectInt = new Integer(primitiveInt);
		System.out.println("primitiveInt = " + primitiveInt);
		System.out.println("Integer wrapper contiene: " + objectInt);
		
		System.out.println();
		long primitiveLong = (long)Math.pow(2, 63);
		Long objectLong = new Long(primitiveLong);
		System.out.println("primitiveLong = " + primitiveLong);
		System.out.println("Long wrapper contiene: " + objectLong);
		
		System.out.println();
		float primitiveFloat = Float.MAX_VALUE;
		Float objectFloat = new Float(primitiveFloat);
		System.out.println("primitiveFloat = " + primitiveFloat);
		System.out.println("Float wrapper contiene: " + objectFloat);
		
		System.out.println();
		double primitiveDouble = Double.MAX_VALUE;
		Double objectDouble = new Double(primitiveDouble);
		System.out.println("primitiveDouble = " + primitiveDouble);
		System.out.println("Double wrapper contiene: " + objectDouble);
		
		System.out.println();
		boolean primitiveBoolean = false;
		Boolean objectBoolean = new Boolean(primitiveBoolean);
		System.out.println("primitiveBoolean = " + primitiveBoolean);
		System.out.println("Boolean wrapper contiene: " + objectBoolean);
	}
}
