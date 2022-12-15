package dpat_refined;
public class PaymentByCreditCard implements Payment{
	
	
		  public void pay(double amount) {
		    System.out.println("Paying with credit card: $" + amount);
		  }
}
