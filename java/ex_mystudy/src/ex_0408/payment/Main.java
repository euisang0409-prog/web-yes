package ex_0408.payment;

public class Main {
	public static void main(String[] args) {
		
		PaymentProcessor <CardPayment> p1 =
				new PaymentProcessor <>(new CardPayment());
		PaymentProcessor <KakaoPay> p2 =
				new PaymentProcessor <>(new KakaoPay());	
		
		
		p1.process();
		p2.process();
		
		
	}
}
