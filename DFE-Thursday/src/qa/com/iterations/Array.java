package qa.com.iterations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Array {
	
	static ArrayList<String> coffeArray = new ArrayList<>();

	

	public static void arrayExample() {
		String[] dinner = {"Chicken and Bacon pasta", "Cod with small potatoes"
				, "Chicken en croute", "Stir Fry"};
		// System.out.println(dinner[1]);
		
		// int[] numArray = {44, 11, 430, 7, 10, 99, 36, 210, 7, 13};
		
		// for printing out everything, would work if i < 2 or something
		/// for(int i = 0; i < dinner.length; i++) {
			/// System.out.println(dinner[i]);
		/// }
		
		
		// meal = [0] dinner and repeats 
		/// for(String meal : dinner) {
			/// System.out.println(meal);
			
		System.out.println(dinner[new Random().nextInt(dinner.length)]);
		
		}
	
	public static void pizzaShop() {
		
		ArrayList<String> pizzaArray = new ArrayList<>();
		
		pizzaArray.add("Pepperoni");
		pizzaArray.add("Mushroom");
		pizzaArray.add("Pepper");
		pizzaArray.add("Sweetcorn");
		
		pizzaArray.remove("Sweetcorn");
		
		pizzaArray.set(2, "Sweet Pepper");
		
		for(String pizza: pizzaArray) {
			System.out.println(pizza);
		}
		
		System.out.println(pizzaArray);
	}
	
//	public static void coffeShop() {
//		ArrayList<String> coffeArray = new ArrayList<>();
//		
//		coffeArray.add("Espresso");
//		coffeArray.add("Cold Brew");
//		coffeArray.add("Cappucion");
//		coffeArray.add("Americano");
//		coffeArray.add("Iced Latte");
//		
//		coffeArray.set(4, "Latte");
		
		// Scanner - Ask if you would like small, medium, large
		// could add If statements -  small offer same selection of drinks
		// Scanner - ask if you'd like milk
		// would you like 
//		Scanner size = new Scanner(System.in);
//		System.out.println("Please enter your drink size 'small' 'medium' or 'large': ");
//		String sizes = size.nextLine();
//		System.out.println("Your size is " + sizes);
//		
//		// should be new methods 
//		
//		Scanner drink = new Scanner(System.in);
//		System.out.println("Please enter your drink choice: " + coffeArray);
//		String drinks = drink.nextLine();
//		System.out.println("Your drink choice is a " + sizes + " " + drinks);
//		
//		// sorting alphabetically
////		Collections.sort(coffeArray, String.CASE_INSENSITIVE_ORDER);
////		System.out.println(coffeArray);
////		}
//	
	public static void addItem() {
		Scanner firstscan = new Scanner(System.in);
		System.out.println("Please add your new item: ");
		String addition = firstscan.nextLine();
		System.out.println("You've added " + addition + " to your stock list");
		
		coffeArray.add(addition);
	}
	
	public static void printarray() {
		System.out.println(coffeArray);
	}
	
}
	

