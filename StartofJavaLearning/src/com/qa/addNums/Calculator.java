package com.qa.addNums;

public class Calculator {

	public static int addParams(int number1, int number2) {
		
		int sum = number1 + number2;
		return sum;
	}
	
	
	public static void helloWorld(String name) {
		System.out.println("Hello World, my name is " + name);
	}
	
	public static boolean isRed(String colour) {
		if(colour == "red") {
			return true;
		}
		else {
			return false;
	}
	}
	
	
	public static int timesParams(int number1, int number2) {
		
		int sum = number1 * number2;
		return sum;
	}
	
	public static void evenOddParams(int number1) {
		
		int sum = number1 % 2;
				if(sum == 0) {
					System.out.println("Your number is Even");
				}
				else {
					System.out.println("Your number is Odd");
				}
				}
				
		public static boolean trueFalseevenOddParams(int number1) {
			
			int sum = number1 % 2;
					if(sum == 0) {
						return true;
					}
					else {
						return false;
					}
					}
									
	}


