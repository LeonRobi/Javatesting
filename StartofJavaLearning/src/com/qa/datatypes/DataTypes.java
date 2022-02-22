package com.qa.datatypes;

public class DataTypes {
	
	// String = text
	// int = whole number
	// boolean = true/false
	// float = decimal (1.25f)
	// char = single char ("A")
	// double = large decimal number (3.1425927195910)
	
	public static String returnStr() {	
		return "50";
		
	}

	public static int returnInt() {
		return 123;
	}
	
	public static boolean returnBool() {
		return true;
	}

	
	public static String stringnumber = "100";
	public static int number1 = Integer.parseInt(stringnumber);
	
	public static int numberstring = 99;
	public static String string1 = Integer.toString(numberstring);
	
	public static String stringfloat = "55.55";
	public static float floating = Float.parseFloat(stringfloat);
		
		
	public static int testtest() {
		int number = Integer.parseInt(stringnumber) % 3;
		return number;
	}
	
	
	public static boolean truefalseBool() {
		boolean bool = true;
		return !bool;
	}
}
	