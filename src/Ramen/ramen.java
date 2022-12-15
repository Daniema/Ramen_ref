package Ramen;

import java.util.ArrayList;
import java.util.Scanner;

import topping.CharSiu;
import topping.FriedTofu;
import topping.Tempura;
import topping.Topping;



public abstract class ramen {

	public String size;
	public ArrayList<String> toppings = new ArrayList<String>();
	public double totalPrice;

	public abstract double Cost();

	public abstract ramen setSize(ramen currentramen);
	

	

}
