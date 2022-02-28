package com.qa.oop;

public class PizzaOrder {
	
	
	public String pizzaName;
	public String size;
	public boolean extracheese;
	public boolean vegancheck;	
	public static String base = "Tomato";
	public static int pizzaID = 0; 
	
	public PizzaOrder(String pizzaNameParam, String sizeParam, boolean extracheeseParam, boolean vegancheckParam) {

		this.pizzaName = pizzaNameParam;
		this.size = sizeParam;
		this.extracheese = extracheeseParam;
		this.vegancheck = vegancheckParam;
		pizzaID += 1;
		
	}
	

	@Override
	public String toString() {
		return "PizzaOrder [pizzaName=" + pizzaName + ", size=" + size + ", extracheese=" + extracheese
				+ ", vegancheck=" + vegancheck + "]";
	}

	public static void cookPizza(int cookingTime) {
		System.out.println("Pizza in the oven");
		System.out.println("Pizza in the oven for: " + cookingTime);
		
	}
	
}


// static variables are the same across all objects, changing one chanes all.
