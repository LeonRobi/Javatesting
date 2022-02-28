package qa.com.runner;

import com.qa.task.CoffeeStore;
import com.qa.task.orderList;

//import com.qa.oop.CakeTin;
//import com.qa.oop.PizzaOrder;

public class Runner {
	
	public static void main(String[] args) {
		
		
//		CakeTin firstOrder = new CakeTin("Lemon", 2, false, false);
//		
//		System.out.println(firstOrder.flavour);
//		
//		PizzaOrder pizzaOrder = new PizzaOrder("Meat Feast", "L", true, false);
//		
//		PizzaOrder pizzaOrder2 = new PizzaOrder("Vegi", "M", true, true);
//
//		
//		
//		System.out.println(pizzaOrder.pizzaName);
//		System.out.println(pizzaOrder2.size);
//		System.out.println(pizzaOrder2);
//		PizzaOrder.cookPizza(5);
//		System.out.println(pizzaOrder.pizzaID);
		
		orderList neworderList = new orderList();
			
		CoffeeStore firstOrder = new CoffeeStore("Latte", "L", true, "No extra");
		System.out.println(firstOrder);
		
		CoffeeStore secondOrder = new CoffeeStore("Hot Chocolate", "S", true, "No extra");
		System.out.println(secondOrder);
		
		neworderList.addCoffee(firstOrder);
		neworderList.addCoffee(secondOrder);
		
		neworderList.printCoffeeArray();
}
}

