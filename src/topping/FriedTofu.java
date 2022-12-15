package topping;

import java.util.ArrayList;

public class FriedTofu extends Topping {
	
	@Override 
	public ArrayList<String> addTops(ArrayList<String> currentToppings){
		currentToppings.add("FriedTofu");
		 System.out.println("added FriedTofu");
		return currentToppings;
	}
	
	@Override 
	public double addPrice(double price) {
		  price += 5.00;
		  return price;
		}

}
