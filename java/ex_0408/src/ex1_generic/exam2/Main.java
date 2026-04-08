package ex1_generic.exam2;

public class Main {
	public static void main(String[] args) {
		
		PaymentProcessor<KakaoPay> pay2 = 
				new PaymentProcessor<KakaoPay>(new KakaoPay());
		PaymentProcessor<CardPaument> pay1 = 
				new PaymentProcessor<CardPaument>(new CardPaument());
		
		
		pay1.process();
		pay2.process();
		
	}
}
