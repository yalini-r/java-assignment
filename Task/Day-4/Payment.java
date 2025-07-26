//super class
class CardPayment{
	
   double makeCardPayment(){
		System.out.println("Card payment is successful");
	}
}

//super class
class UpiPayment{
	
  double makeUpiPayment(){
		System.out.println("Upi payment is successful");
	} 


}

//subclass  --> one class can't extends two super class at a time using extends 
public class Payment extends CardPayment , UpiPayment{
	
	public static void main(String[] args){
	Payment p = new Payment();
	
	p.makeCardPayment();
	p.makeUpiPayment();
	
	}
}