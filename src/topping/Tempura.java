package topping;

import java.util.ArrayList;

public class Tempura extends Topping{
	
	@Override 
	public ArrayList<String> addTops(ArrayList<String> currentToppings){
		currentToppings.add("Tempura");
		 System.out.println("added Tempura");
		return currentToppings;
	}
	
	@Override 
	public double addPrice(double price) {
		  price += 10.00;
		  return price;
		}

}
