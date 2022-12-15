package dpat_refined;

import java.util.Scanner;

import Ramen.LargeRamen;
import Ramen.NormalRamen;
import Ramen.ramen;
import topping.CharSiu;
import topping.FriedTofu;
import topping.Tempura;
import topping.Topping;


public class OrderDetails {
	
	public static void main(String[] args) {
	
	
		ramen newramen = new NormalRamen();
		
 	   System.out.println("select your Ramen order !");
 	 
 		   
 		   boolean sizeIsValid = false; 
 		   do {
		    	   System.out.println("select size: " + '\n' + "1. Normal" + '\n' + "2. Large");
		    	   Scanner sizeScan= new Scanner(System.in);
		    	   String  size = sizeScan.next();
		    	   
		    	   if(size.trim().equals("1")) {
		    		   newramen = new NormalRamen();
		    		   newramen =  newramen.setSize( newramen);
		    		   newramen.totalPrice =  newramen.Cost();
		    		   sizeIsValid  = true;
		    	   }else if(size.trim().equals("2")) {
		    		   newramen = new LargeRamen();
		    		   newramen =  newramen.setSize( newramen);
		    		   newramen.totalPrice =  newramen.Cost();
		    		   sizeIsValid  = true;
		    	   }else {
		    		   sizeIsValid = false;
		    			System.out.println("Invalid Input. Please Try Again.");
		    	   }
	    	   
 		   }while(sizeIsValid == false);
	    	   
 		   
 		   boolean toppingIsValid = false; 
 		   do {
		    	   System.out.println("select your topping: "+ '\n' + "1. Charsiu" +
		   				'\n' + "2. Tempura" + '\n' + "3. Fried Tofu" + '\n' + "4. done");
		    	   Scanner Tinput= new Scanner(System.in);
		    	   String  topp = Tinput.next();
		    	   
		    	   if(topp.trim().equals("1")) {
		    		   Topping tops = new CharSiu();
		    		   
		    		   newramen.toppings = tops.addTops(newramen.toppings);
		    		   newramen.totalPrice = tops.addPrice(newramen.totalPrice);
		    		   
		
		    	   }else if(topp.trim().equals("2")) {
		    		   Topping tops = new Tempura();

		    		   newramen.toppings = tops.addTops(newramen.toppings);
		    		   newramen.totalPrice = tops.addPrice(newramen.totalPrice);
		    		   
		    	   }else if(topp.trim().equals("3")){	
		    		   
		    		   Topping tops = new FriedTofu();			    		  
		    		   newramen.toppings = tops.addTops(newramen.toppings);
		    		   newramen.totalPrice = tops.addPrice(newramen.totalPrice);

		    	   }else if(topp.trim().equals("4")) {
		    		   break;
		    	   }
		    	   else {
		    		   toppingIsValid = false;
		    		   System.out.println("Invalid input!");
		    	   }
		    	   
		    	   
		    	   System.out.println("Current Total: " + newramen.totalPrice );
	    	   
 		   }while(toppingIsValid == false);	
 		   
 		  
 		  System.out.println("Enter your payment method (cash or credit card): ");
 		  Scanner pinput = new Scanner(System.in);
 		  String paymen = pinput.nextLine();
 		 
 		 System.out.println("Enter the amount: ");
 	     Scanner Minput = new Scanner(System.in);
 	     double amount = Minput.nextDouble();
 		  
 		 
 		 PaymentFacade p = new  PaymentFacade(paymen, amount); 
 		 p.pay(amount);
 		 
 		 
		    		   
		 }
    
}


