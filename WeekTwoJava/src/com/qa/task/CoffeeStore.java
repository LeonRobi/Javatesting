package com.qa.task;

public class CoffeeStore {
	
	public String name;
	public String size;
	public boolean milk;
	public String extras;
	public int orderID = 0;
	
	public CoffeeStore(String name, String size, boolean milk, String extras) {
		super();
		this.name = name;
		this.size = size;
		this.milk = milk;
		this.extras = extras;
		this.extras += 1; 
	}

	@Override
	public String toString() {
		return "CoffeeClass [name=" + name + ", size=" + size + ", milk=" + milk + ", extras=" + extras + "]";
	}
	
	

}
