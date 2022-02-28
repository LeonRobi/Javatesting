package com.qa.task;

import java.util.ArrayList;

public class orderList {

	public ArrayList<CoffeeStore> coffee = new ArrayList<>();
	
	public void addCoffee(CoffeeStore newCoffee) {
		
		coffee.add(newCoffee);
		
	}
	
	public void printCoffeeArray() {
		System.out.println(coffee);
	}
	
}
	
