package topping;

import java.util.ArrayList;

public class CharSiu extends Topping{
	
	@Override 
	public ArrayList<String> addTops(ArrayList<String> currentToppings){
		currentToppings.add("CharSiu");
		 System.out.println("added Charsiu");
		return currentToppings;
	}
	
	@Override 
	public double addPrice(double price) {
		  price += 15.00;
		  return price;
		}

}
