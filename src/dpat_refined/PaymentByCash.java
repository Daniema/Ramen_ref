package dpat_refined;
public class PaymentByCash implements Payment {
	
	 @Override
	  public void pay(double amount) {
	    System.out.println("Paying with cash: $" + amount);
	  }

}
