package Interface;

interface Payment {
	 abstract void  processPayment();
	 
}


class CreditCardPayment implements Payment{

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println(" i am from Card Payment");
	}
	
}

class UPIPayment implements Payment{
	
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println(" i am from UPI Payment");
	}
	
}


public class TestInterface {
	public static void main(String[] args) {
		CreditCardPayment ccp = new CreditCardPayment();
		ccp .processPayment();
		
		UPIPayment upi = new UPIPayment();
		upi.processPayment();
		
     ///
     ///
     ///
     ///
     ///
     ///
     ///		
		Payment p;
		
		p= new CreditCardPayment();
		
		p.processPayment();
		
		p= new UPIPayment();
		
		p.processPayment();
		
		
	}

}
