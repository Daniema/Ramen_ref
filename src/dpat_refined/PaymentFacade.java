package dpat_refined;

import java.util.Scanner;

public class PaymentFacade implements Payment {
	 private Payment payment;
	 
	 public PaymentFacade(String paymentMethod, double amount) {
		    Pay(paymentMethod);
		    pay(amount);
		  }
	  
	  public void Pay(String paymentMethod) {
	    if (paymentMethod.equalsIgnoreCase("cash")) {
	      payment = new PaymentByCash();
	    } else if (paymentMethod.equalsIgnoreCase("credit card")) {
	      payment = new PaymentByCreditCard();
	    }
	  }
	  
	  public void pay(double amount) {
	    payment.pay(amount);
	  }

		
}

	


	